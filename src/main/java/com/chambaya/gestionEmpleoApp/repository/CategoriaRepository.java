package com.chambaya.gestionEmpleoApp.repository;

import com.chambaya.gestionEmpleoApp.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
<<<<<<< HEAD
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
=======
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
>>>>>>> 691d4df4ba3100a06721ebd6ec16390380ed9b2f
}
