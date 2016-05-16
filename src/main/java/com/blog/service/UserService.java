package com.blog.service;

import com.blog.models.User;

/**
 * Created by neusoft on 2016/5/16.
 * This class is ...
 */
public interface UserService {
	User all();
	User byId(long id);
	long create(User user);
	boolean delete(long id);
	long update(User user);
}
