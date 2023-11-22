package ar.edu.unlam.pb2;

import java.util.Objects;

public class CuentaBancaria extends Cuenta implements Transferible {
	private String cbu;
	
	
	private final Integer largoCbu = 20;


	

	public CuentaBancaria(String cbu, String entidad, String titular) throws CBUInvalidoException {
		this.setCbu(cbu);
		this.entidad = entidad;
		this.titular = titular;
	}
 private void setCbu(String cbu) throws CBUInvalidoException{
	 if(cbu.length()!= largoCbu) {
		 throw new CBUInvalidoException();
	 }
	 this.cbu = cbu;
 }
	@Override
	public Double getSaldo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void depositar(Double importe) {
		// TODO Auto-generated method stub

	}

	@Override
	public Boolean extraer(Double importe) {
		
		return null;
	}

	@Override
	public String getNumero() {
		
		return this.cbu;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cbu);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaBancaria other = (CuentaBancaria) obj;
		return Objects.equals(cbu, other.cbu);
	}

	

}
