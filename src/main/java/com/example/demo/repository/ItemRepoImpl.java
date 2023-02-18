package com.example.demo.repository;

import org.hibernate.query.NativeQuery;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Item;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class ItemRepoImpl implements IItemRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Item item) {
		// TODO Auto-generated method stub
		this.entityManager.persist(item);
	}

	@Override
	public boolean existe(String codigoBarras) {
		// TODO Auto-generated method stub
		Query query = this.entityManager.createNamedQuery("Item.validarExistencia");
		query.setParameter("datoCodigo", codigoBarras);
		return query.getResultList().isEmpty();
	}

	@Override
	public void actualizar(Item item) {
		// TODO Auto-generated method stub
		this.entityManager.merge(item);
	}

	@Override
	public Integer consultarStock(Integer stock) {
		// TODO Auto-generated method stub
		CriteriaBuilder builder = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Item> criteriaQuery = builder.createQuery(Item.class);
		Root<Item> root = criteriaQuery.from(Item.class);
		
		Predicate predicate = builder.equal(root.get("stock"), stock);
		
		
		
		
		return null;
	}

}
