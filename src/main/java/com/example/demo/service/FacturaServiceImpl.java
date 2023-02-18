package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Factura;
import com.example.demo.repository.IFacturaRepo;

@Service
public class FacturaServiceImpl implements IFacturaService {

	@Autowired
	private IFacturaRepo facturaRepo; 
	@Override
	public void realizarFactura(String codigoBarras, Integer cantidad, String cedula, String numero) {
		// TODO Auto-generated method stub
		Factura factura = new Factura();
		factura.setCedulaCliente(cedula);
		factura.setFecha(LocalDateTime.now());
		factura.setNumero(numero);
		factura.setTotalVenta(new BigDecimal(2000));
		this.facturaRepo.insertar(factura);
		
		
	}

}
