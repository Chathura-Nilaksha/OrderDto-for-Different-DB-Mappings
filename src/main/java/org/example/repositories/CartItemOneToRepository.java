package org.example.repositories;

import org.example.entity.CartItemEntityEmbd;
import org.example.entity.CartItemEntityOneTo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemOneToRepository extends JpaRepository<CartItemEntityOneTo, Long> {

}

