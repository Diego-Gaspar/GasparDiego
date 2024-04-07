package ar.edu.unju.fi.model;

public class RegistroNota {
	private String codigo;
	private Alumno alumno;
	private Materia materia;
	private Float notalFinal;
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	public RegistroNota(String codigo, Alumno alumno, Materia materia, Float notalFinal) {
		this.codigo = codigo;
		this.alumno = alumno;
		this.materia = materia;
		this.notalFinal = notalFinal;
	}
	
	


	@Override
	public String toString() {
		return "Registro de Nota - codigo=" + codigo + "- alumno=" + alumno + "- materia=" + materia + "- notalFinal="
				+ notalFinal + "]";
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public Alumno getAlumno() {
		return alumno;
	}


	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}


	public Materia getMateria() {
		return materia;
	}


	public void setMateria(Materia materia) {
		this.materia = materia;
	}


	public Float getNotalFinal() {
		return notalFinal;
	}


	public void setNotalFinal(Float notalFinal) {
		this.notalFinal = notalFinal;
	}

	
	
}
