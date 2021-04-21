package com.cloud.drools.util;

import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;
import org.drools.decisiontable.InputType;
import org.drools.decisiontable.SpreadsheetCompiler;
import org.kie.api.builder.Message;
import org.kie.api.builder.Results;
import org.kie.api.io.Resource;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.KieSession;
import org.kie.internal.io.ResourceFactory;
import org.kie.internal.utils.KieHelper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

/**
 * Drools工具
 */
@Slf4j
@UtilityClass
public class DroolsUtil {

    // 把xls文件解析为String
    public String getDRL (String realPath) throws FileNotFoundException {
        Resource resource = ResourceFactory.newClassPathResource(realPath);
        SpreadsheetCompiler compiler = new SpreadsheetCompiler();
        String drl = compiler.compile(resource, InputType.XLS);
        System.out.println(drl);
        return drl;
    }

    // drl为含有内容的字符串
    public KieSession createKieSessionFromDRL(String drl) throws Exception{
        KieHelper kieHelper = new KieHelper();
        kieHelper.addContent(drl, ResourceType.DRL);
        Results results = kieHelper.verify();
        if (results.hasMessages(Message.Level.WARNING, Message.Level.ERROR)) {
            List<Message> messages = results.getMessages(Message.Level.WARNING, Message.Level.ERROR);
            for (Message message : messages) {
                System.out.println("Error: "+message.getText());
            }
            // throw new IllegalStateException("Compilation errors were found. Check the logs.");
        }
        return kieHelper.build().newKieSession();
    }

    // realPath为Excel文件绝对路径
    public KieSession getKieSessionFromXLS(String realPath) throws Exception {
        return createKieSessionFromDRL(getDRL(realPath));
    }
}