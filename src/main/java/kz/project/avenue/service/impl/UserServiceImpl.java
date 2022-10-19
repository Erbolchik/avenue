package kz.project.avenue.service.impl;

import kz.project.avenue.domain.User;
import kz.project.avenue.repository.RoleRepository;
import kz.project.avenue.repository.UserRepository;
import kz.project.avenue.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;


    @Override
    public User getInfo() {
        return userRepository.findById(1L).get();
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public void delete(Long id) {

    }
}
