package com.chloneda.service;

import com.chloneda.domain.User;
import com.chloneda.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @Created by chloneda
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserByName(String username) {
        return userRepository.findUserByName(username);
    }

    @Override
    public User create(User user) {
        User u = userRepository.saveAndFlush(user);
        return u;
    }

    @Override
    public void delete(String userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public User update(User user) {
        Optional<User> userOptional = userRepository.findById(user.getId());
        if (userOptional.isPresent()) {
            User userObj = userOptional.get();
            userObj.setName(user.getName());
            userObj.setPassword(user.getPassword());
            userObj.setAge(user.getAge());
            userObj.setSex(user.getSex());
            userObj.setAddress(user.getAddress());
            userObj.setEmail(user.getEmail());
            userObj.setPhone(user.getPhone());
            return userRepository.saveAndFlush(userObj);
        }
        return null;
    }

    @Override
    public List<User> findAll() {
        List<User> userList=userRepository.findAll();
        return userList;
    }

}
