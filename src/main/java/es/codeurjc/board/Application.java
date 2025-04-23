package es.codeurjc.board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import es.codeurjc.board.repository.PostRepository;
import es.codeurjc.board.service.PostServiceSQL;
import es.codeurjc.board.service.PostServiceInterface;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public PostServiceInterface postSvc(PostRepository posts) {
		return new PostServiceSQL(posts);
	}
	
}