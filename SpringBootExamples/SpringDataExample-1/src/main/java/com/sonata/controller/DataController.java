package com.sonata.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sonata.model.product;
import com.sonata.productrepository.ProductRepository;

@RestController
public class DataController {
@Autowired
ProductRepository proRepository;

@GetMapping("/product")
public List<product> getAllProduct(){
	return proRepository.findAll();
}

@PostMapping("/product")
public product saveProduct(@RequestBody product prod){
	return proRepository.save(prod);
}

@RequestMapping("/product/{p_id}")
public product getProduct(@PathVariable long p_id){
	return proRepository.findById(p_id).get();
} 

@GetMapping("/product/DeleteProduct/{p_id}")
public void getDelete(@PathVariable long p_id){
	 proRepository.deleteById(p_id);
}

//@PostMapping("/product/UpdateProduct/{p_id}/{p_name}")
//public void getUpdate(@PathVariable long p_id,String p_name){
//	 proRepository.findById(p_id).get().setP_name(p_name);
//}
@PutMapping("product/UpdateProduct/{pid}")
public product updateProductById(@PathVariable long pid, @RequestBody product prod) {
	if(!proRepository.existsById(pid)) {
		throw new RuntimeException("Product doesn't exist with id");
	}
	prod.setP_id(pid);
	return proRepository.save(prod);
}
}


