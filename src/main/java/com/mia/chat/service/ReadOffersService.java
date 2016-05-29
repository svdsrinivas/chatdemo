/**
 * 
 */
package com.mia.chat.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mia.chat.dao.ReadOffersDAO;
import com.mia.chat.vo.OfferTOCCPVO;
import com.mia.chat.vo.OffersListVO;

/**
 * @author srinivas
 *
 */
@Service
public class ReadOffersService {
	@Inject
	private ReadOffersDAO dao;
	public OffersListVO readOffers(){
		return dao.readOffers();
	}
	public OfferTOCCPVO offerForCCP(String ssuid,String offerId){
		return dao.offerForCCP(ssuid, offerId, "INIT");
	}
	public OfferTOCCPVO offerFromCCP(String ssuid) throws Exception{
		return dao.offerFromCCP(ssuid);
	}
}
