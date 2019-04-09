package com.jem.musicapp;

import com.didispace.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSwagger2Doc
public class AppMusicApplication {
	public static void main(String[] args){
		SpringApplication.run(AppMusicApplication.class,args);
	}
}
