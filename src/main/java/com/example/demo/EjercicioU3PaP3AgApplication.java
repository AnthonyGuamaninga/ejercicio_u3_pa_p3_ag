package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Factura;
import com.example.demo.modelo.Item;
import com.example.demo.service.IFacturaService;
import com.example.demo.service.IItemService;

@SpringBootApplication
public class EjercicioU3PaP3AgApplication implements CommandLineRunner{

	@Autowired
	private IItemService iItemService;
	
	@Autowired
	private IFacturaService facturaService;
	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioU3PaP3AgApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//FUNCIONALIDAD 1
		Item item = new Item();
		item.setCodigoBarras("a1");
		item.setNombre("Manzana");
		item.setPrecio(new BigDecimal(0.2));
		item.setStock(20);
		item.setTipo("fruta");
		
		this.iItemService.ingresarItems(item);
		
		//FUNCIONALIDAD 2
		this.facturaService.realizarFactura("qw12", 6, "1212", "1");
		
		
		
		//FUNCIONALIDAD 3
		
		
		
	}

}
