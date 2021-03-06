package com.search.cap.main.entity;

import java.io.Serializable;

import javax.persistence.Entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

/**
 * 项目库附件
 */
@Getter
@Setter
@Entity
@DynamicInsert
@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor
@lombok.EqualsAndHashCode(callSuper = true)
public class Projectlibattachs extends com.search.cap.main.base.entity.BaseEntityWithStringId implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * SNAME
	 */
	private java.lang.String sname;
	/**
	 * SPATH
	 */
	private java.lang.String spath;
	/**
	 * SDATAID
	 */
	private java.lang.String sdataid;
	/**
	 * IORDER
	 */
	private java.lang.Integer iorder;
	/**
	 * 1:立项2:可研3:概算4:预算5:施工招投标
	 */
	private java.lang.Integer itype;
}