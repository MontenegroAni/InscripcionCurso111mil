
public class Alumno {
	private String nombre;
	private String apellido;
	private int dni, edad;

	public Alumno(int dni, int edad, String nombre, String apellido){
		this.nombre= nombre;
		this.apellido= apellido;
		this.dni= dni;
		this.edad= edad;
	}

	public boolean equals(Alumno a){
		return true;
	}

}
