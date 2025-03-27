package org.example;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BooKRepository extends JpaRepository<Book,Long> {
}
