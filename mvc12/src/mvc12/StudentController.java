package mvc12;

       public class  StudentController {
	   
       private Student model;
	   private StudentView view;

	   public  StudentController(Student model, StudentView view) {
	      this.model = model;
	      this.view = view;
	   }

	   public void setStudentName(String name) {
	      model.setName(name);		
	   }

	   public String getStudentName(){
	      return model.getName();		
	   }

	   public void setAge(int age){
	      model.setAge(age);		
	   }

	   public int getAge(){
	      return model.getAge();		
	   }

	   public void updateView(){				
	      view.printStudentDetails(model.getName(), model.getAge());
	   }	
	}