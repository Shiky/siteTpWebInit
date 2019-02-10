package com.MathieuSIO.siteTpWeb.ressources;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoriesRepository extends CrudRepository<Categories,Long>

{


    List<Categories> findByID(int ID);//liste d'id de categorie
    List<Categories> findByLabell( String Label);
    @Query("select A from Categorie A where A.ID = :IdA or A.label = :Label")
    List<Categories> trouverCategorieParIdOuLabel(@Param("id") String categ, @Param("label") int Label);
}
