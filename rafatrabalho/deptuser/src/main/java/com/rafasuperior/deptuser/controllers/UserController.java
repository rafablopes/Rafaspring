package com.rafasuperior.deptuser.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafasuperior.deptuser.Repositories.UserRepository;
import com.rafasuperior.deptuser.entities.User;

@RestController //configurando a classe pra eal responder por requisições
@RequestMapping(value = "/users") 
public class UserController {
	
	
	@Autowired //Para que seja instanciado no repository e resolvido a dependencia 
	private UserRepository repository;
	
	@GetMapping //Pra falar que é uma requisicao que é get
	public List<User> findiAll(){
		List<User> result = repository.findAll();
		return result;
	
	}
	@GetMapping(value = "/{id}")
	public User findByid(@PathVariable Long id) {
		User result = repository.findById(id).get();
		return result;
	}
	
	@PostMapping
	public User insert(@RequestBody User User) {
		User result = repository.save(User); 
		return result;
	}
	
}
