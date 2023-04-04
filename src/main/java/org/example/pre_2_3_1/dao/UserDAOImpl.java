package org.example.pre_2_3_1.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.example.pre_2_3_1.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getUsers() {
        TypedQuery<User> query = entityManager.createQuery("SELECT u FROM User u", User.class);
        return query.getResultList();
    }

    @Override
    public User getUserById(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void deleteUserById(int id) {
        User user = getUserById(id);
        if (user != null) {
            entityManager.remove(user);
        } else {
            throw new NullPointerException("Пользователь с " + id + " в базе не найден.");
        }
    }

    @Override
    public void saveUser(User newUser) {
        entityManager.persist(newUser);
    }

    @Override
    public void updateUser(User updatableUser, int id) {
        User userToBeUpdate = getUserById(id);
        userToBeUpdate.setName(updatableUser.getName());
        userToBeUpdate.setAge(updatableUser.getAge());
        userToBeUpdate.setJob(updatableUser.getJob());
    }

}
