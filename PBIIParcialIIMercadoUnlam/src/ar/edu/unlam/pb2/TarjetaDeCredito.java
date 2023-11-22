package ar.edu.unlam.pb2;

public class TarjetaDeCredito extends Tarjeta implements Pagadora {
	
	private Double limiteDeCompraEnPesos ;
	private Double limiteDeCompraEnDolares ;
	
	public TarjetaDeCredito(Long numero, String titular, String fechaVencimiento,
			Integer codigoSeguridad, Double limiteCompraEnPesos, Double limiteDeCompraEnDolares) throws NumeroDeTarjetaInvalidoException {
		this.setNumero(numero);
		this.setCodigoDeSeguridad(codigoDeSeguridad);
		this.setFechaDeVencimiento(fechaDeVencimiento);
		this.setTitular(titular);
		this.setLimiteDeCompraEnPesos(limiteDeCompraEnPesos);
		this.setLimiteDeCompraEnDolares(limiteDeCompraEnPesos);
		
	}

	public Double getLimiteDeCompraEnPesos() {
		return limiteDeCompraEnPesos;
	}

	public void setLimiteDeCompraEnPesos(Double limiteDeCompraEnPesos) {
		this.limiteDeCompraEnPesos = limiteDeCompraEnPesos;
	}

	public Double getLimiteDeCompraEnDolares() {
		return limiteDeCompraEnDolares;
	}

	public void setLimiteDeCompraEnDolares(Double limiteDeCompraEnDolares) {
		this.limiteDeCompraEnDolares = limiteDeCompraEnDolares;
	}

	@Override
	public Boolean pagar(Persona vendedor, Double importe) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSaldo(Double d) {
		// TODO Auto-generated method stub

	}

	@Override
	public Double getSaldo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getNumero() {
		// TODO Auto-generated method stub
		return null;
	}


	
	
	
}
