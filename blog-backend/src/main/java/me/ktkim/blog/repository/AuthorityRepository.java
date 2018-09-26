package me.ktkim.blog.repository;

import me.ktkim.blog.model.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Keumtae Kim
 */
@Repository
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}