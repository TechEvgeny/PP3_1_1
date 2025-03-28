package com.preproject.boot.ProjectPP3Boot.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.preproject.boot.ProjectPP3Boot.DAO.UserDao;
import com.preproject.boot.ProjectPP3Boot.model.User;

import java.util.List;

@Service
@Transactional
public class ServiceUserImpl implements ServiceUser {

    private final UserDao userDao;

    @Autowired
    public ServiceUserImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    @Transactional(readOnly = true)
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }

    @Override
    public void updateUser(int id, User user) {
        userDao.updateUser(id, user);
    }
}

