package com.api.crud.repository;

import com.api.crud.model.Opening;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OpeningRepository extends JpaRepository<Opening, Long> {
}
