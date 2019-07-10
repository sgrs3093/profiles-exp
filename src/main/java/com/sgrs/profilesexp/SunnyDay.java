package com.sgrs.profilesexp;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"dev"})
public class SunnyDay implements WeatherService {

	@Override
	public String weatherDay() {
		return "Today is Sunny day";
	}

}
