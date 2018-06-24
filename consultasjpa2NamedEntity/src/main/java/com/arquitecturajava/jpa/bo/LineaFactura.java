package com.arquitecturajava.jpa.bo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="LineasFactura")
public class LineaFactura {

	@Id
	private int numero;
	private String concepto;
	private int importe;
	@ManyToOne
	@JoinColumn(name="facturas_numero")
	private Factura factura;
	
	public LineaFactura(int numero, String concepto, int importe, Factura factura) {
		super();
		this.numero = numero;
		this.concepto = concepto;
		this.importe = importe;
		this.factura = factura;
	}
	
	public LineaFactura() {
		super();
	}
	
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public int getImporte() {
		return importe;
	}
	public void setImporte(int importe) {
		this.importe = importe;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Factura getFactura() {
		return factura;
	}
	public void setFactura(Factura factura) {
		this.factura = factura;
	}
}
