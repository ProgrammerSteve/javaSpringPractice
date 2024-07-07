package com.springdatapractice.jpa;

import com.github.javafaker.Faker;
import com.springdatapractice.jpa.models.Author;
import com.springdatapractice.jpa.models.File;
import com.springdatapractice.jpa.models.Video;
import com.springdatapractice.jpa.repositories.AuthorRepository;
import com.springdatapractice.jpa.repositories.FileRepository;
import com.springdatapractice.jpa.repositories.VideoRepository;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();
		System.setProperty("DB_URL", dotenv.get("DB_URL"));
		System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME"));
		System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));


		SpringApplication.run(JpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			AuthorRepository repository,
			VideoRepository videoRepository,
			FileRepository fileRepository){
		return args -> {

			for(int i=0;i<50;i++){
				Faker faker=new Faker();
				var author= Author.builder()
						.firstName(faker.name().firstName())
						.lastName(faker.name().lastName())
						.age(faker.number().numberBetween(19,50))
						.email(faker.internet().emailAddress())
						.build();
				repository.save(author);

			}
//			var author= Author.builder()
//					.firstName("alibou")
//					.lastName("alibou")
//					.age(34)
//					.email("contact@aliboucoding.com")
//					.build();
//			repository.save(author);
//
//			var video= Video.builder()
//					.name("abc")
//					.length(5)
//					.build();
//			videoRepository.save(video);
//
//			var file= File.builder()
//					.name("def")
//					.type("pdf")
//					.build();
//			fileRepository.save(file);

		};

	}

}
