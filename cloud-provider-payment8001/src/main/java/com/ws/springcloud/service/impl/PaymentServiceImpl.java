package com.ws.springcloud.service.impl;

import com.ws.springcloud.dao.PaymentDao;
import com.ws.springcloud.entities.Payment;
import com.ws.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: tw
 * @Date: 2020/11/24 11:58
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}
