package com.day5.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day5.Model.PaymentModel;

public interface Paymentrepo extends JpaRepository<PaymentModel, Integer>{

}
