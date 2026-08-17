package com.jafez.erp_lite.persistence.jpa.repositories;

import com.jafez.erp_lite.persistence.jpa.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<ProductEntity, UUID> {
}
