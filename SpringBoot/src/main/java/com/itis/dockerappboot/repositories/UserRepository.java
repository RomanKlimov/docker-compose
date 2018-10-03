package com.itis.dockerappboot.repositories;

import com.itis.dockerappboot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 23.09.2018
 *
 * @author Andrey Romanov (steampart@gmail.com)
 * @version 1.0
 */

public interface UserRepository extends JpaRepository<User, Long> {
}
