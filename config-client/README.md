上述配置参数与Git中存储的配置文件中各个部分的对应关系如下：

    spring.application.name：对应配置文件规则中的{application}部分
    spring.cloud.config.profile：对应配置文件规则中的{profile}部分
    spring.cloud.config.label：对应配置文件规则中的{label}部分
    spring.cloud.config.uri：配置中心config-server的地址

这里需要格外注意：上面这些属性必须配置在bootstrap.properties中，这样config-server中的配置信息才能被正确加载。在完成了上面你的代码编写之后，读者可以将config-server-git、config-client都启动起来，然后访问http://localhost:2001/info ，我们可以看到该端点将会返回从git仓库中获取的配置信息：

*****
{
    "profile": "default"
}
*****
另外，我们也可以修改config-client的profile为dev来观察加载配置的变化。