package com.api.crud.service;

import com.api.crud.model.Genre;
import com.api.crud.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class GenreService {
    @Autowired
    private GenreRepository repositorio;

    public List<Genre> getAll() {
        return repositorio.findAll();
    }

    public Genre add(Genre genre) {
        return repositorio.save(genre);
    }

    public void delete(Long id) {
        repositorio.deleteById(id);
    }

    public Genre getById(Long id) {
        List<Genre> genres = repositorio.findById(id).stream().toList();
        return genres.get(0);
    }
}
