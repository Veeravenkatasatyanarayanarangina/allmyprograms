package com.hcl.gl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.gl.entity.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer>
{

}
