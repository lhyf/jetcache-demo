package org.lhyf.demo;

import org.lhyf.cache.annotation.EnableMethodCache;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
@MapperScan(basePackages = "org.lhyf.demo.mapper")
//@EnableCreateCacheAnnotation
//@EnableMethodCache(basePackages = "org.lhyf.demo")
@EnableMethodCache(region = "jetcache",expire = 30,timeUnit = TimeUnit.SECONDS)
@EnableCaching
public class JetcacheDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JetcacheDemoApplication.class, args);
    }
}
