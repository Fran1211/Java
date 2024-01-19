
package hw_3;

/**
 *
 * @author Francisco Lovera
 */
public class Test_Patient 
{
 public static void main (String args[])
 {
   //Test Patient
   //Creates 1 instance of patients and defines all variables
     
  patients p = new patients("Steve", "Harper", "Riley", "128 NW 14th St", " Miami", "Florida", "33141", "7864689032", "Kelsey Riley", " 7862196701");
  
   //3 Procedures
   //Creates 3 instances of procedure
   
  Procedure procedure1 = new Procedure("Physical Exam", "03/11/2022", "Dr. Irvine", 250.00);
  Procedure procedure2 = new Procedure("X-Ray", "03/11/2022", "Dr. Jamison", 500.00);
  Procedure procedure3 = new Procedure("Blood test", "03/11/2022", "Dr. Smith ", 200.00);
  
  //Patient Information
  
  System.out.println("Patient name:" + "\t" + p.getfName() + "\t" + p.getmName() + "\t" + p.getlName() );
  System.out.println("Patient Address:" + p.getaddress() + "\t" + p.getcity() + "\t" + p.getstate());
  System.out.println("Patient Phone Number:" + p.getphone_number());
  System.out.println("Emergency Contact:" + p.geteName() + "\t" +  p.getePhone() + "\n");
  
  //Display all procedures information
  
  System.out.println("Procedure #1:");
  System.out.println("Procedure Name:" + procedure1.getprocedure_name() + "\tDate:" + procedure1.getprocedure_date() + "\tPractitioner:" + procedure1.getpractitioner() + "\tCharge:" + procedure1.getcharge() + "\n");
  System.out.println("Procedure #2:");
  System.out.println("Procedure Name:" + procedure2.getprocedure_name() + "\tDate:" + procedure2.getprocedure_date() + "\tPractitioner:" + procedure2.getpractitioner() + "\tCharge:" + procedure2.getcharge() + "\n");
  System.out.println("Procedure #3:");
  System.out.println("Procedure Name:" + procedure3.getprocedure_name() + "\tDate:" + procedure3.getprocedure_date() + "\tPractitioner:" + procedure3.getpractitioner() + "\tCharge:" + procedure3.getcharge() + "\n");
  
  //Calculate total charge of all procedures
  
  double gross_total = procedure1.getcharge() + procedure2.getcharge() + procedure3.getcharge();
  System.out.println("Total charge for all procedures:$" + gross_total);
  
  
 }


}


