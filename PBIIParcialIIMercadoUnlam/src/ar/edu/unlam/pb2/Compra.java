package ar.edu.unlam.pb2;

public class Compra {
private Long comercio;
private Double importeCompra;
private Boolean pagada;

	public Compra(Long comercio, Double importeCompra) {
		this.setComercio(comercio);
		this.setImporteCompra(importeCompra);
	}

	public Long getComercio() {
		return comercio;
	}

	public void setComercio(Long comercio) {
		this.comercio = comercio;
	}

	public Double getImporteCompra() {
		return importeCompra;
	}

	public void setImporteCompra(Double importeCompra) {
		this.importeCompra = importeCompra;
	}

	public Boolean getPagada() {
		return pagada;
	}

	public void setPagada(Boolean pagada) {
		this.pagada = pagada;
	}

}
