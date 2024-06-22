package com.market.goods.pojo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import javax.persistence.*;

@ApiModel(description = "Album",value = "Album")
@Table(name="tb_spec")
public class Brand implements Serializable{
	@ApiModelProperty(value = "品牌id",required = false)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;//品牌id
	@ApiModelProperty(value = "品牌名称",required = false)
	@Column(name ="name")
	private String name;
	@ApiModelProperty(value = "品牌图片地址",required = false)
	@Column(name ="logo")
	private String logo;
	@ApiModelProperty(value = "品牌的首地址",required = false)
	@Column(name ="first_letter")
	private String First_letter;
	@ApiModelProperty(value = "排序",required = false)
	@Column(name ="seq")
	private Integer seq;

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getImage() {
		return logo;
	}

	public String getLetter() {
		return First_letter;
	}

	public Integer getSeq() {
		return seq;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setImage(String image) {
		this.logo = image;
	}

	public void setLetter(String letter) {
		this.First_letter = letter;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}
}
