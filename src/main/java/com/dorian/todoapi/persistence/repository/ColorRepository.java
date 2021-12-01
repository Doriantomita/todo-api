package com.dorian.todoapi.persistence.repository;

import com.dorian.todoapi.persistence.model.ColorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ColorRepository extends JpaRepository<ColorModel, Long> {

    Optional<ColorModel> findColorModelByUuid(String uuid);

}
