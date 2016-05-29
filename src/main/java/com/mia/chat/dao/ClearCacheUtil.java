package com.mia.chat.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Repository;

@Repository
public class ClearCacheUtil {

	private static final Logger LOGGER = LoggerFactory.getLogger(ClearCacheUtil.class);
	
	@CacheEvict(value = "offers", allEntries = true)
	public boolean clearAll(){
		LOGGER.info("calling clear Cache");
		return true;
	}
	
	@CacheEvict(value="offertoccp",key="#ssuid")
	public boolean clearByKey(String ssuid){
		LOGGER.info("calling clear only key");
		return true;
	}
	
}
