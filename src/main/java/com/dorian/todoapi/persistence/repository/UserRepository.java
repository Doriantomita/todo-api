package com.dorian.todoapi.persistence.repository;

import com.dorian.todoapi.persistence.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {

    Optional<UserModel> findUserModelByUuid(String uuid);

    Optional<UserModel> findUserModelByUsername(String username);
}
