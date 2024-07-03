package com.ecommerce_microservices.customer.repositories;

import com.ecommerce_microservices.customer.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {}
