package tarea.Poo;

public class Student {
	
	       String firstName;
	       String lastName;
	       public int registration;
	       public int grade;
	       int year;
	    
	       
	       
	   public Student(String firstName,String lastName,int registration, int grade, int year  ) {
		   this.firstName=firstName;
		   this.lastName=lastName;
		   this.registration=registration;
		   this.grade=grade;
		   this.year=year;
	   }
	   
	   public Student(String firstName,String lastName,int registration) {
		   this(firstName,lastName,registration, 0, 0);
	   }
	   
	   public Student(String firstName,String lastName) {
		  this(firstName,lastName, 00000);
	   }
	   
	      
	       
	    public void printFullName(){
	    	      System.out.println(firstName + " " + lastName);
	    	   }

	    public boolean isApproved(){
	    	       //TODO implement: should return true if grade >= 60
	    	if(grade >=60) {
	    	return true;
	    	} else {
	    		return false;
	    	}
	     }

	    public int changeYearIfApproved(){
	    	       //TODO implement: the student should advance to the next year if he/she grade is >= 60
	    	       // Make year = year + 1, and print "Congragulations" if the student has been approved
	    	if(isApproved()){
	    		year+=1;
	    		System.out.println("Congratulations");
	    		return year;
	    	}else {
	    		System.out.println("Sorry");
	    		return year;
	    	}
	    	
	     }
	    
	    public String toString() {
	    	return "Nombre Completo: "+ firstName+" "+ lastName+
	    			" Registration: " + registration +
	    			" Calificación: " + grade +
	    			" Año: " + year;
	    }
	       

}

