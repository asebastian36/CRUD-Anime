package com.api.crud.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idGenre;
    private String name;

    @OneToMany(mappedBy = "genre")
    Set<GenreAnime> genreAnime;

    public Genre(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "idGenre=" + idGenre +
                "name=" + name +
                '}';
    }
}

