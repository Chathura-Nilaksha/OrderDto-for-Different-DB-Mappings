package org.example.repositories;

import org.example.entity.CartItemEntityEmbd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemEmbdRepository extends JpaRepository<CartItemEntityEmbd, Long> {

}

