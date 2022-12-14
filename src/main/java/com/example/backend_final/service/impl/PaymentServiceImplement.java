/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.backend_final.service.impl;



import java.util.List;

import com.example.backend_final.model.Payment;
import com.example.backend_final.repository.PaymentRepository;
import com.example.backend_final.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PhucNguyen
 */
@Service
public class PaymentServiceImplement implements PaymentService {
    
    @Autowired
    private PaymentRepository paymentRepository;
    
    @Override
    public List<Payment> getAll() {
        return paymentRepository.findAll();
    }
    
    @Override
    public Payment getPaymentById(int id) {
        return paymentRepository.findById(id).orElse(null);
    }
    
    @Override
    public Payment savePayment(Payment payment) {
        return paymentRepository.save(payment);
    }
    
    @Override
    public String deletePayment(int id) {
        paymentRepository.deleteById(id);
        return "Đã xóa thành công !";
    }
    
    @Override
    public Payment updatePayment(Payment payment) {
    	if(paymentRepository.findById(payment.getPaymentID()).get()!=null) {
    		return paymentRepository.save(payment);
    	}
    	else {
    		return null;
    	}
    }

    @Override
    public List<Payment> saveListPayment(List<Payment> listPayment) {
       return paymentRepository.saveAll(listPayment);
    }

    
}
