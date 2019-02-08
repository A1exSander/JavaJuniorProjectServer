package ru.javajunior.juniorproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import ru.javajunior.juniorproject.entity.Ingredient;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {

}
