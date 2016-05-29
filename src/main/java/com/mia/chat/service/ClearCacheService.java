/**
 * 
 */
package com.mia.chat.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mia.chat.dao.ClearCacheUtil;

/**
 * @author srinivas
 *
 */
@Service
public class ClearCacheService {
	@Inject
	private ClearCacheUtil cacheUtil;
	
	public boolean clearAll(){
		return cacheUtil.clearAll();
	}
	public boolean clearByKey(String ssuid){
		return cacheUtil.clearByKey(ssuid);
	}
}
