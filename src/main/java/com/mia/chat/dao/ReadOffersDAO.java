package com.mia.chat.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import com.mia.chat.vo.OfferTOCCPVO;
import com.mia.chat.vo.OffersListVO;
import com.mia.chat.vo.OffersVO;

@Repository
public class ReadOffersDAO {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ReadOffersDAO.class);
	
	@Cacheable(value = "offers")
	public OffersListVO readOffers(){
		LOGGER.info("calling readOffers");
		OffersListVO offers = new OffersListVO();
		OffersVO one = new OffersVO("001", "Offer1", "OfferDesc1", "OfferTitle1", "OfferImg1");
		OffersVO two = new OffersVO("002", "Offer2", "OfferDesc2", "OfferTitle2", "OfferImg2");
		OffersVO thre = new OffersVO("003", "Offer3", "OfferDesc3", "OfferTitle3", "OfferImg3");
		OffersVO four = new OffersVO("004", "Offer4", "OfferDesc4", "OfferTitle4", "OfferImg4");
		
		offers.getOffers().add(one);
		offers.getOffers().add(two);
		offers.getOffers().add(thre);
		offers.getOffers().add(four);
		return offers;
	}
	
	@Cacheable(value="offertoccp",key="#ssuid")
	public OfferTOCCPVO offerForCCP(String ssuid,String offerId,String status){
		LOGGER.info("calling offerForCCP");
		OfferTOCCPVO ccpOffer = new OfferTOCCPVO(ssuid,offerId,status);
		return ccpOffer;
	}
	
	@Cacheable(value="offertoccp",key="#ssuid", unless = "#offerId == null")
	public OfferTOCCPVO offerFromCCP(String ssuid){
		LOGGER.info("calling offerForCCP");
		return null;
	}
	
}
