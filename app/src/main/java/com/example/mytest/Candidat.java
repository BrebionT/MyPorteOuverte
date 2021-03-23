package com.example.mytest;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

public class Candidat {
    private int can_id;
    private String can_nom;
    private String can_prenom;
    private String can_mail;

    public Candidat(int can_id, String can_nom, String can_prenom){
        this.can_id = can_id;
        this.can_nom = can_nom;
        this.can_prenom = can_prenom;
    }

    public int getCan_id(){
        return can_id;
    }

    public void setCan_id(int id){
        this.can_id = id;
    }

    public String getCan_nom(){
        return can_nom;
    }

    public void setCan_nom(String nom){
        this.can_nom = nom;
    }

    public String getCan_prenom(){
        return can_prenom;
    }

    public void setCan_prenom(String prenom){
        this.can_prenom = prenom;
    }

    public String getCan_mail(){
        return can_mail;
    }

    public void setCan_mail(String mail){
        this.can_mail = mail;
    }

    public JSONArray convertToJSONArray(){
        List laListe = new ArrayList();
        laListe.add(can_id);
        laListe.add(can_nom);
        laListe.add(can_prenom);
        laListe.add(can_mail);
        return new JSONArray(laListe);
    }
}


