/**
 * 
 */
package com.mia.chat.controller;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mia.chat.service.ReadOffersService;
import com.mia.chat.vo.OfferTOCCPVO;
import com.mia.chat.vo.OffersListVO;

/**
 * @author srinivas
 *
 */
@RestController
public class ReadOffersAction {
	@Inject
	private ReadOffersService service;
	
	@RequestMapping(value = "/offers")
    public ResponseEntity<OffersListVO> getAllOffers(){
		OffersListVO offers =  service.readOffers();
		return new ResponseEntity<>(offers,HttpStatus.OK);
    }
	
	@RequestMapping(value="/offertoccp",method=RequestMethod.POST)
	public ResponseEntity<String> setOfferForCCP(@RequestParam(value="ssuid", required=false) String ssuid, 
	        @RequestParam(value="offerId", required=false) String offerId){
		OfferTOCCPVO offer = service.offerForCCP(ssuid, offerId);
		if(offer ==null)
		return new ResponseEntity<>("error",HttpStatus.FAILED_DEPENDENCY);
		return new ResponseEntity<>("save",HttpStatus.OK);
	}
}
