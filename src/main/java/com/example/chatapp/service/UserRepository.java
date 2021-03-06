package com.example.chatapp.service;


import com.example.chatapp.model.User;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends CrudRepository<User, Long>{

  List<User> findAll();

}
