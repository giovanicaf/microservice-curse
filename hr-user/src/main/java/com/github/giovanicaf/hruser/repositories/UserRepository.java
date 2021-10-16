package com.github.giovanicaf.hruser.repositories;

import com.github.giovanicaf.hruser.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

    User findByEmail(String email);

}
