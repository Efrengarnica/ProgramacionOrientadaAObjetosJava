package tarea.Poo;
import java.util.ArrayList;

public class Courses {
	public String courseName;
	public String professorName;
	public int year;
	public ArrayList <Student> estudiantes= new ArrayList<Student>();
	
	   public void enroll(Student student){
		      //TODO add the student to the collection
		  estudiantes.add(student);
		   
		   }

		   public void unEnroll(Student student){
		       //TODO remove this student from the collection
		       // Hint: check if that really is this student
			//boolean containStudent= estudiantes.contains(student);
			estudiantes.remove(student);
			
		   }

		   public int countStudents(){
		       int totalStudents=estudiantes.size();
		       return totalStudents;
		   }
		   
		   public int bestGrade(){
			   
			   int maximo = estudiantes.get(0).grade;
			   for(Student s: estudiantes) {
				   if(s.grade>maximo) {
					   maximo=s.grade;
				   }
			   } 
		       return maximo;
		       
		   }
		   
		   public void enroll(ArrayList<Student> students){
			      //TODO add all the students to the collection
			   estudiantes.addAll(students);
			   
			   }
		   
		   public void imprimirTodosEstudiantes() {
			   for(Student s: estudiantes ) {
				   System.out.println(s);			   }
		   }
		   
		   public double promedio() {
			   double suma=0;
			   double totalStudents=estudiantes.size();
			   
			   for(Student s: estudiantes ) {
				   suma+=s.grade;	
			   }
			   return suma/totalStudents;
		   }
		   
//		   public int alumnoTop() {
//			   
//		   }
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
}
