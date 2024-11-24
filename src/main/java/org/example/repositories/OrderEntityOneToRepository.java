package org.example.repositories;

import org.example.entity.OrderEntityOneTo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderEntityOneToRepository extends JpaRepository<OrderEntityOneTo, Long> {

}