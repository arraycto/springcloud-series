package com.cloud.flowable.handler;

/**
 * @description:
 * @author: dd-cat
 * @date:2021/4/22 15:48
 * @version:1.0
 */

import org.flowable.engine.delegate.TaskListener;
import org.flowable.task.service.delegate.DelegateTask;

public class ManagerTaskHandler implements TaskListener {

    @Override
    public void notify(DelegateTask delegateTask) {
        delegateTask.setAssignee("经理");
    }

}
