package com.dorian.todoapi.persistence.repository;

import com.dorian.todoapi.persistence.model.BoardModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<BoardModel, Long> {
}
