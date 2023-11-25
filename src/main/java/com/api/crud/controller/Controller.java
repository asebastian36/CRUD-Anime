package com.api.crud.controller;

import com.api.crud.model.*;
import com.api.crud.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@org.springframework.stereotype.Controller
@RequestMapping("/animeTracker")
public class Controller {
    @Autowired
    private AnimeService animeService;

    @Autowired
    private OpeningService openingService;

    @Autowired
    private EndingService endingService;

    @Autowired
    private GenreAnimeService genreAnimeService;

    @Autowired
    private GenreService genreService;

    //  index
    @GetMapping({"", "/", "/index"})
    public String index(Model model) {
        List<Anime> animes = animeService.getAll();
        model.addAttribute("animes", animes);
        return "main/index";
    }

    //  visualizar mas info de un anime
    @GetMapping("/anime/{id}")
    public String element(@PathVariable long id, Model model) {
        Anime anime = animeService.getAnimeById(id);
        model.addAttribute("anime", anime);
        model.addAttribute("openings", openingService.findByAnime(anime));
        model.addAttribute("endings", endingService.findByAnime(anime));
        model.addAttribute("genres", genreAnimeService.findByAnime(anime));
        return "main/anime";
    }

    //  enlace al menu de modificaciones
    @GetMapping("/new")
    public String formNew() {
        return "main/menuNew";
    }

    //  enlaces para agregar datos
    @GetMapping("/new/anime")
    public String formNewAnime(Model model) {
        model.addAttribute("anime", new Anime());
        return "form/newAnime";
    }

    @GetMapping("/new/genre")
    public String formNewGenre(Model model) {
        model.addAttribute("genre", new Genre());
        return "form/newGenre";
    }

    @GetMapping("/new/genreAnime")
    public String formNewGenreAnime(Model model) {
        model.addAttribute("genres", genreService.getAll());
        model.addAttribute("animes", animeService.getAll());
        return "form/newGenreAnime";
    }

    @GetMapping("/new/opening")
    public String formNewOpening(Model model) {
        model.addAttribute("animes", animeService.getAll());
        return "form/newOpening";
    }

    @GetMapping("/new/ending")
    public String formNewEnding(Model model) {
        model.addAttribute("ending", new Ending());
        model.addAttribute("animes", animeService.getAll());
        return "form/newEnding";
    }

    //  editar registros
    @GetMapping("/anime/edit/{id}")
    public String formEdit(@PathVariable long id, Model model) {
        Anime anime = animeService.getAnimeById(id);
        model.addAttribute("anime", anime);
        return "form/editAnime";
    }

    //  enlaces de busqueda
    @GetMapping("/anime/search")
    public String formSearch(Model model) {
        model.addAttribute("genres", genreService.getAll());
        return "main/search";
    }

    @GetMapping("/anime/animesByGenre/{id}")
    public String animesByGenre(@PathVariable long id, Model model) {
        Genre genre = genreService.getById(id);
        List<GenreAnime> result = genreAnimeService.findByGenre(genre);

        Set<Anime> animes = new HashSet<>();

        result.forEach((element) -> {
            animes.add(element.getAnime());
        });

        model.addAttribute("animes", animes);
        return "main/index";
    }

    //  enlace que busca el anime por nombre
    @PostMapping("/anime/send")
    public String search(@RequestParam(name = "name") String name, Model model) {
        List<Anime> animes = animeService.findByName(name);
        System.out.println(animes.isEmpty());
        model.addAttribute("animes", animes);
        return "main/index";
    }

    //  enlace que actualiza o guarda el registro
    @PostMapping("/anime/save")
    public String saveAnime(Anime anime) {
        animeService.add(anime);
        return "redirect:/animeTracker";
    }

    @PostMapping("/genre/save")
    public String save(Genre genre) {
        genreService.add(genre);
        return "redirect:/animeTracker/new/Genre";
    }

    @PostMapping("/opening/save")
    public String saveOpening(@RequestParam(name = "name") String name, @RequestParam(name = "anime") long id) {

        Anime anime = animeService.getAnimeById(id);
        openingService.add(new Opening(name, anime));

        return "redirect:/animeTracker";
    }

    @PostMapping("/ending/save")
    public String saveEnding(@RequestParam(name = "name") String name, @RequestParam(name = "anime") long id) {

        Anime anime = animeService.getAnimeById(id);
        endingService.add(new Ending(name, anime));

        return "redirect:/animeTracker";
    }

    //  enlace que elimina registros
    @GetMapping("/anime/delete/{id}")
    public String delete(@PathVariable long id) {
        animeService.delete(id);
        return "redirect:/animeTracker";
    }
}
