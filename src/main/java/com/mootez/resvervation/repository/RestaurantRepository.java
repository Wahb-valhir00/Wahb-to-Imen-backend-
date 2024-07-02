package com.mootez.resvervation.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mootez.resvervation.model.Restaurant;

@Repository

public interface RestaurantRepository extends MongoRepository<Restaurant,String> {
    
}