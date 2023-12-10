package ru.skillfactorydemo.tgbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;



@TestConfiguration(proxyBeanMethods = false)
public class TestTgbotApplication2 {

	public static void main(String[] args) {
		SpringApplication.from(TgbotApplication2::main).with(TestTgbotApplication2.class).run(args);
	}

}
