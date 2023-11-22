package com.example.spring_acces_base.controller.utils;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_acces_base.entity.equipe.Equipe;
import com.example.spring_acces_base.entity.equipe.services.EquipeServices;
import com.example.spring_acces_base.entity.joueur.Joueur;
import com.example.spring_acces_base.entity.joueur.services.JoueurService;
import com.example.spring_acces_base.entity.match.Match;
import com.example.spring_acces_base.entity.match.services.MatchService;
import com.example.spring_acces_base.entity.saison.Saison;
import com.example.spring_acces_base.entity.saison.services.SaisonService;
import com.example.spring_acces_base.response.Response;

@RestController
@RequestMapping("/info")
@CrossOrigin
public class FrontController {
    private EquipeServices equipeService;
    private JoueurService joueurService;
    private MatchService matchService;
    private SaisonService saisonService;

    public FrontController(EquipeServices equipeService, JoueurService joueurService, MatchService matchService, SaisonService saisonService){
        this.equipeService = equipeService;
        this.joueurService = joueurService;
        this.matchService = matchService;
        this.saisonService = saisonService;
    }

    @GetMapping("/equipe")
    public Response listeEquipe(){
        Response response = new Response();
        Object temp = null;

        temp = this.equipeService.findAll();
        response.setDonner(temp);
        response.setErreur(false);

        return response;
    }

    @PostMapping("/addequipe")
    public Response addEquipe(@RequestBody Equipe equipe){
        Response response = new Response();
        Object temp = null;

        try {
            temp = this.equipeService.savEquipes(equipe);
            response.setDonner(temp);
            response.setErreur(false);
            return response;
        } catch (Exception e) {
            response.setErreur(true);
            response.setDonner(null);
            e.printStackTrace();
            return response;  
        }
    }

    @GetMapping("/joueur")
    public Response listeJoueur(){
        Response response = new Response();
        Object temp = null;

        temp = this.joueurService.findAll();
        response.setDonner(temp);
        response.setErreur(false);

        return response;
    }

    @PostMapping("/addjoueur")
    public Response addJoueur(@RequestBody Joueur joueur){
        Response response = new Response();
        Object temp = null;

        try {
            temp = this.joueurService.saveJoueur(joueur);
            response.setDonner(temp);
            response.setErreur(false);
            return response;
        } catch (Exception e) {
            response.setErreur(true);
            response.setDonner(null);
            e.printStackTrace();
            return response;  
        }
    }

    @GetMapping("/match")
    public Response listeMatch(){
        Response response = new Response();
        Object temp = null;

        temp = this.matchService.findAll();
        response.setDonner(temp);
        response.setErreur(false);

        return response;
    }

    @PostMapping("/addmatch")
    public Response addMacth(@RequestBody Match match){
        Response response = new Response();
        Object temp = null;

        try {
            temp = this.matchService.saveMatch(match);
            response.setDonner(temp);
            response.setErreur(false);
            return response;
        } catch (Exception e) {
            response.setErreur(true);
            response.setDonner(null);
            e.printStackTrace();
            return response;  
        }
    }


    @GetMapping("/saison")
    public Response listeSaison(){
        Response response = new Response();
        Object temp = null;

        temp = this.saisonService.findAll();
        response.setDonner(temp);
        response.setErreur(false);

        return response;
    }

    @PostMapping("/addsaison")
    public Response addSaison(@RequestBody Saison saison){
        Response response = new Response();
        Object temp = null;

        try {
            temp = this.saisonService.saveSaisons(saison);
            response.setDonner(temp);
            response.setErreur(false);
            return response;
        } catch (Exception e) {
            response.setErreur(true);
            response.setDonner(null);
            e.printStackTrace();
            return response;  
        }
    }
}
