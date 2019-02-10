package com.MathieuSIO.siteTpWeb.ressources;

import java.io.Serializable;
import java.util.Date;

public class Annonces implements Serializable {
    int ID ;
    String Nom;
    String contenu;
    Date debut;
    Date fin;
    int uploader;
    int categorie;

    public Annonces(int ID, String nom, String contenu, Date debut, Date fin, int uploader, int categories) {
        this.ID = ID;
        Nom = nom;
        this.contenu = contenu;
        this.debut = debut;
        this.fin = fin;
        this.uploader = uploader;
        this.categorie = categories;
    }

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

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenue) {
        this.contenu = contenue;
    }

    public Date getDebut() {
        return debut;
    }

    public void setDebut(Date debut) {
        this.debut = debut;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public int getUploader() {
        return uploader;
    }

    public void setUploader(int uploader) {
        this.uploader = uploader;
    }

    public int getCategorie() {
        return categorie;
    }

    public void setCategorie(int categories) {
        this.categorie = categories;
    }
}
