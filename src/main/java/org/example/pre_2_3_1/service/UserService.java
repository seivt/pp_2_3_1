package org.example.pre_2_3_1.service;

import org.example.pre_2_3_1.model.User;
import java.util.List;

public interface UserService {

    List<User> getUsers();

    User getUserById(int id);

    void saveUser(User newUser);

    void deleteUserById(int id);

    void updateUser(User updatableUser, int id);

}
