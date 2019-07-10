package com.sgrs.profilesexp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class ProfilesExpApplication implements CommandLineRunner {
	
	@Autowired
	private WeatherService WeatherService;

	@Autowired
	Environment env;

	/*@Bean
	public WeatherService readPRop() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// Properties p=new Properties();
		System.out.println(env.getProperty("abc"));
		String k = env.getProperty("abc");
		Class c = Class.forName("k");
		WeatherService obj = (WeatherService) c.newInstance();
		System.out.println(obj.weatherDay());
		return obj;
	}*/

	@Override
	public void run(String... args) throws Exception {
		// Properties p=new Properties();
		System.out.println(env.getProperty("abc"));
		String k = env.getProperty("abc");
		Class c = Class.forName(k);
		WeatherService obj = (WeatherService) c.newInstance();
		System.out.println(obj.weatherDay());
		System.out.println("<html>" + WeatherService.weatherDay() + "</html>");
	}

	public static void main(String[] args) {
		SpringApplication.run(ProfilesExpApplication.class, args);
	}

}
