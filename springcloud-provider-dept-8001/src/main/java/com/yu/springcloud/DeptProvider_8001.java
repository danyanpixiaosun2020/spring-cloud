package com.yu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author yuyantian
 * @date 2021/6/26
 * @description
 */
@SpringBootApplication
@EnableEurekaClient
public class DeptProvider_8001 {

  public static void main(String[] args) {
    SpringApplication.run(DeptProvider_8001.class,args);
  }
}
