package com.jem.musicapp.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("music")
public class MusicController {

	@ApiOperation(value = "根据音乐id获取音乐")
	@GetMapping("get")
	public String getMusicById(){

		return "122456";
	}
}
