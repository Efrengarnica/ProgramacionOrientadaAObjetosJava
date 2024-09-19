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
		   
		   
		   
	   public void printRanking() {
		   
		   for (int i = 1; i < estudiantes.size(); i++) {
			    Student current = estudiantes.get(i);
			    int j = i - 1;
			    while (j >= 0 && estudiantes.get(j).grade< current.grade) {
			    	estudiantes.set(j + 1, estudiantes.get(j));
			        j--;
			    }
			    estudiantes.set(j + 1, current);
			}
		   
		   for(Student s: estudiantes) {
			   System.out.println(s);
		   }

		   
	   }
			
			   
		   
 public int bestGrade(ArrayList<Student> stu){
			   
			   int maximo = stu.get(0).grade;
			   for(Student s: stu) {
				   if(s.grade>maximo) {
					   maximo=s.grade;
				   }
			   } 
		       return maximo;
		       
		   }
			   
			   
			   
			   
		   
		   
		   
		   public void arribaPromedio(Student student) {
			   
			   if(student.grade>promedio()) {
				   System.out.println("Su grade: "+ student.grade + " es arriba del promedio " + promedio());
			   }else {
				   System.out.println("Su grade: "+ student.grade + " esta debajo del promedio " + promedio());
			   }
			   
//			   for(Student s: estudiantes ) {
//				   if(s.grade>promedio()) {
//				   System.out.println(s);
//				   System.out.println("Arriba del promedio");
//				   }else {
//					   System.out.println(s);
//					   System.out.println("Debajo del promedio");
//				   }		
//				   }
		   }
		   
		   
		   
		   
		   
		   
		   
}	   
		   
		   
		   
		   
		   
		   
		   
		
