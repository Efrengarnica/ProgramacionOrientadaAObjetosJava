package tarea.Poo.Otro;
import java.util.ArrayList;

import tarea.Poo.Courses;
import tarea.Poo.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student efren= new Student("Efren","Garnica",315,6,1);
		Student fer= new Student("Fer","Garnica1",311,3,1);
		Student paco= new Student("Paco","Garnica2",312,8,1);
		Student marcos= new Student("Marcos","Garnica3",313,7,1);
		
		
		//////Segundo Arreglo de Estudiantes 
		ArrayList<Student> segundoColeccion= new ArrayList<Student>();
		Student efrenN= new Student("EfrenN","GarnicaG",335,9,1);
		Student ferR= new Student("FerR","Garnica1G",31133,1,1);
		Student pacoO= new Student("PacoO","Garnica2G",31332,0,1);
		Student marcosS= new Student("MarcosS","Garnica3G",32213,3,1);
		
		segundoColeccion.add(efrenN);
		segundoColeccion.add(ferR);
		segundoColeccion.add(pacoO);
		segundoColeccion.add(marcosS);
		
		Courses mate = new Courses();
		
		mate.courseName="Matematicas";
		mate.professorName="JC";
		mate.year=1;
		
		mate.estudiantes.add(efren);
		mate.estudiantes.add(fer);
		mate.estudiantes.add(paco);
		mate.estudiantes.add(marcos);
		
		mate.imprimirTodosEstudiantes();
		
		
		System.out.println("==========================");
		
		mate.enroll(segundoColeccion);
		mate.imprimirTodosEstudiantes();
		
		System.out.println("==========================");
		System.out.println(mate.countStudents());
		
		System.out.println(mate.bestGrade());
		System.out.println(mate.promedio());
		
		
		
		
		
		
		
		

	}

}
