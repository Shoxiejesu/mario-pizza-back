package fr.yanni.mariopizza.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.yanni.mariopizza.core.domain.Order_line;

@Repository
public interface IOrder_lineRepository extends JpaRepository<Order_line, Short> {

}
