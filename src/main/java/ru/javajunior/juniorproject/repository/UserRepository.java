package ru.javajunior.juniorproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import ru.javajunior.juniorproject.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
