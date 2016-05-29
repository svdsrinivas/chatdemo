/**
 * 
 */
package com.mia.chat.vo;

import java.io.Serializable;

/**
 * @author srinivas
 *
 */
public class OfferTOCCPVO implements Serializable{
	private String ssuid=null;
	private String offerId=null;
	private String status=null;
	
	public OfferTOCCPVO(String ssuid, String offerId, String status) {
		super();
		this.ssuid = ssuid;
		this.offerId = offerId;
		this.status = status;
	}
	public String getSsuid() {
		return ssuid;
	}
	public void setSsuid(String ssuid) {
		this.ssuid = ssuid;
	}
	public String getOfferId() {
		return offerId;
	}
	public void setOfferId(String offerId) {
		this.offerId = offerId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
