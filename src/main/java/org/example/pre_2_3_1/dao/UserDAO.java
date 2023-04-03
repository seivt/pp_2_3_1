package org.example.pre_2_3_1.dao;

import org.example.pre_2_3_1.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getUsers();

    User getUserFromId(int id);

    void saveUser(User newUser);

    void deleteUserFromId(int id);

    void updateUser(User updatableUser, int id);



}
