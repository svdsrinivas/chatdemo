package com.mia.chat.vo;

import java.io.Serializable;

public class OffersVO implements Serializable{
	private String offerId;
	private String offerName;
	private String offerDesc;
	private String offerTitle;
	private String imgUrl;
	
	public OffersVO(String offerId, String offerName, String offerDesc, String offerTitle, String imgUrl) {
		super();
		this.offerId = offerId;
		this.offerName = offerName;
		this.offerDesc = offerDesc;
		this.offerTitle = offerTitle;
		this.imgUrl = imgUrl;
	}
	public String getOfferId() {
		return offerId;
	}
	public void setOfferId(String offerId) {
		this.offerId = offerId;
	}
	public String getOfferName() {
		return offerName;
	}
	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}
	public String getOfferDesc() {
		return offerDesc;
	}
	public void setOfferDesc(String offerDesc) {
		this.offerDesc = offerDesc;
	}
	public String getOfferTitle() {
		return offerTitle;
	}
	public void setOfferTitle(String offerTitle) {
		this.offerTitle = offerTitle;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	
}
