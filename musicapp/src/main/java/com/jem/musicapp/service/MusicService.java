package com.jem.musicapp.service;

import com.jem.musicapp.entities.Music;

import java.util.List;

/**
 * Created by Jem on 2019/4/12 0012 14:06
 */
public interface MusicService {

	List<Music> getMusicList();

	Music findById();

	void insert();
}
