package com.example.mytest;

import android.util.Log;

import com.example.mytest.AsyncResponse;

import org.json.JSONArray;

public class AccesDistant implements AsyncResponse {

    private static final String SERVERADDR = "http://172.30.31.16/myporteouverte/serveurcoach.php";

    public AccesDistant() {
        super();
    }


    /**
     *
     * @param output
     */

    @Override
    public void processFinish(String output) {
        Log.d("serveur : ",output);

        String [] message = output.split("%");

    }

    public void envoi (String operation, JSONArray lesDonnesJSON){
        AccesHTTP accesDonnees = new AccesHTTP();

        accesDonnees.delegate = this;

        accesDonnees.addParam("operation", operation);
        accesDonnees.addParam("lesdonnees", lesDonnesJSON.toString());

        accesDonnees.execute(SERVERADDR);
    }
}
