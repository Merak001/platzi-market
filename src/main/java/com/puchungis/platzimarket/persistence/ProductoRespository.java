package com.puchungis.platzimarket.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.puchungis.platzimarket.persistence.crud.ProductoCrudRepository;
import com.puchungis.platzimarket.persistence.entity.Producto;


@Repository
public class ProductoRespository {
	private ProductoCrudRepository productoCrudRepository;
	
	public List<Producto> getAll(){
				//Esto caste la lista T a lsita Producto	
		return  (List<Producto>) productoCrudRepository.findAll();
	}

	public List<Producto> getByCategoria(int idCategoria){
		return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
		
	}
	
	public Optional<List<Producto>> getEscasos(int cantidad){
		return productoCrudRepository.findByCantidadStockLessThanEstado(cantidad, true);
	}
	
	public Optional<Producto> getProducto(int idProducto){
		return productoCrudRepository.findById(idProducto);
	}

	public Producto save(Producto producto) {
		return productoCrudRepository.save(producto);
	}

	public void delateProduco(int idProducto) {
		productoCrudRepository.deleteById(idProducto);
	}
	
	
}
