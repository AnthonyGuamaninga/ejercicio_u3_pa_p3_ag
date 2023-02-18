package com.example.demo.repository;

import com.example.demo.modelo.Item;

public interface IItemRepo {

	public void insertar(Item item);
	public void actualizar(Item item);
	
	public boolean existe(String codigoBarras);
	
	public Integer consultarStock(Integer stock);
	
	
}
