package br.com.mcardoso.fifamatchgenerator.services;


import br.com.mcardoso.fifamatchgenerator.model.Team;
import br.com.mcardoso.fifamatchgenerator.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class TeamService {

    @Autowired TeamRepository teamRepository;

    public List<Team> findAll() {
        return teamRepository.findAll();
    }

    public List<Team> findByLeague(String league) {
        return teamRepository.findByLeagueIgnoreCase(league);
    }
}
