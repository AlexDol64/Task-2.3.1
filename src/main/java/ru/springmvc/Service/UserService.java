package ru.springmvc.Service;

import ru.springmvc.models.User;

import java.util.List;

public interface UserService {
    void createUsersTable();

    void saveUser(User user);

    List<User> showAllUsers();

    User getUser(int id);
    void deleteUser(int id);

}