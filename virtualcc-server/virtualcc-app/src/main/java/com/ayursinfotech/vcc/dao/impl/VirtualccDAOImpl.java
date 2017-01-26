package com.ayursinfotech.vcc.dao.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.ayursinfotech.vcc.dao.VirtualccDAO;

@Repository
public class VirtualccDAOImpl implements VirtualccDAO {

	private static final Logger LOGGER = Logger
			.getLogger(VirtualccDAOImpl.class);

	@Override
	public Boolean ping() throws Exception {
		LOGGER.info("start Executing ping");
		Boolean result = true;
		LOGGER.info("end executing ping");
		return result;
	}

}
