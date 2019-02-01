package com.MathieuSIO.siteTpWeb.ressources;

public class CategorieResource {
    int ID;
    String label;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public CategorieResource(int ID, String label) {
        this.ID = ID;
        this.label = label;
    }
}
