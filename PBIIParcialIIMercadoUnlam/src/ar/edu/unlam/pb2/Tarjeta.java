package ar.edu.unlam.pb2;

import java.util.Objects;

public abstract class Tarjeta extends MedioDePago {
	
	
	protected Long numero;
	protected String titular;
	protected String fechaDeVencimiento;
	protected Integer codigoDeSeguridad;
	protected Double saldo;
	final Integer CantidadDeDigitosDeTarjetaDeDebito = 16;
	

	protected void setNumero(Long numero) throws NumeroDeTarjetaInvalidoException {
		String numeroDeTarjetaEnString = numero.toString();
		if(numeroDeTarjetaEnString.length() != CantidadDeDigitosDeTarjetaDeDebito) {
			throw new NumeroDeTarjetaInvalidoException();
		}
		this.numero = numero;
	}
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getFechaDeVencimiento() {
		return fechaDeVencimiento;
	}

	public void setFechaDeVencimiento(String fechaDeVencimiento) {
		this.fechaDeVencimiento = fechaDeVencimiento;
	}

	public Integer getCodigoDeSeguridad() {
		return codigoDeSeguridad;
	}

	public void setCodigoDeSeguridad(Integer codigoDeSeguridad) {
		this.codigoDeSeguridad = codigoDeSeguridad;
	}

	public abstract Double getSaldo();
	public Boolean pagar(Persona vendedor, Double importe) {
		// TODO Auto-generated method stub
		return null;
	}


	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarjeta other = (Tarjeta) obj;
		return Objects.equals(numero, other.numero);
	}

	protected abstract Integer getNumero();




}
