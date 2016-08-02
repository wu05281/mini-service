# mini-service
springBoot+jdbc+task集成样例

集成dubbo远程服务；
配置在dubboContext.xml中；
一个服务只能在某一端口注册一次，同一个zookeeper集群，可以通过不同的dubbo协议端口多次注册服务，配置如下:
<!-- 用dubbo协议在20880端口暴露服务 -->
<dubbo:protocol name="dubbo" port="20881" />
zookeeper集群配置：
<!--<dubbo:registry address="zookeeper://127.0.0.1:2181?backup=127.0.0.1:2182,127.0.0.1:2183" check="false" subscribe="false" register=""></dubbo:registry>
