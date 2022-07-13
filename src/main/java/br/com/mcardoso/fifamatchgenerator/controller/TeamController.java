package br.com.mcardoso.fifamatchgenerator.controller;

import br.com.mcardoso.fifamatchgenerator.model.Team;
import br.com.mcardoso.fifamatchgenerator.services.MatchService;
import br.com.mcardoso.fifamatchgenerator.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/teams")
public class TeamController {

    @Autowired private TeamService teamService;

    @GetMapping
    public List<Team> listAllTeams() {
        return teamService.findAll();
    }

    @GetMapping(value = "/{league}")
    public List<Team> listTeamsByLeague(@PathVariable String league) {
        return teamService.findByLeague(league);
    }
}
