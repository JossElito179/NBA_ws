package com.example.spring_acces_base.controller.utils;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_acces_base.entity.statistique.Minute;
import com.example.spring_acces_base.entity.statistique.PasseD;
import com.example.spring_acces_base.entity.statistique.Rebond;
import com.example.spring_acces_base.entity.statistique.Statistique;
import com.example.spring_acces_base.entity.statistique.Tir;
import com.example.spring_acces_base.entity.statistique.services.MinuteServices;
import com.example.spring_acces_base.entity.statistique.services.PasseDServices;
import com.example.spring_acces_base.entity.statistique.services.RebondServices;
import com.example.spring_acces_base.entity.statistique.services.StatistiqueServices;
import com.example.spring_acces_base.entity.statistique.services.TirServices;
import com.example.spring_acces_base.entity.statistique.services.TirTypeServices;
import com.example.spring_acces_base.entity.views.services.Statistique_allServices;
import com.example.spring_acces_base.response.Response;

@RestController
@RequestMapping("/stat")
@CrossOrigin
public class StatController {

    private StatistiqueServices statistiqueService;
    private MinuteServices minuteService;
    private PasseDServices passeDServices;
    private RebondServices rebondServices;
    private TirServices tirServices;
    private Statistique_allServices statistique_allServices;


    public StatController(StatistiqueServices statistiqueService, MinuteServices minuteService, PasseDServices passeDServices, RebondServices rebondServices, TirServices tirServices, TirTypeServices tirTypeServices, Statistique_allServices statistique_allServices){
        this.statistiqueService = statistiqueService;
        this.minuteService = minuteService;
        this.passeDServices = passeDServices;
        this.rebondServices = rebondServices;
        this.tirServices = tirServices;
        this.statistique_allServices = statistique_allServices;
    }

    @GetMapping("/addrebond")
    public Response addMacth(@RequestBody Rebond rebond){
        Response response = new Response();
        Object temp = null;

        try {
            temp = this.rebondServices.save(rebond);
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

    @GetMapping("/addpasse")
    public Response addPass(@RequestBody PasseD passeD){
        Response response = new Response();
        Object temp = null;

        try {
            temp = this.passeDServices.save(passeD);
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

    @GetMapping("/addstat")
    public Response addStat(@RequestBody Statistique statistique){
        Response response = new Response();
        Object temp = null;

        try {
            temp = this.statistiqueService.save(statistique);
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

    @GetMapping("/addminute")
    public Response addMin(@RequestBody Minute minute){
        Response response = new Response();
        Object temp = null;

        try {
            temp = this.minuteService.save(minute);
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

    @GetMapping("/addtire")
    public Response addMin(@RequestBody Tir tir){
        Response response = new Response();
        Object temp = null;

        try {
            temp = this.tirServices.save(tir);
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

    @GetMapping("/statistique")
    public Response addMin(){
        Response response = new Response();
        Object temp = null;

        try {
            temp = this.statistique_allServices.findAll();
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
