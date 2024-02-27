package Money_Management_System_School;

/**
 * this class is responsible for keeping the track of 
 * teachers name ,id and salalry.
 * @author ramal
 *
 */
public class Teacher {
   private int teacherId;
   private String name;
   private int salary;
   private int salaryEarned;
   
   /**
    * creates a new teacher object.
    * 
    */
   public Teacher(int teacherId , String name , int salary ) {
	   this.teacherId = teacherId;
	   this.name=name;
	   this.salary=salary;
	   this.salaryEarned=0;
   }
   
   /**
    * it returns the id , name salary of the teachers ( sends out the values )
    * @return
    */
   public int getTeacherId() {
	   return teacherId;
   }
   public String getName() {
	   return name;
   }
   public int getSalary() {
	   return salary;
   }
   
   /**
    * Set the salary
    * @param salary
    */
   public void setSalary(int salary) {
	   this.salary=salary;
   }
   
   /**
    * adds to salaryEarned 
    * remove from the total money Spent
    * @param salary
    */
   
   public void receiveSalary(int salary) {
	   salaryEarned += salary;
	   
	   School.updateTotalMoneySpent(salaryEarned);
   }
   
   
   
   
   
   
   
}
