package com.company.learnKafka.user_service.repository;

import com.company.learnKafka.user_service.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
