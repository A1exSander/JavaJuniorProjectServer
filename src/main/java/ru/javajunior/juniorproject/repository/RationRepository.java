package ru.javajunior.juniorproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.javajunior.juniorproject.entity.Ration;

public interface RationRepository extends JpaRepository<Ration, Integer> {

}
