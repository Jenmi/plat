package com.jem.musicapp.controller;

import com.jem.musicapp.entities.Music;
import com.jem.musicapp.service.MusicService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("music")
public class MusicController {

	@Autowired
	private MusicService musicService;
	@ApiOperation(value = "根据音乐id获取音乐")
	@GetMapping("get")
	public String getMusicById(){

		return "122456";
	}
	@ApiOperation(value = "获取所有音乐")
	@GetMapping("getMusicList")
	public List getMusicList(){
		List<Music> list = musicService.getMusicList();
		return list;
	}
}
