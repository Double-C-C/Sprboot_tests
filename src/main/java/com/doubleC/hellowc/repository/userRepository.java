package com.doubleC.hellowc.repository;

import com.doubleC.hellowc.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<User, Integer> {

}
