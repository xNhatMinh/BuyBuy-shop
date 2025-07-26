package com.buybuy.project.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.buybuy.project.model.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long>{

}