package com.example.demo.service;

import com.example.demo.exceptions.NotEnoughMoneyException;
import com.example.demo.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException();
    }
}
