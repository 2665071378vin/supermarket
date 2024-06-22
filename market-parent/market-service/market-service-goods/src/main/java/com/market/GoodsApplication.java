package com.market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * packageName com.market
 *
 * @author 你的名字
 * @version JDK 8
 * @className GoodsApplication (此处以class为例)
 * @date 2024/6/22 星期六
 * @description TODO
 */
@SpringBootApplication
@EnableDiscoveryClient()
public class GoodsApplication {
	public static void main(String[] args) {
		SpringApplication.run(GoodsApplication.class, args);
	}
}
