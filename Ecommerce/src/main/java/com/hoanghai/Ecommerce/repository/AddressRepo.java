package com.hoanghai.Ecommerce.repository;

import com.hoanghai.Ecommerce.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, Long> {
}

