package com.puchungis.platzimarket.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
//Serializable es que los atributos de esta clase se pueden combertir en bites
public class ComprasProductoPK implements Serializable {

	@Column(name = "id_compra")
	private Integer idCompra;

	@Column(name = "id_producto")
	private Integer idProducto;

	
	public Integer getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(Integer idCompra) {
		this.idCompra = idCompra;
	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

}