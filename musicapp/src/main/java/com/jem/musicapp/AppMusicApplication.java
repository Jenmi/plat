package com.jem.musicapp;

import com.didispace.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication/*(scanBasePackages = {
	"com.jem.musicapp.controller",
	"com.jem.musicservice.service",
	"com.jem.musicapp.config",
	"com.jem.musicservice.entities",
})*/
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@EnableSwagger2Doc
@MapperScan("com.jem.musicapp.mapper")
public class AppMusicApplication {
	public static void main(String[] args){
		SpringApplication.run(AppMusicApplication.class,args);
	}
}
