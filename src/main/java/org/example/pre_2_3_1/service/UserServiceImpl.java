package org.example.pre_2_3_1.service;

import org.example.pre_2_3_1.dao.UserDAO;
import org.example.pre_2_3_1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    private UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

//    @Override
//    public User getUser(int id) {
//        return userDAO.getUser(id);
//    }

    @Override
    public List<User> getUsers() {
        return userDAO.getUsers();
    }

    @Override
    public User getUserFromId(int id) {
        return userDAO.getUserFromId(id);
    }

    @Override
    public void saveUser(User newUser) {
        userDAO.saveUser(newUser);
    }

    @Override
    public void deleteUserFromId(int id) {
        userDAO.deleteUserFromId(id);
    }

    @Override
    public void updateUser(User updatableUser, int id) {
        userDAO.updateUser(updatableUser, id);
    }

//    @Override
//    public void saveUser(User user) {
//        userDAO.saveUser(user);
//    }
//
//    @Override
//    public void updateUser(User updatableUser, int id) {
//        userDAO.updateUser(updatableUser, id);
//    }
//
//    @Override
//    public void deleteUser(int id) {
//        userDAO.deleteUser(id);
//    }
}
