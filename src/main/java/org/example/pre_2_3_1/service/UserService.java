package org.example.pre_2_3_1.service;

import org.example.pre_2_3_1.model.User;

import java.util.List;

public interface UserService {
//    User getUser(int id);

    List<User> getUsers();

    User getUserFromId(int id);

    void saveUser(User newUser);

    void deleteUserFromId(int id);

    void updateUser(User updatableUser, int id);

}
