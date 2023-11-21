package com.api.crud.controller;

import com.api.crud.model.*;
import com.api.crud.repository.GenreRepository;
import com.api.crud.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("api/v2/")
public class AnimeController {
    @Autowired
    private AnimeService animeService;

    @Autowired
    private OpeningService openingService;

    @Autowired
    private EndingService endingService;

    @Autowired
    private GenreService genreService;

    @Autowired
    private GenreRepository genreRepository;

    @GetMapping({"", "/", "index"})
    public String inicio(Model model) {
        List<Anime> animes = animeService.getAll();
        model.addAttribute("animes", animes);
        return "index";
    }

    @GetMapping("anime/{id}")
    public String element(@PathVariable long id, Model model) {
        Anime anime = animeService.getAnimeById(id);
        model.addAttribute("anime", anime);

        return "anime";
    }

    private void loadingInfo() {

    }
}
