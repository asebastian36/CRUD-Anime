package com.api.crud.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

    @ManyToOne
    @JoinColumn(name = "idAnime")
    private Anime anime;

    public Genre(String name, Anime anime) {
        this.name = name;
        this.anime = anime;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "idGenre=" + idGenre +
                ", name='" + name + '\'' +
                '}';
    }
}

