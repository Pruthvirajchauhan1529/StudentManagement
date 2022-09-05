package com.studentManagement.controller;

import com.studentManagement.entites.Check;
import com.studentManagement.entites.CreditCard;
import com.studentManagement.entites.Payment;
import com.studentManagement.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("My-Payment")
@RestController
public class PaymentController {
    @Autowired
    PaymentService paymentService;
    @PostMapping("/creditCard")
    public CreditCard addPayment(@RequestBody CreditCard creditCard){
        return paymentService.save(creditCard);
    }
    @PostMapping("/check")
    public Check addPaymentCh(@RequestBody Check check){
        return paymentService.save(check);
    }
}
