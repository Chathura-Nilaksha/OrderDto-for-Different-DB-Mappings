package org.example.repositories;

import org.example.entity.CustomerAndOrderDataEmbd;
import org.example.entity.CustomerAndOrderDataOneTo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerAndOrderDataEmbdRepository extends JpaRepository<CustomerAndOrderDataEmbd, Long> {
}
