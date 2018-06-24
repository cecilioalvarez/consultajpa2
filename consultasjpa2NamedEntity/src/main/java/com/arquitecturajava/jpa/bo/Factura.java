package com.arquitecturajava.jpa.bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Facturas")
public class Factura {
	
	@Id
	private int numero;
	private String concepto;
	private Date fecha;
	@ManyToOne
	@JoinColumn(name="clientes_dni")
	private Cliente cliente;
	
	@OneToMany(mappedBy="factura")
	private List<LineaFactura> lineas=new ArrayList<LineaFactura>();
	
	public List<LineaFactura> getLineas() {
		return lineas;
	}
	public void setLineas(List<LineaFactura> lineas) {
		this.lineas = lineas;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Factura() {
		super();
	}
	public Factura(int numero, String concepto, Date fecha, Cliente cliente) {
		super();
		this.numero = numero;
		this.concepto = concepto;
		this.fecha = fecha;
		this.cliente = cliente;
	}
	
	
}
