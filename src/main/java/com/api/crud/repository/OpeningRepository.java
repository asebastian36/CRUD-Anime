package com.api.crud.repository;

import com.api.crud.model.Anime;
import com.api.crud.model.Genre;
import com.api.crud.model.Opening;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OpeningRepository extends JpaRepository<Opening, Long> {
    @Query("SELECT e FROM Opening e WHERE e.anime = :anime")
    List<Opening> findByAnime(@Param("anime") Anime anime);
}
