package com.chloneda.service;

import com.chloneda.model.User;

/**
 * @Created by chloneda
 * @Description:
 */
public interface UserService {

    User getUserById(String userId);

    void transaction() throws Exception;

}
