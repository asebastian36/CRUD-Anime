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
public class Ending {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEnding;
    private String name;

    @ManyToOne
    @JoinColumn(name = "idAnime")
    private Anime anime;

    @Override
    public String toString() {
        return "Ending{" +
                "idEnding=" + idEnding +
                ", name='" + name + '\'' +
                '}';
    }

    public Ending(String name, Anime anime) {
        this.name = name;
        this.anime = anime;
    }
}
