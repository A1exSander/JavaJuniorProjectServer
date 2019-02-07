package ru.javajunior.juniorproject.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.javajunior.juniorproject.entity.User;

public interface UserRepository extends PagingAndSortingRepository<User, Integer> {
}
