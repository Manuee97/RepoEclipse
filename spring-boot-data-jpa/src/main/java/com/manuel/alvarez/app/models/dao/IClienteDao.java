package com.manuel.alvarez.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.manuel.alvarez.app.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

	
	
}
