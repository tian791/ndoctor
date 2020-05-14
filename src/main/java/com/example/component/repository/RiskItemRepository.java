package com.example.component.repository;

import com.example.component.entity.RiskItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RiskItemRepository extends JpaRepository<RiskItem,Integer> {
}
