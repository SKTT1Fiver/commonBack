package org.example.commonback.repository;

import org.example.commonback.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @author SKTT1Fiver
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    @Query("select u from UserEntity u where u.username = ?1")
    UserEntity findByUsername(String username);
}
