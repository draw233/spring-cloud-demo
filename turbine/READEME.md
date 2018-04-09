##参数说明

* turbine.app-config参数指定了需要收集监控信息的服务名；

* turbine.cluster-name-expression 参数指定了集群名称为default，当我们服务数量非常多的时候，可以启动多个Turbine服务来构建不同的聚合集群，而该参数可以用来区分这些不同的聚合集群，同时该参数值可以在Hystrix仪表盘中用来定位不同的聚合集群，只需要在Hystrix Stream的URL中通过cluster参数来指定；

* turbine.combine-host-port参数设置为true，可以让同一主机上的服务通过主机名与端口号的组合来进行区分，默认情况下会以host来区分不同的服务，这会使得在本地调试的时候，本机上的不同服务聚合成一个服务来统计。
***

在完成了上面的内容构建之后，我们来体验一下Turbine对集群的监控能力。分别启动eureka-server、eureka-client、eureka-consumer-ribbon-hystrix、turbine以及hystrix-dashboard。访问Hystrix Dashboard，并开启对http://localhost:8989/turbine.stream的监控，这时候，我们将看到针对服务eureka-consumer-ribbon-hystrix`的聚合监控数据。
而此时的架构如下图所示：

![Alt text](http://blog.didispace.com/content/images/posts/spring-cloud-starter-dalston-5-2-2.png)
