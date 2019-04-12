package com.jem.musicapp.service.imp;

import com.jem.musicapp.entities.Music;
import com.jem.musicapp.mapper.MusicMapper;
import com.jem.musicapp.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Jem on ${DATA} 13:48
 */
@Service
public class MusicServiceImp implements MusicService {
	@Autowired
	private MusicMapper musicMapper;

	@Override
	public List<Music> getMusicList() {
		return musicMapper.selectAll();
	}

	@Override
	public Music findById() {
		return null;
	}

	@Override
	public void insert() {

	}
}
