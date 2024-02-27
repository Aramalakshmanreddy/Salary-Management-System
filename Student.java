package Money_Management_System_School;

/**
 * This clkass is reponsible for keep the 
 * track of students fees , name , grade and fees paid
 * @author ramal
 *
 */

public class Student {

   private	int studentId;  //why private , yes we should protect somebody to accessing the student id outside the student class
   private String name;
   private int grade;
   private int feesPaid;
   private int feesTotal;  //fees for every student is 300000 
   
   // whenever new student is enrolled , then fee paid intially is 0.
   
   
   //Constructor is going to create a new object / as soon as we call the new keyword or compiler encounters the new keyword , t
   //the constructor is invoked
   //Role of constructor is to create a new student object by intialising the values
   //when we create a student obkect what should we require (all need to mention in constrcutor method parameters)
   public Student( int studentId , String name , int grade ) {
	   this.feesPaid = 0;                // whenever new student is enrolled , then fee paid intially is 0.
	   this.feesTotal = 30000;
	   this.studentId = studentId;
	   this.name= name;
	   this.grade= grade;
   }
   
   //we are not going to alter the students name,id. so we dont need set method.
   /**
    * setgrade isnused to update the students grade.
    * parameter grade is the new grade of the student.
    * @param grade
    */
   public void setGrade(int grade) {
	   this.grade = grade;        //when we dng setGrade , basically we are updating the grade for particular student to grade that is coming from the argument
	  
   }
   
   /**
    * intially feesPaid is 0 , if feesPaid is 10000 then feesPaid should be 10000
    * keep adding the fees to feesPaid field.
    * Add the fees to feesPaid.
    * The school is going to recieve the funds.
    * 
    * @param feespaid
    */
   
   public void updateFeesPaid(int fees) {
	   feesPaid=feesPaid +fees; //payfees
	
	  
	  //School school = new School();
	School.updateTotalMoneyEarned(feesPaid);  // if i want use method like this , then we should declare the method as static
   }

   
   
public int getStudentId() {
	return studentId;
}

public void setStudentId(int studentId) {
	this.studentId = studentId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getFeesPaid() {
	return feesPaid;
}

public void setFeesPaid(int feesPaid) {
	this.feesPaid = feesPaid;
}

public int getFeesTotal() {
	return feesTotal;
}

public void setFeesTotal(int feesTotal) {
	this.feesTotal = feesTotal;
}

public int getGrade() {
	return grade;
}
   
public int getReaminingFees() {
	return feesTotal-feesPaid;
}
   
   
   
   
   
   
   
   
   
   
   
   
   //How should student object looks like 
}
