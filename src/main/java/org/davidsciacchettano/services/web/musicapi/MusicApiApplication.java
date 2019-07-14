package org.davidsciacchettano.services.web.musicapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MusicApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusicApiApplication.class, args);
	}

}
