package com.sonata.productrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sonata.model.product;

@Repository
public interface ProductRepository extends JpaRepository<product,Long>{
	
}

