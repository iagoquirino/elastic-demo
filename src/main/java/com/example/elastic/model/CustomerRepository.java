package com.example.elastic.model;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @author iago
 */
@Repository
public interface CustomerRepository extends ElasticsearchRepository<Customer, Long> {

}
