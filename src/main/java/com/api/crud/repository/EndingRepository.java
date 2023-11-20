package com.api.crud.repository;

import com.api.crud.model.Ending;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EndingRepository extends JpaRepository<Ending, Long> {
}
