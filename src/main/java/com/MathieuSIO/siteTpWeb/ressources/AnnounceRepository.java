package com.MathieuSIO.siteTpWeb.ressources;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AnnounceRepository extends CrudRepository<Annonces,Long>

    {
        List<Annonces> findByID(int ID);//rechercher par l'identifiant de annonce
        List<Annonces> findByCategorie(int IdC);//recherche une annonce par la categorie  
        List<Annonces> findByuploader(String auteur);//rechercher une apnnonce par auteur
        List<Annonces> findBycontenu(String Contenu);
        List<Annonces> findByID(String Nom);
        @Query("select A from Annonces A where A.ID = : ID or A.categorie=: IdC or A.uploader= : auteur  or A.nom=Nom")
        List<Annonces> trouverAnnonceIDOuCategorieOuuploader(@Param("ID") int id, @Param("categorie") int coteg, @Param("uploader") String auteur,@Param("Contenu") String contenu);

    }



