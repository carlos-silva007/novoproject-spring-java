package com.example.curso.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.curso.entities.User;
import com.example.curso.repositories.UserRepository;


@Service  //registrar como servico
public class UserService {
	
	@Autowired  //injeçao de dependencia
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	

}
