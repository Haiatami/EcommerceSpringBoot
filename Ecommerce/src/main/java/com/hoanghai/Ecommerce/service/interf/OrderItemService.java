package com.hoanghai.Ecommerce.service.interf;

import com.hoanghai.Ecommerce.dto.OrderRequest;
import com.hoanghai.Ecommerce.dto.Response;
import com.hoanghai.Ecommerce.enums.OrderStatus;
import org.springframework.data.domain.Pageable;

import java.time.LocalDateTime;

public interface OrderItemService {
    Response placeOrder(OrderRequest orderRequest);
    Response updateOrderItemStatus(Long orderItemId, String status);
    Response filterOrderItems(OrderStatus status, LocalDateTime startDate, LocalDateTime endDate, Long itemId, Pageable pageable);
}
