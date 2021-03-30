package com.example.mytest.modele;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

public class Candidat {
    private int can_id;
    private String can_nom;
    private String can_prenom;
    private String can_mail;
    private int can_option;
    private int can_bac;
    private int can_optionBac;
    private int can_etablissement;


    public Candidat(int can_id, String can_nom, String can_prenom, String can_mail, int can_option, int can_bac, int can_optionBac, int can_etablissement) {
        this.can_id = can_id;
        this.can_nom = can_nom;
        this.can_prenom = can_prenom;
        this.can_mail = can_mail;
        this.can_option = can_option;
        this.can_bac = can_bac;
        this.can_optionBac = can_optionBac;
        this.can_etablissement = can_etablissement;
    }

    public int getCan_id() {
        return can_id;
    }

    public String getCan_nom() {
        return can_nom;
    }

    public String getCan_prenom() {
        return can_prenom;
    }

    public String getCan_mail() {
        return can_mail;
    }

    public int getCan_option() {
        return can_option;
    }

    public int getCan_bac() {
        return can_bac;
    }

    public int getCan_optionBac() {
        return can_optionBac;
    }

    public int getCan_etablissement() {
        return can_etablissement;
    }

    public void setCan_id(int can_id) {
        this.can_id = can_id;
    }

    public void setCan_nom(String can_nom) {
        this.can_nom = can_nom;
    }

    public void setCan_prenom(String can_prenom) {
        this.can_prenom = can_prenom;
    }

    public void setCan_mail(String can_mail) {
        this.can_mail = can_mail;
    }

    public void setCan_option(int can_option) {
        this.can_option = can_option;
    }

    public void setCan_bac(int can_bac) {
        this.can_bac = can_bac;
    }

    public void setCan_optionBac(int can_optionBac) {
        this.can_optionBac = can_optionBac;
    }

    public void setCan_etablissement(int can_etablissement) {
        this.can_etablissement = can_etablissement;
    }



    public JSONArray convertToJSONArray(){
        List laListe = new ArrayList();
        laListe.add(can_id);
        laListe.add(can_nom);
        laListe.add(can_prenom);
        laListe.add(can_mail);
        laListe.add(can_bac);
        laListe.add(can_option);
        laListe.add(can_optionBac);
        laListe.add(can_etablissement);
        return new JSONArray(laListe);
    }

}


