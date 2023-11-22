package ar.edu.unlam.pb2;

public class TarjetaDeDebito extends Tarjeta implements Pagadora {


final Integer CantidadDeDigitosDeTarjetaDeDebito = 16;
	public TarjetaDeDebito(Long numero, String titular, String fechaDeVencimiento,
			Integer codigoDeSeguridad) throws NumeroDeTarjetaInvalidoException {
		this.setCodigoDeSeguridad(codigoDeSeguridad);
		this.setFechaDeVencimiento(fechaDeVencimiento);
		this.setTitular(titular);
		this.setNumero(numero);
		this.setSaldo(0.0);
	}

	
	
	
	public Long getNumero() {
		return numero;
	}





	@Override
	public Boolean pagar(Persona vendedor, Double importe) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
		
	}




	@Override
	public Double getSaldo() {
		// TODO Auto-generated method stub
		return null;
	}

}
