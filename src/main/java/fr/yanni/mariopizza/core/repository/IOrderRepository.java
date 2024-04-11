package fr.yanni.mariopizza.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.yanni.mariopizza.core.domain.Order;

@Repository

public interface IOrderRepository extends JpaRepository<Order, Long> {

}
