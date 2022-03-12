import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;
class empdet implements Serializable{
	ArrayList em1 = new ArrayList();
}
public class EmpDetails {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Scanner sc=new Scanner(System.in);
		EmpValues emp= new EmpValues();
		ArrayList em = new ArrayList();
		int n=2;
		for(int i=0;i<n;i++) {
			em.add(emp.fetchDetails());
		}
		//em=emp.fetchDetails();
		System.out.println("Enter the which employee to be shown 0 or 1");
		int k=sc.nextInt();
		System.out.print(em.indexOf(k));
		//em.indexOf(k).forEach(System.out::println);
		//System.out.println(em);
		
	/*	ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("empfile"));
		outputStream.writeObject(em);

		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("empfile"));
		empdet retrievedUser = (empdet) inputStream.readObject();
		
		try {
			System.out.println(retrivedUser.em1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

}
