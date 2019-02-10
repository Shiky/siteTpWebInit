package com.MathieuSIO.siteTpWeb.ressources;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class Categories implements Serializable {
    private static final long serialVersionUID = 853L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    public Categories(int ID, String label) {
        this.ID = ID;
        this.label = label;
    }
}
