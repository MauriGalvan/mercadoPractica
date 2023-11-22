package ar.edu.unlam.pb2;

public interface Transferible {
	
	String getNumero();

	
	void depositar(Double importe);
	Boolean extraer(Double importe);
	String getEntidad();

	String getTitular();


	

}
