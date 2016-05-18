package com.blog.service.impl;

import com.blog.service.CaptchaService;
import org.patchca.color.RandomColorFactory;
import org.patchca.filter.predefined.*;
import org.patchca.service.ConfigurableCaptchaService;
import org.patchca.utils.encoder.EncoderHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

/**
 * Created by Jim on 2016/5/18.
 * This class is ...
 */
@Service
public class CaptchaServiceImpl implements CaptchaService {

	@Autowired
	ConfigurableCaptchaService configurableCaptchaService;

	@Autowired
	RandomColorFactory randomColorFactory;

	@Autowired
	Random random;

	@Override
	public String getWord() {
		return null;
	}

	@Override
	public String getImage() {
		return null;
	}

	@Override
	public boolean validate(String word) {
		return false;
	}

	@Override
	public void generateImage() {
		randomColorFactory.setMin(new Color(10, 10, 15));
		randomColorFactory.setMax(new Color(255, 30, 10));
		configurableCaptchaService.setColorFactory(randomColorFactory);

		int counter = random.nextInt() % 5;

		switch (counter % 5) {
			case 0:
				configurableCaptchaService.setFilterFactory(new CurvesRippleFilterFactory(configurableCaptchaService.getColorFactory()));
				break;
			case 1:
				configurableCaptchaService.setFilterFactory(new MarbleRippleFilterFactory());
				break;
			case 2:
				configurableCaptchaService.setFilterFactory(new DoubleRippleFilterFactory());
				break;
			case 3:
				configurableCaptchaService.setFilterFactory(new WobbleRippleFilterFactory());
				break;
			case 4:
				configurableCaptchaService.setFilterFactory(new DiffuseRippleFilterFactory());
				break;
		}
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("patcha_demo" + counter + ".png");
			EncoderHelper.getChallangeAndWriteImage(configurableCaptchaService, "png", fos);
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
