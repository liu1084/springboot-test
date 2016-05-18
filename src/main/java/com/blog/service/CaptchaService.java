package com.blog.service;

import org.springframework.stereotype.Service;

import javax.websocket.server.ServerEndpoint;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Jim on 2016/5/18.
 * This class is ...
 */
@Service
public interface CaptchaService {
	String getWord();
	String getImage();
	boolean validate(String word);
	void generateImage() throws IOException;
}
