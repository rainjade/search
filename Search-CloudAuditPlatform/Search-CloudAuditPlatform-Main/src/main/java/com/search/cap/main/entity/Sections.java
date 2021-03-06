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
 * 标段
 */
@Getter
@Setter
@Entity
@DynamicInsert
@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor
@lombok.EqualsAndHashCode(callSuper = true)
public class Sections extends com.search.cap.main.base.entity.BaseEntityWithStringId implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * SNAME
	 */
	private java.lang.String sname;
	/**
	 * DBUDGETAMOUNT
	 */
	private java.lang.Double dbudgetamount;
	/**
	 * DENGINEERINGCOST
	 */
	private java.lang.Double dengineeringcost;
	/**
	 * DCOMMISSIONCOST
	 */
	private java.lang.Double dcommissioncost;
	/**
	 * SBUDGETID
	 */
	private java.lang.String sbudgetid;
	/**
	 * SPROJECTLIBSID
	 */
	private java.lang.String sprojectlibsid;
}