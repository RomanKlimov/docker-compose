package com.itis.dockerappboot.services.interfaces;

import com.itis.dockerappboot.dto.UserDTO;

import java.util.List;

/**
 * 23.09.2018
 *
 * @author Andrey Romanov (steampart@gmail.com)
 * @version 1.0
 */

public interface UserService {

    void saveUser(UserDTO userDTO);
    List<UserDTO> getAllUsers();

}
