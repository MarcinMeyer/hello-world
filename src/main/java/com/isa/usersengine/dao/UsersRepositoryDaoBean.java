package com.isa.usersengine.dao;

import com.isa.usersengine.domain.User;
import com.isa.usersengine.repository.UsersRepository;

import java.util.List;

public class UsersRepositoryDaoBean implements UsersRepositoryDao{


    public void addUser(User user) {
        UsersRepository.getRepository().add(user);

    }

    public User getUserById(Long id) {
        for (User user : UsersRepository.getRepository()) {
            if (user.getId() == id) {
                return user;
            }
        }return null;
    }

    public User getUserByLogin(String login) {
        for (User user : UsersRepository.getRepository()) {
            if (user.getLogin() == login) {
                return user;
            }
        }return null;
    }

    public List<User> getUsersList() {
        return UsersRepository.getRepository();

    }
}
