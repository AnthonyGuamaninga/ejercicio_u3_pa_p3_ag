package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Item;
import com.example.demo.repository.IItemRepo;

@Service
public class ItemServiceImpl implements IItemService {

	@Autowired
	private IItemRepo iItemRepo;
	@Override
	public void ingresarItems(Item item) {
		// TODO Auto-generated method stub
		
		if(this.iItemRepo.existe(item.getCodigoBarras())) {
			this.iItemRepo.actualizar(item);
		}else {
			this.iItemRepo.insertar(item);
		}
		
		
		
	}
	@Override
	public Integer consultarStock(Integer stock) {
		// TODO Auto-generated method stub
		return null;
	}

}
