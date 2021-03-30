package com.example.mytest.controleur;

import android.content.Context;

import com.example.mytest.modele.AccesDistant;
import com.example.mytest.modele.Candidat;

import org.json.JSONArray;

public final class Controle {

    private static Controle instance = null;
    private static Candidat candidat;
    private static String nomFic = "saveprofil";
    private static AccesDistant accesDistant;

    private Controle(){
        super();
    }

    public static final Controle getInstance(Context contexte) {
        if (Controle.instance == null) {
            Controle.instance = new Controle();
            accesDistant = new AccesDistant();
            accesDistant.envoi("lister", new JSONArray());

        }
        return Controle.instance;
    }

    /**
     *
     * @param id
     * @param nom
     * @param prenom
     * @param mail
     * @param option
     * @param bac
     * @param optionBac
     * @param etablissement
     */


    public void creerCandidat(Integer id,String nom, String prenom, String mail, Integer option, Integer bac, Integer optionBac, Integer etablissement){
        candidat = new Candidat(id, nom, prenom, mail,option, bac,optionBac,etablissement);
        accesDistant.envoi("ajoutCandidat", candidat.convertToJSONArray());
    }

}
