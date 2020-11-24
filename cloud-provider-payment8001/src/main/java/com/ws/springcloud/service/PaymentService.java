package com.ws.springcloud.service;

import com.ws.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: tw
 * @Date: 2020/11/24 11:57
 */

public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
