/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.backend_final.service.impl;

import java.util.List;

import com.example.backend_final.model.Orderdetail;
import com.example.backend_final.repository.OrderdetailRepository;
import com.example.backend_final.service.OrderdetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PhucNguyen
 */
@Service
public class OrderdetailServiceImplement implements OrderdetailService {

    @Autowired
    private OrderdetailRepository orderdetailRepository;

    @Override
    public List<Orderdetail> getAll() {
        return orderdetailRepository.findAll();
    }

    @Override
    public Orderdetail getOrderdetailId(int id) {
        return orderdetailRepository.findById(id).orElse(null);
    }

    @Override
    public Orderdetail saveOrderdetail(Orderdetail orderdetail) {
        return orderdetailRepository.save(orderdetail);
    }

    @Override
    public List<Orderdetail> saveListOrderdetail(List<Orderdetail> listOrderdetail) {
        return orderdetailRepository.saveAll(listOrderdetail);
    }

    @Override
    public String deleteOrderdetail(int id) {
        orderdetailRepository.deleteById(id);
        return "Đã xóa thành công !";
    }

    @Override
    public Orderdetail updateOrderdetail(Orderdetail orderdetail) {
        return orderdetailRepository.save(orderdetail);
    }

}