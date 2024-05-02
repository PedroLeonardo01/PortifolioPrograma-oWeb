package br.com.test.work.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.test.work.entities.User;
import br.com.test.work.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Joao Paulo", "paulo@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Maria Clara", "clara@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));

	}

}
