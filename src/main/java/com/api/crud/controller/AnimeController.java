package com.api.crud.controller;

import com.api.crud.model.*;
import com.api.crud.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("api/v2/anime")
public class AnimeController {
    @Autowired
    private AnimeService animeService;

    @Autowired
    private OpeningService openingService;

    @Autowired
    private EndingService endingService;

    @Autowired
    private GenreService genreService;

    @RequestMapping({"", "/", "index"})
    public String inicio(Model model) {
        cargarInfo();
        List<Anime> animes = animeService.getAnimesById(1L);
        model.addAttribute("animes", animes);
        return "index";
    }

    private void cargarInfo() {
        long id = 11L;
    }
}
