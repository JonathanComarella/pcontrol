package com.br.vexcanecas.pcontrol.services;

import com.br.vexcanecas.pcontrol.dto.ProductDTO;
import com.br.vexcanecas.pcontrol.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;


    @Transactional(readOnly = true)
    public List<ProductDTO> findAllProducts() {
        return repository.findAll().stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
    }
}
