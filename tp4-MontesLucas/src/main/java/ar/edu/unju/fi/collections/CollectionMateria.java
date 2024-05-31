package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import ar.edu.unju.fi.model.Carrera;
import ar.edu.unju.fi.model.Docente;
import ar.edu.unju.fi.model.Materia;



public class CollectionMateria {	

private static List <Materia> materias = new ArrayList<Materia>();
	
	/**Creacion del array lsit carrera**/
	public static List<Materia> getCarreras(){
		Docente docentes = getDocenteBy(1);
		if(materias.isEmpty()) {
			materias.add(new Materia(1, "APU", 82, 10, "Virtual", docentes, "APU"));
			materias.add(new Materia(2, "Ing.Indius", 120, 30, "Presencial", docentes, "Ing.Industrial"));
			materias.add(new Materia(1, "Ing.Inf", 140, 29, "Virtual", docentes, "Ing.Informatica"));
			
		}
		return materias;
	}
	
	private static Docente getDocenteBy(int legajo) {
		Docente[] docentes = null;
		for(Docente docen : docentes) {
			if (docen.getLegajo() == legajo) {
				return docen;
			}		
		}
		return null;
	}
	
	
	
	
	/** Agregar una materia **/
	public static void agregarMateria(Materia materia) {
		materias.add(materia);
	}
	
	/** Eliminar una materia **/
	public static void eliminarMateria(int codigoMateria) {
		Iterator<Materia> iterator = materias.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getCodigo() == codigoMateria) {
				iterator.remove();
			}	
		}	
	}
	
	/** modificar una materia **/
	public static void modificarCarrera(Materia materia) {
		for(Materia materi : materias) {
			if (materi.getCodigo() == materi.getCodigo()) {
				/**FALTA AGREGAR LAS OPCIONES A MODIFICAR**/
			}else {
				System.out.println("No se encontro el codigo de la carrera");
			}
		}
	}
	
	
	/** Buscar una materia **/
	public static Materia buscarCarrera(int codigo){
		Predicate<Materia> filterCodigo = c -> c.getCodigo() == codigo;
		Optional<Materia> materia = materias.stream().filter(filterCodigo).findFirst(); 
		if (materia.isPresent()) {
			return materia.get();
		}else {
			return null;
		}
	}
	
	
	
}
