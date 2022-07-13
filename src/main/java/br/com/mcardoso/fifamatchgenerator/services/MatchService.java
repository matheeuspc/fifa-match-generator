package br.com.mcardoso.fifamatchgenerator.services;

import br.com.mcardoso.fifamatchgenerator.model.Team;
import br.com.mcardoso.fifamatchgenerator.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class MatchService {

    @Autowired
    TeamRepository teamRepository;


    public String createRandomMatch() {
        List<Team> teamsList = teamRepository.findAll();

        Random random = new Random();

        int position = random.nextInt(teamsList.size());
        Team homeTeam = teamsList.get(position);
        teamsList.remove(position);

        Team awayTeam = teamsList.get(random.nextInt(teamsList.size()));

        teamsList.clear();

        return homeTeam.getName() + " x " + awayTeam.getName();
    }
}
