package com.MathieuSIO.siteTpWeb.ressources;

import java.util.Date;

public class AnnoncesResource {
    int ID ;
    String Nom;
    String contenue;
    Date debut;
    Date fin;
    int uploader;
    int categorie;

    public AnnoncesResource(int ID, String nom, String contenue, Date debut, Date fin, int uploader, int categorie) {
        this.ID = ID;
        Nom = nom;
        this.contenue = contenue;
        this.debut = debut;
        this.fin = fin;
        this.uploader = uploader;
        this.categorie = categorie;
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

    public String getContenue() {
        return contenue;
    }

    public void setContenue(String contenue) {
        this.contenue = contenue;
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

    public void setCategorie(int categorie) {
        this.categorie = categorie;
    }
}
