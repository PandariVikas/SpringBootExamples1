package com.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.entity.Discount;
@Repository
public interface DiscountRepo extends JpaRepository<Discount, String> {

}
