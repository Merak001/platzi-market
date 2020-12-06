package com.puchungis.platzimarket.persistence;

import java.util.List;
import java.util.Optional;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;
import com.puchungis.platzimarket.persistence.crud.ProductoCrudRepository;
import com.puchungis.platzimarket.persistence.entity.Producto;

import org.springframework.expression.spel.ast.PropertyOrFieldReference;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Repository ->Le indicamos a Sprint que esta clase es la que se encarga de interactuar con la DB
//@Component -> Con esta annotacion se indica que esta clase es un componete de sprint. Pero Repositori espesifica que tipo de componente se trata
@Repository
public class ProductoRepository {

	/* / Estas son lo querys que se estan lanzando a la BD con esta framework */
	private ProductoCrudRepository productoCrudRepository;

	// Metodo para devolvet todos los productos disponibles
	public List<Producto> getAll() {
		// Los parentesis son para castetar lo que devuleve el objeto Iterable<T>
		// findAll(); a una lista para el casteo se deve poner en que tipo de variable
		// se desea castear
		return (List<Producto>) productoCrudRepository.findAll();
	}

	// Busca lo que allá en la Clase Producto
	public List<Producto> getByCategoria(int idCategoria) {
		return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
	}

	/**
	 * Retorna una lista de productos que sean escasos
	 * 
	 * @param cantidad Cuantos productos son escaos para mi ejem : 10
	 * @return Retorna una lista de productos
	 */
	public Optional<List<Producto>> getEscasos(int cantidad) {

		return productoCrudRepository.findByCantidadStockLessThanEstado(cantidad, true);
	}

	public Optional<Producto> getProducto(int id){
		return productoCrudRepository.findById(id);
	}

}
