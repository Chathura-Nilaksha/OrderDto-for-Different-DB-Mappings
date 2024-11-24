package org.example.repositories;

import org.example.entity.OrderEntityEmbd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderEntityEmbdRepository extends JpaRepository<OrderEntityEmbd, Long> {

}