package br.edu.fatecrl.mvcdemo.controllers;

import br.edu.fatecrl.mvcdemo.models.JogadorValorant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/valorant")
public class ValorantController {
    private static final List<JogadorValorant> jogadores = new ArrayList<>();

    public ValorantController() {
        jogadores.add(new JogadorValorant("xNandaz", "Sage", 5, 25));
        jogadores.add(new JogadorValorant("xNxlf", "Omen", 8, 18));
        jogadores.add(new JogadorValorant("Bife Wellinton", "Cypher", 7, 20));
    }

    @GetMapping
    public String getJogadores(Model model) {
        model.addAttribute("jogadores", jogadores);
        return "jogadores_valorant";
    }
}
