/**
 * 
 */
package com.mia.chat.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mia.chat.service.ReadOffersService;
import com.mia.chat.vo.OfferTOCCPVO;

/**
 * @author srinivas
 *
 */
@RestController
public class ReadOfferCCPAction {
	@Inject
	private ReadOffersService service;
	
	@RequestMapping(value="/offerfromccp",method=RequestMethod.POST)
	public ResponseEntity<String> getOfferFromCCP(HttpServletRequest request, 
	        @RequestParam(value="ssuid", required=false) String ssuid)throws Exception{
		OfferTOCCPVO offer = service.offerFromCCP(ssuid);
		if(offer ==null)
		return new ResponseEntity<>("error",HttpStatus.FAILED_DEPENDENCY);
		return new ResponseEntity<>("save",HttpStatus.OK);
	}
}
