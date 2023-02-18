package com.example.demo.service;

import com.example.demo.modelo.Item;

public interface IItemService {

	public void ingresarItems(Item item);
	public Integer consultarStock(Integer stock);

}
