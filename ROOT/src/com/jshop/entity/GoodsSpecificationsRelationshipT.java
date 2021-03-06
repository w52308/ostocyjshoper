package com.jshop.entity;

// Generated 2013-3-22 15:24:47 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * GoodsSpecificationsRelationshipT generated by hbm2java
 */
@Entity
@Table(name = "goods_specifications_relationship_t", catalog = "jshoper3")
public class GoodsSpecificationsRelationshipT implements java.io.Serializable {

	private String goodsSetId;
	private String specidicationsId;

	public GoodsSpecificationsRelationshipT() {
	}

	public GoodsSpecificationsRelationshipT(String goodsSetId, String specidicationsId) {
		this.goodsSetId = goodsSetId;
		this.specidicationsId = specidicationsId;
	}

	@Id
	@Column(name = "GOODS_SET_ID", unique = true, nullable = false, length = 20)
	public String getGoodsSetId() {
		return this.goodsSetId;
	}

	public void setGoodsSetId(String goodsSetId) {
		this.goodsSetId = goodsSetId;
	}

	@Column(name = "SPECIDICATIONS_ID", nullable = false, length = 200)
	public String getSpecidicationsId() {
		return this.specidicationsId;
	}

	public void setSpecidicationsId(String specidicationsId) {
		this.specidicationsId = specidicationsId;
	}

}
