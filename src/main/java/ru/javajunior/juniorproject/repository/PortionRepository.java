package ru.javajunior.juniorproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.javajunior.juniorproject.entity.Portion;

public interface PortionRepository extends JpaRepository<Portion, Integer> {
//    @Query("SELECT p FROM Portion p WHERE p operator ALL (SELECT p FROM Portion p WHERE p.userId = :userId AND p.date = :date")
//    Iterable<Portion> findPortionByUserAndDate(@Param("userId") int userId, @Param("date") String date);
}
