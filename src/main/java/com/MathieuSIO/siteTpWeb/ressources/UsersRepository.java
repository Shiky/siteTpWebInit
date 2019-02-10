package com.MathieuSIO.siteTpWeb.ressources;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UsersRepository extends CrudRepository<Users,Long>

{


    List<Users> findByID(int ID);//liste d'id par id de users
    List<Users> findByName( String nom);
    @Query("select A from Users A where A.ID = :IdA or A.nom = :nom")
    List<Users> trouverCategorieParIdOuLabel(@Param("id") String ident, @Param("nom") int nom);
}
