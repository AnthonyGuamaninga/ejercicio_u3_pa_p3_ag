package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Factura;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class FacturaRepoImpl implements IFacturaRepo {

	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void insertar(Factura facura) {
		// TODO Auto-generated method stub
		this.entityManager.persist(facura);
	}

}
