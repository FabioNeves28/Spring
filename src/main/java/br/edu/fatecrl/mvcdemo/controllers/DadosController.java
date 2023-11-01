package br.edu.fatecrl.mvcdemo.controllers;

import br.edu.fatecrl.mvcdemo.models.JogadorValorant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/valorant")
public class DadosController {
    private static final List<JogadorValorant> jogadores = new ArrayList<JogadorValorant>();

    public DadosController() {
        jogadores.add(new JogadorValorant("Carlos", "Jett", 5, 25));
        jogadores.add(new JogadorValorant("Isabela", "Sova", 8, 18));
        jogadores.add(new JogadorValorant("Lucas", "Phoenix", 7, 20));
    }

    @GetMapping
    public List<JogadorValorant> getJogadores() {
        return jogadores;
    }
}
