package com.sgrs.profilesexp;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"test", "default"})
public class RennyDay implements WeatherService {

	@Override
	public String weatherDay() {
		return "Today is Renny day";
	}

}
