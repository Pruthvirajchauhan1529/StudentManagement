package com.studentManagement.services.serviceimp;


import com.studentManagement.entites.Check;
import com.studentManagement.entites.CreditCard;
import com.studentManagement.repo.PaymentRepository;
import com.studentManagement.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    PaymentRepository paymentRepository;
    @Override
    public CreditCard save(CreditCard creditCard) {
        return paymentRepository.save(creditCard);
    }

    @Override
    public Check save(Check check) {
        return paymentRepository.save(check);
    }
}
