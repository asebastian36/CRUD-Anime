package com.api.crud.repository;

import com.api.crud.model.GenreAnime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreAnimeRepository extends JpaRepository<GenreAnime, Long> {
}
