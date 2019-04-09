package com.jem.musicservice.po;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.sql.Timestamp;

/**
 * 基础po，聚合公共字段
 *
 * @author jem
 * @create 2019-04-09 下午8:43
 **/
@MappedSuperclass
@Data
public abstract class BasePo {

    @Id
    private String id;

    /**
     * 是否删除
     */
    @Column(name = "is_delete", length = 1)
    private boolean delete;

    private Timestamp createDate = new Timestamp(System.currentTimeMillis());

    private Timestamp updateDate = new Timestamp(System.currentTimeMillis());
}
