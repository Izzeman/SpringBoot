package com.example.springboot.service;

import com.example.springboot.model.User;
import com.example.springboot.service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> readUsers() {
        return userRepository.findAll();
    }

    @Override
    public User readUser(Long id) {
        return userRepository.getById(id);
    }

    @Override
    public void updateUser(User user) {
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
