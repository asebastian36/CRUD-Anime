package com.api.crud.service;

import com.api.crud.repository.GenreAnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenreAnimeService {
    @Autowired
    GenreAnimeRepository repositorio;
}
