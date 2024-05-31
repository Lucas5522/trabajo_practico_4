package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import ar.edu.unju.fi.model.Alumno;


public class CollectionAlumno {

private static List <Alumno> alumnos = new ArrayList<Alumno>();
	
	/**Creacion del array list Dcoentes**/
	public static List<Alumno> getDocente(){
		if(alumnos.isEmpty()) {
			alumnos.add(new Alumno(38909909, "Mondogo", "Papa", "mondongo@gmail.com", 388222222,  "2007-12-24", "Los Perales", 0001));
			alumnos.add(new Alumno(38909909, "Ector", "Decimo Meridio", "mondongo@gmail.com", 388928372,  "2000-08-12", "Grecia", 0002));
			alumnos.add(new Alumno(38111111, "Esposo ", "De una esposa", "mondongo@gmail.com", 388126576,  "2007-03-21", "Olimpo", 0003));
		}
		return alumnos;
	}
	
	/** Agregar una alumno **/
	public static void agregarDocente(Alumno alumno) {
		alumnos.add(alumno);
	}
	
	/** Eliminar una alumno **/
	public static void eliminarDocente(int libretaUniversitariaAlumno) {
		Iterator<Alumno> iterator = alumnos.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getLibretaUniversitaria() == libretaUniversitariaAlumno) {
				iterator.remove();
			}	
		}	
	}
	
	/** modificar una alumno **/
	public static void modificarAlumno(Alumno alumno) {
		for(Alumno alumn : alumnos) {
			if (alumn.getLibretaUniversitaria() == alumno.getLibretaUniversitaria()) {
				
			}else {
				System.out.println("No se encontro el legajo del docente");
			}
		}
	}
	
	
	/** Buscar una alumno **/
	public static Alumno buscarAlumno(int libretaUniversitaria){
		Predicate<Alumno> filterCodigo = c -> c.getLibretaUniversitaria() == libretaUniversitaria;
		Optional<Alumno> alumno = alumnos.stream().filter(filterCodigo).findFirst(); 
		if (alumno.isPresent()) {
			return alumno.get();
		}else {
			return null;
		}
	}
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
