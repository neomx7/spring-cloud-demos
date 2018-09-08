#springCloud demo

## config-server 

###  组件图 (来自https://blog.csdn.net/mazhen1991/article/details/78513452)

![](http://pdyhdo34u.bkt.clouddn.com/spring-config-server.png)


###   访问地址，可以有多种
- http://localhost:12360/config-client.yml
    
        foo: bar version 3
        info:
          profile: default
    
- http://localhost:12360/config-client/master

        <Environment>
        <name>config-client</name>
        <profiles>
        <profiles>master</profiles>
        </profiles>
        <label/>
        <version>60f4f773844faa9365fe6d0258251a025eaa009f</version>
        <state/>
        <propertySources>
        <propertySources>
        <name>https://github.com/neomx7/config-server/config-client.yml</name>
        <source>
        <info.profile>default</info.profile>
        <foo>bar version 3</foo>
        </source>
        </propertySources>
        </propertySources>
        </Environment>
        

- http://localhost:12360/config-client/dev/master
        
        <Environment>
        <name>config-client</name>
        <profiles>
        <profiles>dev</profiles>
        </profiles>
        <label>master</label>
        <version>60f4f773844faa9365fe6d0258251a025eaa009f</version>
        <state/>
        <propertySources>
        <propertySources>
        <name>https://github.com/neomx7/config-server/config-client-dev.yml</name>
        <source>
        <info.profile>dev</info.profile>
        <foo>bar version dev3</foo>
        </source>
        </propertySources>
        <propertySources>
        <name>https://github.com/neomx7/config-server/config-client.yml</name>
        <source>
        <info.profile>default</info.profile>
        <foo>bar version 3</foo>
        </source>
        </propertySources>
        </propertySources>
        </Environment>

- 支持的 http 请求地址和资源文件映射如下:
    
        /{application}/{profile}[/{label}]
        /{application}-{profile}.yml
        /{label}/{application}-{profile}.yml
        /{application}-{profile}.properties
        /{label}/{application}-{profile}.properties
 
 
###  注意事项
- 需要配置rabbitmq 作为 spring-cloud-bus (参见第一幅图) ;以便server发送配置更新的event消息到各个client