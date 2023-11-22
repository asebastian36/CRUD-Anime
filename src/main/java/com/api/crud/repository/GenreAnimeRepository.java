package com.api.crud.repository;

import com.api.crud.model.Anime;
import com.api.crud.model.Genre;
import com.api.crud.model.GenreAnime;
import com.api.crud.model.Opening;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GenreAnimeRepository extends JpaRepository<GenreAnime, Long> {
    @Query("SELECT e FROM GenreAnime e WHERE e.anime = :anime")
    List<GenreAnime> findByAnime(@Param("anime") Anime anime);

    @Query("SELECT e FROM GenreAnime e WHERE e.genre = :genre")
    List<GenreAnime> findByAnime(@Param("genre") Genre genre);
}
