package com.jem.musicservice.entities;


import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@ToString
@Entity
@Table(name = "plat_music")
public class Music extends BasePo{

	@Column
	private String name;
	@Column
	private String singerName;
	@Column
	private String specialName;
	@Column
	private String url;
	@Column
	private String imgUrl;
}
