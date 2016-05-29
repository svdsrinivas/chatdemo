/**
 * 
 */
package com.mia.chat.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author srinivas
 *
 */
public class OffersListTOCCPVO implements Serializable{
	private List<OfferTOCCPVO> ccpOffers = new ArrayList<OfferTOCCPVO>();

	public List<OfferTOCCPVO> getCcpOffers() {
		return ccpOffers;
	}

	public void setCcpOffers(List<OfferTOCCPVO> ccpOffers) {
		this.ccpOffers = ccpOffers;
	}
	
}
