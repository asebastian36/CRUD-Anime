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
public class Opening {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idOpening;
    private String name;

    @ManyToOne
    @JoinColumn(name = "idAnime")
    private Anime anime;

    public Opening(String name, Anime anime) {
        this.name = name;
        this.anime = anime;
    }
}
