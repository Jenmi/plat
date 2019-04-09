package com.jem.musicservice.po;


import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@ToString
@Entity
@Table(name = "plat_music")
public class MusicPo extends BasePo{
	private String id;
	private String name;
	private String singerName;
	private String specialName;
	private String url;
	private String imgUrl;
}
