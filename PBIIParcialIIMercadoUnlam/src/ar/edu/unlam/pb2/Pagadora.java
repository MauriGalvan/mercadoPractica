package ar.edu.unlam.pb2;

public interface Pagadora {

	Boolean pagar(Persona vendedor, Double importe);



	String getTitular();


	Double getSaldo();


	

	void setSaldo(Double d);



	Long getNumero();




	
	
	

	
}
