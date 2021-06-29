package com.techcushy.dataBase.repositiory;

import com.techcushy.dataBase.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositiory extends JpaRepository<Users, Long> {
}
