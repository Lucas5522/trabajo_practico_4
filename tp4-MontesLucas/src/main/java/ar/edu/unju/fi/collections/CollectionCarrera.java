package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

import ar.edu.unju.fi.model.Carrera;

@Component
public class CollectionCarrera {

private static List <Carrera> carreras = new ArrayList<Carrera>();
	
	/**Creacion del array lsit carrera**/
	public static List<Carrera> getCarreras(){
		if(carreras.isEmpty()) {
			carreras.add(new Carrera(1, "APU",3, "activo"));
			carreras.add(new Carrera(2, "Ingenieria Industrial",3, "activo"));
			carreras.add(new Carrera(3, "Ingenieria Informatica",3, "Inactivo"));
		}
		return carreras;
	}
	
	/** Agregar una carrera **/
	public static void agregarCarrera(Carrera carrera) {
		carreras.add(carrera);
	}
	
	/** Eliminar una carrera **/
	public static void eliminarCarrera(int codigoCarrera) {
		Iterator<Carrera> iterator = carreras.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getCodigo() == codigoCarrera) {
				iterator.remove();
			}	
		}	
	}
	
	/** modificar una carrera **/
	public static void modificarCarrera(Carrera carrera) {
		for(Carrera carrer : carreras) {
			if (carrer.getCodigo() == carrer.getCodigo()) {
				carrer.setNombre(carrera.getNombre());
				carrer.setCantidadAnios(carrera.getCantidadAnios());
				carrer.setEstado(carrera.getEstado());
			}else {
				System.out.println("No se encontro el codigo de la carrera");
			}
		}
	}
	
	
	/** Buscar una carrera **/
	public static Carrera buscarCarrera(int codigo){
		Predicate<Carrera> filterCodigo = c -> c.getCodigo() == codigo;
		Optional<Carrera> carrera = carreras.stream().filter(filterCodigo).findFirst(); 
		if (carrera.isPresent()) {
			return carrera.get();
		}else {
			return null;
		}
	}
	
	
	
	
}
