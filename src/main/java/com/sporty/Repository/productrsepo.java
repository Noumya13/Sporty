package com.sporty.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sporty.model.productsmodel;

@Repository

public interface productrsepo extends CrudRepository<productsmodel,Integer> {

}
