package com.springbootapi.repository;
import com.springbootapi.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;;

public interface PaymentRepository extends JpaRepository<Payment,Long> {

}
