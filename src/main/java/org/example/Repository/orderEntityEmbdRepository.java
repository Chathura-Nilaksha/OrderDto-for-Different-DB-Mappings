package org.example.Repository;

import org.example.entity.OrderEntityEmbd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface orderEntityEmbdRepository extends JpaRepository<OrderEntityEmbd, Long> {

}
