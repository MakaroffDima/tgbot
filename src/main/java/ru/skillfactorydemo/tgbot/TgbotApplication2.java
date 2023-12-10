package ru.skillfactorydemo.tgbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class TgbotApplication2 {

	public static void main(String[] args) {
		SpringApplication.run(TgbotApplication2.class, args);
	}

}
