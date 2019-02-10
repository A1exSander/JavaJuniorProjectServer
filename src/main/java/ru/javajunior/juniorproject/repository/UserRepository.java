package ru.javajunior.juniorproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import ru.javajunior.juniorproject.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("SELECT u FROM User u WHERE u.login = :login AND u.password = :password")
    User findUser(@Param("login") String login, @Param("password") String password);
}
