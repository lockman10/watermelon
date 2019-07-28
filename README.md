Spring Boot默认存放模板页面的路径在src/main/resources/templates或者src/main/view/templates，
这个无论是使用什么模板语言都一样，当然默认路径是可以自定义的

SpringBoot默认的几个静态页面的目录：
/static、
/public、
/resources 、
/META-INF/resources

整合jsp
1. 添加依赖
    <dependency>
        <groupId>org.apache.tomcat.embed</groupId>
        <artifactId>tomcat-embed-jasper</artifactId>
        <scope>provided</scope>
    </dependency>
    <dependency>
        <groupId>javax.servlet</groupId>
        <artifactId>jstl</artifactId>
    </dependency>
2. 建立目录
    /src/main/webapp/WEB-INF/jsp
3. 配置
spring:
  mvc:
    view:
      prefix: /WEB-INF/jsp/
      suffix: .jsp


