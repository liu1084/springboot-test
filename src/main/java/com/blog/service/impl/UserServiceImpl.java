package com.blog.service.impl;

import com.blog.models.User;
import com.blog.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by neusoft on 2016/5/16.
 * This class is ...
 */
@Service
public class UserServiceImpl implements UserService{

	@Override
	public User all() {
		return null;
	}

	@Override
	public User byId(long id) {
		return null;
	}

	@Override
	public long create(User user) {
		return 0;
	}

	@Override
	public boolean delete(long id) {
		return false;
	}

	@Override
	public long update(User user) {
		return 0;
	}
}
