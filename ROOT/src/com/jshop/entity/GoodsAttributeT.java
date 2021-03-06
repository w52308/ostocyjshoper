package com.jshop.entity;

// Generated 2013-3-22 15:24:47 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * GoodsAttributeT generated by hbm2java
 */
@Entity
@Table(name = "goods_attribute_t", catalog = "jshoper3")
public class GoodsAttributeT implements java.io.Serializable {

	private String goodsattributeid;
	private String goodsattributename;
	private String goodsTypeId;
	private String goodsTypeName;
	private Date createtime;
	private String state;
	private String creatorid;
	private String attributeType;
	private String attributelist;
	private String sort;
	private String attributeIndex;
	private String issearch;
	private String issametolink;

	public GoodsAttributeT() {
	}

	public GoodsAttributeT(String goodsattributeid, String goodsattributename, String goodsTypeId, String goodsTypeName, Date createtime, String state, String creatorid, String attributeType, String attributelist, String sort) {
		this.goodsattributeid = goodsattributeid;
		this.goodsattributename = goodsattributename;
		this.goodsTypeId = goodsTypeId;
		this.goodsTypeName = goodsTypeName;
		this.createtime = createtime;
		this.state = state;
		this.creatorid = creatorid;
		this.attributeType = attributeType;
		this.attributelist = attributelist;
		this.sort = sort;
	}

	public GoodsAttributeT(String goodsattributeid, String goodsattributename, String goodsTypeId, String goodsTypeName, Date createtime, String state, String creatorid, String attributeType, String attributelist, String sort, String attributeIndex, String issearch, String issametolink) {
		this.goodsattributeid = goodsattributeid;
		this.goodsattributename = goodsattributename;
		this.goodsTypeId = goodsTypeId;
		this.goodsTypeName = goodsTypeName;
		this.createtime = createtime;
		this.state = state;
		this.creatorid = creatorid;
		this.attributeType = attributeType;
		this.attributelist = attributelist;
		this.sort = sort;
		this.attributeIndex = attributeIndex;
		this.issearch = issearch;
		this.issametolink = issametolink;
	}

	@Id
	@Column(name = "GOODSATTRIBUTEID", unique = true, nullable = false, length = 20)
	public String getGoodsattributeid() {
		return this.goodsattributeid;
	}

	public void setGoodsattributeid(String goodsattributeid) {
		this.goodsattributeid = goodsattributeid;
	}

	@Column(name = "GOODSATTRIBUTENAME", nullable = false, length = 45)
	public String getGoodsattributename() {
		return this.goodsattributename;
	}

	public void setGoodsattributename(String goodsattributename) {
		this.goodsattributename = goodsattributename;
	}

	@Column(name = "GOODS_TYPE_ID", nullable = false, length = 20)
	public String getGoodsTypeId() {
		return this.goodsTypeId;
	}

	public void setGoodsTypeId(String goodsTypeId) {
		this.goodsTypeId = goodsTypeId;
	}

	@Column(name = "GOODS_TYPE_NAME", nullable = false, length = 45)
	public String getGoodsTypeName() {
		return this.goodsTypeName;
	}

	public void setGoodsTypeName(String goodsTypeName) {
		this.goodsTypeName = goodsTypeName;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Column(name = "STATE", nullable = false, length = 1)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "CREATORID", nullable = false, length = 20)
	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	@Column(name = "ATTRIBUTE_TYPE", nullable = false, length = 1)
	public String getAttributeType() {
		return this.attributeType;
	}

	public void setAttributeType(String attributeType) {
		this.attributeType = attributeType;
	}

	@Column(name = "ATTRIBUTELIST", nullable = false, length = 65535)
	public String getAttributelist() {
		return this.attributelist;
	}

	public void setAttributelist(String attributelist) {
		this.attributelist = attributelist;
	}

	@Column(name = "SORT", nullable = false, length = 10)
	public String getSort() {
		return this.sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	@Column(name = "ATTRIBUTE_INDEX", length = 1)
	public String getAttributeIndex() {
		return this.attributeIndex;
	}

	public void setAttributeIndex(String attributeIndex) {
		this.attributeIndex = attributeIndex;
	}

	@Column(name = "ISSEARCH", length = 1)
	public String getIssearch() {
		return this.issearch;
	}

	public void setIssearch(String issearch) {
		this.issearch = issearch;
	}

	@Column(name = "ISSAMETOLINK", length = 1)
	public String getIssametolink() {
		return this.issametolink;
	}

	public void setIssametolink(String issametolink) {
		this.issametolink = issametolink;
	}

}
