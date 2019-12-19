使用nacos配置中心进行相应配置
公司的开发环境
Data ID: user-service-config-dev.yaml
Group: DEFAULT_GROUP
配置内容
spring:
  application:
    name: user-service1
  main:
    allow-bean-definition-overriding: true
  jackson:
    time-zone: GMT+8
    date-format: yyyy-MM-dd HH:mm:ss
  cloud:
    nacos:
      discovery:
        server-addr: 192.168.31.251:8848
    sentinel:
      transport:
        dashboard: 192.168.31.251:8849

dubbo:
  protocol:
    name: dubbo
    port: -1
    serialization: kryo
  registry:
    address: nacos://192.168.31.251
    port: 8848

server:
  # ${random.int[9000,9999]} 随机端口
  port: 9012

management:
  endpoints:
    web:
      exposure:
        include: "*"
feign:
  sentinel:
    enabled: true

username: test

家里的环境
Data ID: user-service-config-home.yaml
Group: DEFAULT_GROUP
配置内容
spring:
  application:
    name: user-service1
  main:
    allow-bean-definition-overriding: true
  jackson:
    time-zone: GMT+8
    date-format: yyyy-MM-dd HH:mm:ss
  cloud:
    nacos:
      discovery:
        server-addr: 192.168.0.197:8848
    sentinel:
      transport:
        dashboard: 192.168.0.197:8849

dubbo:
  protocol:
    name: dubbo
    port: -1
    serialization: kryo
  registry:
    address: nacos://192.168.0.197
    port: 8848

server:
  # ${random.int[9000,9999]} 随机端口
  port: 9012

management:
  endpoints:
    web:
      exposure:
        include: "*"
feign:
  sentinel:
    enabled: true

username: home