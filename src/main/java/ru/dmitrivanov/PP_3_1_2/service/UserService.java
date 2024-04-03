package ru.dmitrivanov.PP_3_1_2.service;


import ru.dmitrivanov.PP_3_1_2.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    void deleteUser(int id);

    void editUser(User user);

    List<User> listUsers();

    User getUserById(int id);
}
