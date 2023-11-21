package com.api.crud.repository;

import com.api.crud.model.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface EndingRepository extends JpaRepository<Ending, Long> {
    @Query("SELECT e FROM Ending e WHERE e.anime = :anime")
    List<Ending> findByAnime(@Param("anime") Anime anime);
}
