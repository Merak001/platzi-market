package com.puchungis.platzimarket.persistence.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "compras_productos")
public class ComprasProducto {

	@EmbeddedId
	private ComprasProductoPK id;
	private Integer cantidad;
	private Integer total;
	private boolean estado;
	
	
	
	@ManyToOne
	@JoinColumn(name="id_compra",insertable = false,updatable = false)
	private Compra compras;

	
	
	@ManyToOne
	@JoinColumn(name = "id_producto",insertable = false,updatable = false)
	private Producto producto;
	
	
	
	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

}