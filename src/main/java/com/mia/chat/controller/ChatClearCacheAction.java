/**
 * 
 */
package com.mia.chat.controller;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mia.chat.service.ClearCacheService;

/**
 * @author srinivas
 *
 */
@RestController
public class ChatClearCacheAction {
	@Inject
	private ClearCacheService service;
	
	@RequestMapping(value = "/clearAll")
	public boolean clearAll(){
		return service.clearAll();
	}
	@RequestMapping(value = "/clearByKey")
	public boolean clearByKey(@RequestParam(value="ssuid", required=false) String ssuid){
		return service.clearByKey(ssuid);
	}
}
