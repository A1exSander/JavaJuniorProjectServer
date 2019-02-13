package ru.javajunior.juniorproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.javajunior.juniorproject.entity.Ingredient;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {
    @Query("SELECT i FROM Ingredient i WHERE i.ingredientId = :ingredientId")
    Ingredient findIngredientById(@Param("ingredientId") int ingredientId);
}
