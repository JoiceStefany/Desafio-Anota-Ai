package com.joicelima.desafio.anota.ai.repositories;

import com.joicelima.desafio.anota.ai.domain.category.product.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
}
