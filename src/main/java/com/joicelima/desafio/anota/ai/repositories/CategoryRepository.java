package com.joicelima.desafio.anota.ai.repositories;

import com.joicelima.desafio.anota.ai.domain.category.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends MongoRepository <Category, String> {
}
