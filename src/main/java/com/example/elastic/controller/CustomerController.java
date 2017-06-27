package com.example.elastic.controller;

import static com.google.common.collect.Lists.newArrayList;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.elastic.model.Customer;
import com.example.elastic.model.CustomerRepository;
import com.google.common.collect.Lists;

/**
 * @author iago
 */
@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository repository;

    @GetMapping
    public List<Customer> get(){
        return newArrayList(repository.findAll());
    }

    @GetMapping(value = "/{id}")
    public Customer get(@PathVariable Long id){
        return repository.findOne(id);
    }

    @PostMapping
    public Customer post(@RequestBody Customer customer){
        return repository.save(customer);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){
        repository.delete(id);
    }


}
