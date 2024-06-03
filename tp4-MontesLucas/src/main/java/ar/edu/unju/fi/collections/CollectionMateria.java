package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;


import ar.edu.unju.fi.model.Docente;
import ar.edu.unju.fi.model.Materia;



public class CollectionMateria {	

private static List <Materia> materias = new ArrayList<Materia>();
	
	/**Creacion del array lsit carrera**/
	public static List<Materia> getMateria(){
		if(materias.isEmpty()) {
			materias.add(new Materia(1, "Programacion", 82, 10, "Virtual", "Lic.Tata", "APU"));
			materias.add(new Materia(2, "Historia de la computacion", 120, 30, "Presencial", "Lic.Mono", "Ing.Industrial"));
			materias.add(new Materia(1, "Creacion de aplicaciones", 140, 29, "Virtual", "Lic.Kemo", "Ing.Informatica"));
			
		}
		return materias;
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
	public static void modificarMateria(Materia materia) {
		for(Materia materi : materias) {
			if (materi.getCodigo() == materi.getCodigo()) {
				/**FALTA AGREGAR LAS OPCIONES A MODIFICAR**/
			}else {
				System.out.println("No se encontro el codigo de la carrera");
			}
		}
	}
	
	
	/** Buscar una materia **/
	public static Materia buscarMateria(int codigo){
		Predicate<Materia> filterCodigo = c -> c.getCodigo() == codigo;
		Optional<Materia> materia = materias.stream().filter(filterCodigo).findFirst(); 
		if (materia.isPresent()) {
			return materia.get();
		}else {
			return null;
		}
	}
	
}
