Seata 分布式事务

下载地址 https://github.com/seata/seata/releases

file.conf

```
## transaction log store, only used in seata-server
store {
  ## store mode: file、db、redis
  mode = "db"

  ## database store property
  db {
    ## the implement of javax.sql.DataSource, such as DruidDataSource(druid)/BasicDataSource(dbcp)/HikariDataSource(hikari) etc.
    datasource = "druid"
    ## mysql/oracle/postgresql/h2/oceanbase etc.
    dbType = "mysql"
    driverClassName = "com.mysql.cj.jdbc.Driver"
    url = "jdbc:mysql://192.168.164.128:3306/seata"
    user = "root"
    password = "123456"
    minConn = 5
    maxConn = 100
    globalTable = "global_table"
    branchTable = "branch_table"
    lockTable = "lock_table"
    queryLimit = 100
    maxWait = 5000
  }
}
```

registry.conf

```
registry {
  # file 、nacos 、eureka、redis、zk、consul、etcd3、sofa
  type = "nacos"
  loadBalance = "RandomLoadBalance"
  loadBalanceVirtualNodes = 10

  nacos {
    application = "seata-server"
    serverAddr = "127.0.0.1:8848"
    group = "SEATA_GROUP"
    namespace = ""
    cluster = "default"
    username = "nacos"
    password = "nacos"
  }

}

config {
  # file、nacos 、apollo、zk、consul、etcd3
  type = "nacos"

  nacos {
    serverAddr = "127.0.0.1:8848"
    namespace = ""
    group = "SEATA_GROUP"
    username = "nacos"
    password = "nacos"
  }
}
```

导入配置到nacos中

```
sh nacos-config.sh -h localhost -p 8848 -g SEATA_GROUP -t 465a28fb-e8f1-48ba-ae78-9dd9d77d166e -u nacos -w nacos
```

docker安装

```
docker run --name seata-server \
        -d -p 8091:8091 \
        -e SEATA_IP=192.168.164.128 \
        -e SEATA_PORT=8091 \
        -v /data/seata/conf/file.conf:/seata-server/resources/file.conf  \
        -v /data/seata/conf/registry.conf:/seata-server/resources/registry.conf  \
        seataio/seata-server
```