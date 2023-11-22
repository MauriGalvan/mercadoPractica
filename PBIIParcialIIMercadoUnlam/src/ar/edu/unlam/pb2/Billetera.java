package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Billetera {
	
	private String nombre;
	private Set<Comercio> comercios;
	private Set<Consumidor> consumidores;
	
	private Map<MedioDePago, Integer> mediosDePago;
	
	private List<Compra> compras;

	
	
	public Billetera(String nombre) {
		this.setNombre(nombre);
		this.comercios = new HashSet<Comercio>();
		this.consumidores = new TreeSet<Consumidor>();
		this.mediosDePago = new HashMap<>();
		this.compras = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarComercio(Comercio nuevoComercio) {
		
		comercios.add(nuevoComercio);
	}

	public Integer getCantidadDeComercios() {
		
		return comercios.size();
	}

	public void agregarConsumidor(Consumidor nuevoConsumidor) {
		this.consumidores.add(nuevoConsumidor);
		
	}

	public Integer getCantidadDeConsumidores() {
		
		return consumidores.size();
	}

	public void agregarMedioDePago(Integer dniConsumidor, MedioDePago nuevoMedioDePago) throws NoCoincideTitularException, DniInvalidoException {
		Consumidor consumidor = buscarConsumidor(dniConsumidor);
		if(consumidor == null) {
			throw new DniInvalidoException();
		}
		if(consumidor.getNombre().equalsIgnoreCase(nuevoMedioDePago.getTitular())) {
			throw new NoCoincideTitularException();
		};
		mediosDePago.put(nuevoMedioDePago, dniConsumidor);
	}

	private Consumidor buscarConsumidor(Integer dni) {
		for (Consumidor actual: consumidores) {
			if(actual.getDni().equals(dni)) {
				return actual;
			}
		}
		return null;
	}

	public Integer getCantidadDeMediosDePago(Integer dni) {
		Integer cantidadMedioPago =0;
		for(Map.Entry<MedioDePago, Integer> actual : mediosDePago.entrySet()) {
			if(dni.equals(actual.getValue())) {
				return  cantidadMedioPago++;
			}
		}
		return null;
	}

	public Compra generarCodigoQR(Long cuitComercio, Double importeCompra) {
		Compra nueva = new Compra(cuitComercio, importeCompra);
		
		return nueva;
	}

	private Comercio buscarComercio(Long cuitComercio) {
		for (Comercio actual: comercios){
			if(actual.getCuit().equals(cuitComercio)) {
				return actual;
			}
			
		}
		return null;
	}
	public Consumidor getConsumidor(Integer dni) {
		return buscarConsumidor(dni);
	}
	public Boolean pagar(Compra codigoQr,MedioDePago medioPagador) {
		for (Compra actual: compras) {
			if(actual == codigoQr) {
	// resta validar el saldo y actualizar saldo en el caso de las cuentas
//				if() {
//					
//				}
				codigoQr.setPagada(true);
				return true;
			}
		}
		return false;
	}





}
