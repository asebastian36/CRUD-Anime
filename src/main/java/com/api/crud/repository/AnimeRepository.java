package com.api.crud.repository;

import com.api.crud.model.Anime;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface AnimeRepository extends JpaRepository<Anime, Long> {
    @Query("SELECT a FROM Anime a WHERE a.name like :name")
    List<Anime> findByName(@Param("name") String name);
}
