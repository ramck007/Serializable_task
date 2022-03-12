import java.io.Serializable;
import java.util.*;

public class EmpValues implements Serializable{
	int id;
	String name,location;
	long number;
	/*
	 * public EmpValues{// (int id,String name ,long number,String location) {
	 * this.id=id; this.name=name; this.number=number; this.location=location; }
	 */
	
		
	ArrayList e = new ArrayList();
	public ArrayList fetchDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee ID");
		id = sc.nextInt();
		e.add("Employee id       : "+id);
		System.out.println("Enter the Employee Name");
		name= sc.next();
		e.add("Employee Name     : "+name);
		System.out.println("Enter the Employee Number");
		number = sc.nextLong();
		e.add("Employee Number   : "+number);
		System.out.println("Enter the Employee Location");
		location= sc.next();
		e.add("Employee Location : "+location);
		
		return e;
		//System.out.print(e);
	}
//	System.out.print(e);
	
}
