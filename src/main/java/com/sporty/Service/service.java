package com.sporty.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sporty.Repository.productrsepo;
import com.sporty.model.productsmodel;

@Service
public class service {
	
@Autowired	
productrsepo repo;
public List<productsmodel> getproducts()
{
	List<productsmodel> obj=new ArrayList<>();
	repo.findAll().forEach(m->obj.add(m));
	return obj;
	
}

}
