package com.example.consumingrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Obter JSON de uma API e enviar para o UI.
 *
 * Help links:
 * https://www.w3schools.in/json/json-java/
 */

@SpringBootApplication
@EnableScheduling
public class ConsumingRestApplication {

	public static void main(String[] args) {

//		Calendar calendar = Calendar.getInstance();
//
//		// Time now
//		Long end = calendar.getTimeInMillis() / 1000L;
//
//		// Time 2 hours ago
//		calendar.add(Calendar.HOUR, -30);
//		Long begin = calendar.getTimeInMillis() / 1000L;
//
//		String url = "https://opensky-network.org/api/flights/departure?airport=EDDT&begin=" + begin + "&end=" + end;
//		System.out.println("URL :: " + url);

		SpringApplication.run(ConsumingRestApplication.class, args);
	}
}
