package com.company.businessdomain.order.domain.model;

import com.company.businessdomain.common.domain.Id;

/**
 * 订单id（值对象）
 *
 * @author only
 * @since 2020-05-22
 */
public class OrderId extends Id {
    private OrderId(Long id) {
        super(id);
    }

    public static OrderId create(Long id) {
        return new OrderId(id);
    }
}
