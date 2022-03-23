package com.br.vexcanecas.pcontrol.repositories;

import com.br.vexcanecas.pcontrol.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
