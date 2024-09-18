package com.hoanghai.Ecommerce.repository;

import com.hoanghai.Ecommerce.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {
}
