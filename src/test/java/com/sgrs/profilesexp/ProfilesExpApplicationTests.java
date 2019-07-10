package com.sgrs.profilesexp;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("sunny")
public class ProfilesExpApplicationTests {

	@Autowired
	private WeatherService WeatherService;

	@Test
	public void testWeather() {
		String outpt = WeatherService.weatherDay();
		assertThat(outpt).contains("Today is renny day");
	}

	@Test
	public void testWeatherSunny() {
		String outpt = WeatherService.weatherDay();
		assertThat(outpt).contains("Today is Sunny day");
	}

}
