package com.buybuy.project.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.buybuy.project.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}