package com.itis.dockerappboot.services.implementations;

import com.itis.dockerappboot.domain.User;
import com.itis.dockerappboot.dto.UserDTO;
import com.itis.dockerappboot.repositories.UserRepository;
import com.itis.dockerappboot.services.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 23.09.2018
 *
 * @author Andrey Romanov (steampart@gmail.com)
 * @version 1.0
 */

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public void saveUser(UserDTO userDTO) {

        User user = User.builder()
                        .username(userDTO.getUsername())
                        .email(userDTO.getEmail())
                        .message(userDTO.getMessage())
                        .build();

        this.userRepository.save(user);

    }

    @Override
    public List<UserDTO> getAllUsers() {

        List<User> users = this.userRepository.findAll();

        return users.stream()
                    .map(user -> UserDTO.builder()
                                        .username(user.getUsername())
                                        .email(user.getEmail())
                                        .message(user.getMessage())
                                        .build()
                    )
                    .collect(Collectors.toList());
    }
}
