package br.com.mcardoso.fifamatchgenerator.controller;

import br.com.mcardoso.fifamatchgenerator.services.MatchService;
import br.com.mcardoso.fifamatchgenerator.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/match")
public class MatchController {

    @Autowired private MatchService matchService;

    @GetMapping
    public String generateNewMatch() {
        return matchService.createRandomMatch();
    }
}
