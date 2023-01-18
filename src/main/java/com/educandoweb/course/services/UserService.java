package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

//@Component//registra a classe como componente do springboot
@Service//é a mesma coisa que o component mas a palavra é semanticamente melhor
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	public List<User>findAll(){
		
		return repository.findAll();
	}
	public User insert(User obj) {
		return repository.save(obj);
	}
}
