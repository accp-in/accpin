package com.in.service.impl;

import com.in.dao.EmailattachesDao;
import com.in.service.EmailattachesService;

public class EmailattachesServiceImpl implements EmailattachesService {

	//setע��
	private EmailattachesDao eEmailattachesDao;

	public void seteEmailattachesDao(EmailattachesDao eEmailattachesDao) {
		this.eEmailattachesDao = eEmailattachesDao;
	}
}
