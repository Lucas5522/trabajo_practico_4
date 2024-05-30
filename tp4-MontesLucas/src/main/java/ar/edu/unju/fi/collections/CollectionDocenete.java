package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import ar.edu.unju.fi.model.Docente;


public class CollectionDocenete {

private static List <Docente> docentes = new ArrayList<Docente>();
	
	/**Creacion del array lsit Dcoentes**/
	public static List<Docente> getDocente(){
		if(docentes.isEmpty()) {
			docentes.add(new Docente(1, "Pepe", "Pepe", "pepe@gmail.com", 388999999));
			docentes.add(new Docente(2, "Meme", "Meme", "Meme@gmail.com", 388777777));
			docentes.add(new Docente(3, "Lala", "land", "lalaland@gmail.com", 388555555));
		}
		return docentes;
	}
	
	/** Agregar una docente **/
	public static void agregarDocente(Docente docente) {
		docentes.add(docente);
	}
	
	/** Eliminar una docente **/
	public static void eliminarDocente(int legajoDocente) {
		Iterator<Docente> iterator = docentes.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getLegajo() == legajoDocente) {
				iterator.remove();
			}	
		}	
	}
	
	/** modificar una docente **/
	public static void modificarDocente(Docente docente) {
		for(Docente docen : docentes) {
			if (docen.getLegajo() == docente.getLegajo()) {
				docen.setNombre(docente.getNombre());
				docen.setApellido(docente.getApellido());
				docen.setEmail(docente.getEmail());
				docen.setTelefono(docente.getTelefono());
			}else {
				System.out.println("No se encontro el legajo del docente");
			}
		}
	}
	
	
	/** Buscar una docente **/
	public static Docente buscarDocente(int legajo){
		Predicate<Docente> filterCodigo = c -> c.getLegajo() == legajo;
		Optional<Docente> docente = docentes.stream().filter(filterCodigo).findFirst(); 
		if (docente.isPresent()) {
			return docente.get();
		}else {
			return null;
		}
	}
	
	
}
