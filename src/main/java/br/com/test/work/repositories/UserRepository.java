package br.com.test.work.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.test.work.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
