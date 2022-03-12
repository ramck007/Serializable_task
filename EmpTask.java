import java.util.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class EmpTask {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		employee e[]=new employee[2];
		System.out.println("Enter the Employee details");
		Scanner sc= new Scanner(System.in);
		int id; String name,location; long number;
		
		ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("empfile"));

		for(int i=0;i<e.length;i++) {
			System.out.println("Enter the Employee ID");
			id = sc.nextInt();
			System.out.println("Enter the Employee Name");
			name= sc.next();
			System.out.println("Enter the Employee Number");
			number = sc.nextLong();
			System.out.println("Enter the Employee Location");
			location= sc.next();
			System.out.println("");
			
			e[i]=new employee(id,name,number,location);
			outputStream.writeObject(e[i]);
		}
		
		outputStream.writeObject(new endoffile());
		outputStream.close();
		
		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("empfile"));
		Object obj=null;
		
		while((obj=inputStream.readObject()) instanceof endoffile==false ) {
			System.out.println("Employee id       : "+((employee)obj).id);
			System.out.println("Employee Name     : "+((employee)obj).name);
			System.out.println("Employee Number   : "+((employee)obj).number);
			System.out.println("Employee Location : "+((employee)obj).location);
			System.out.println("");
		}
	}
}

class employee implements Serializable{
	int id;
	String name,location;
	long number;
	public employee (int id,String name ,long number,String location) {
		this.id=id;
		this.name=name;
		this.number=number;
		this.location=location;		
	}	
}

class endoffile implements Serializable{
	
}