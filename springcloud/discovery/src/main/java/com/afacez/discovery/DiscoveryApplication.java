package com.afacez.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 声明这是一个服务注册中心。
 */
@EnableEurekaServer
@SpringBootApplication
public class DiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryApplication.class, args);
    }

    /**
     * 忽略csrf验证。
     */
    /*@EnableWebSecurity
    static class WebSecurityConfigure extends WebSecurityConfigurerAdapter {
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            // 在/eureka/**端点忽略csrf验证
            http.csrf().ignoringAntMatchers("/eureka/**");
            // 配置使请求需要通过httpBasic或form验证
            http.authorizeRequests().anyRequest()
                    .authenticated()
                    .and()
                    .formLogin()
                    .and()
                    .httpBasic();
            super.configure(http);
        }
    }*/
}
