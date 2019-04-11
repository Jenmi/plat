package com.jem.musicapp;

import com.didispace.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication/*(scanBasePackages = {
	"com.jem.musicapp.controller",
	"com.jem.musicapp.config",
	"com.jem.musicservice.entities",
})*/
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@EnableSwagger2Doc
//@MapperScan("com.jem.musicservice.mapper")
public class AppMusicApplication {
	public static void main(String[] args){
		SpringApplication.run(AppMusicApplication.class,args);
	}
}
