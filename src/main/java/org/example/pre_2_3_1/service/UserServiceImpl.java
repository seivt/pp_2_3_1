package org.example.pre_2_3_1.service;

import org.example.pre_2_3_1.dao.UserDAO;
import org.example.pre_2_3_1.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserDAO userDAO;


    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> getUsers() {
        return userDAO.getUsers();
    }

    @Override
    public User getUserById(int id) {
        return userDAO.getUserById(id);
    }
    @Transactional
    @Override
    public void saveUser(User newUser) {
        userDAO.saveUser(newUser);
    }

    @Transactional
    @Override
    public void deleteUserById(int id) {
        userDAO.deleteUserById(id);
    }

    @Transactional
    @Override
    public void updateUser(User updatableUser, int id) {
        userDAO.updateUser(updatableUser, id);
    }
}
