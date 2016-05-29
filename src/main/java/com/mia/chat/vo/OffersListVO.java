package com.mia.chat.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OffersListVO implements Serializable{
	private List<OffersVO> offers = new ArrayList<OffersVO>();

	public List<OffersVO> getOffers() {
		return offers;
	}

	public void setOffers(List<OffersVO> offers) {
		this.offers = offers;
	}
}
