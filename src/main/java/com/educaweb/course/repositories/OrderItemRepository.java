package com.educaweb.course.repositories;

import com.educaweb.course.entities.OrderItem;
import com.educaweb.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
