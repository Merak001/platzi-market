package com.puchungis.platzimarket.persistence.crud;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.puchungis.platzimarket.persistence.entity.Producto;

// Con este crudo vamos manipular la case Prducto y te pide su tipo de la primary key  que es el ID de tipo Integer
public interface ProductoCrudRepository extends CrudRepository<Producto, Integer>{
 
	List<Producto> findByIdCategoriaOrderByNombreAsc(Integer idCategoria);
	
	Optional<List<Producto>>findByCantidadStockLessThanEstado(int cantidadStock,boolean estado);
	
}
