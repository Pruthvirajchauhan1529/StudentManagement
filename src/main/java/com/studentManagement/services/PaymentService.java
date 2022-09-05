package com.studentManagement.services;

import com.studentManagement.entites.Check;
import com.studentManagement.entites.CreditCard;
import com.studentManagement.entites.Payment;

public interface PaymentService {

    CreditCard save(CreditCard creditCard);
    Check save(Check check);
}
