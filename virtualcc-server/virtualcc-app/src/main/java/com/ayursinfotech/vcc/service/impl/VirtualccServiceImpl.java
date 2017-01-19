package com.ayursinfotech.vcc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayursinfotech.vcc.dao.VirtualccDAO;
import com.ayursinfotech.vcc.response.BaseResponse;
import com.ayursinfotech.vcc.service.VirtualccService;
import com.ayursinfotech.vcc.util.VirtualccConstants;

@Service
public class VirtualccServiceImpl implements VirtualccService {

	@Autowired
	private VirtualccDAO virtualccDAO;

	@Override
	public BaseResponse ping() {
		BaseResponse response = new BaseResponse();
		try {
			if (virtualccDAO.ping()) {
				response.setStatus(VirtualccConstants.STATUS_SUCCESS);
			} else {
				response.setStatus(VirtualccConstants.STATUS_FAILURE);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return response;
	}

}
