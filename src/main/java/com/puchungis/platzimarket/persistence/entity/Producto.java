package com.puchungis.platzimarket.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto {

	@Id
	@PrimaryKeyJoinColumn
	@Column(name = "id_producto")
	private Integer idProducto;

	private String nombre;

	private Boolean estado;

	@Column(name = "id_categoria")
	private Integer idCategoria;

	@Column(name = "codigo_barras")
	private String codigoBarras;

	@Column(name = "precio_venta")
	private Integer precioVenta;

	@Column(name = "cantidad_stock")
	private Integer cantidadStock;

	@ManyToOne
	@JoinColumn(name = "id_categoria" /*
										 * * Osea apuntamos a como se llama la colmna dentro de la DB en la tabla Categoria y no dentro de la
										 * clase Categorias
										 */
			, insertable = false, updatable = false) // Que no podemos modificasr ni eliminar ni agregar ning�n valor
														// desde esta clase solo consultar
	private Categoria categoria;
	
	
	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public Integer getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(Integer precioVenta) {
		this.precioVenta = precioVenta;
	}

	public Integer getCantidadStock() {
		return cantidadStock;
	}

	public void setCantidadStock(Integer cantidadStock) {
		this.cantidadStock = cantidadStock;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
}