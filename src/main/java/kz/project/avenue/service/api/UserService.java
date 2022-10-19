package kz.project.avenue.service.api;

import kz.project.avenue.domain.User;

import java.util.List;

public interface UserService {

    public User getInfo();

    List<User> getAll();

    User findByUsername(String username);

    User findById(Long id);

    void delete(Long id);

}
