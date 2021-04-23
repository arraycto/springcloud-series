nacos2.0

docker

```
docker pull nacos/nacos-server
```

```
docker run --env MODE=standalone --name nacos -d -p 8848:8848 -p 9848:9848 -p 9849:9849 -v /data/nacos/conf/application.properties:/home/nacos/conf/application.properties nacos/nacos-server
```

application.properties

```
server.servlet.contextPath=/nacos
server.port=8848

spring.datasource.platform=mysql
db.num=1
db.url.0=jdbc:mysql://192.168.164.128:3308/nacos?characterEncoding=utf8&connectTimeout=1000&socketTimeout=3000&autoReconnect=true&useUnicode=true&useSSL=false&serverTimezone=UTC
db.user.0=root
db.password.0=123456

db.pool.config.connectionTimeout=30000
db.pool.config.validationTimeout=10000
db.pool.config.maximumPoolSize=20
db.pool.config.minimumIdle=2

acos.naming.empty-service.auto-clean=true
nacos.naming.empty-service.clean.initial-delay-ms=50000
nacos.naming.empty-service.clean.period-time-ms=30000

management.metrics.export.influx.enabled=false

server.tomcat.accesslog.enabled=true

server.tomcat.accesslog.pattern=%h %l %u %t "%r" %s %b %D %{User-Agent}i %{Request-Source}i

server.tomcat.basedir=

nacos.security.ignore.urls=/,/error,/**/*.css,/**/*.js,/**/*.html,/**/*.map,/**/*.svg,/**/*.png,/**/*.ico,/console-ui/public/**,/v1/auth/**,/v1/console/health/**,/actuator/**,/v1/console/server/**

nacos.core.auth.system.type=nacos

nacos.core.auth.enabled=false

nacos.core.auth.default.token.expire.seconds=18000

nacos.core.auth.default.token.secret.key=SecretKey012345678901234567890123456789012345678901234567890123456789

nacos.core.auth.caching.enabled=true

nacos.core.auth.enable.userAgentAuthWhite=true

nacos.core.auth.server.identity.key=
nacos.core.auth.server.identity.value=

nacos.istio.mcp.server.enabled=false
```