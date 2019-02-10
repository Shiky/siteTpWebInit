package com.MathieuSIO.siteTpWeb.ressources;

import java.io.Serializable;
import java.util.Date;

public class Users implements Serializable {
    int ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public Date getDatecreation() {
        return datecreation;
    }

    public void setDatecreation(Date datecreation) {
        this.datecreation = datecreation;
    }

    public Users(int ID, String nom, Date datecreation) {
        this.ID = ID;
        Nom = nom;
        this.datecreation = datecreation;
    }

    String Nom;
    Date datecreation;

}
