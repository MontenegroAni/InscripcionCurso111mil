import java.util.ArrayList;
import java.util.List;

public class Colegio {
	private List<Curso> cursos;

	public Colegio(){
		this.cursos= new ArrayList<Curso>();
	}
	
	public int cantidadTotalAlumnosdeCursoDado(String nombreNuevoCurso){
		int cantidadTotalAlumnos=0;
		for(Curso c : cursos){
			if (c.getNombreCurso().equals(nombreNuevoCurso)){
				cantidadTotalAlumnos+= c.getInscripciones().size();
			}
		}
		return cantidadTotalAlumnos;
	}
	

	public int cantidadAlumnosAprobados (String nombreNuevoCurso){
		int cantidadAlumnosAprobados=0;
		for(Curso c : cursos){
			if(c.getNombreCurso().equals(nombreNuevoCurso)){
				Curso curso=c;
				for(Inscripcion i : c.getInscripciones()){
					if (i.getNota() >= c.getNotaAprobacion()){
						cantidadAlumnosAprobados++;
					}
				}
			}
		}
		return cantidadAlumnosAprobados;
	}	

}
