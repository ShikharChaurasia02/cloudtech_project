package tester;

import com.app.core.*;

import cust_excs.StudentHandlingException;
import utils.ValidationRules;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 3;
		Student[] s = new Student[10];
		s[0] = new Student("dac-001", "Shikhar", "shikhar@123", "85", "PGDAC");
		s[1] = new Student("dac-002", "Shekhar", "shekhar@123", "84", "PGDAC");
		s[2] = new Student("dac-003", "Pankaj", "pankaj@123", "83", "PGDAC");

		System.out.println(" Enter Student Details");

		String a, b, c, d, e;
		int n = 0;
		try (Scanner sc = new Scanner(System.in);) {
			
			System.out.println("Enter PRN : ");
			a = sc.next();
		
			System.out.println("Enter Name : ");
			b = sc.next();
			ValidationRules.validationname(b);
		

			System.out.println("Enter Email : ");
			c = sc.next();
			ValidationRules.validationemail(c);
			

			System.out.println("Enter Marks : ");
			d = sc.next();

			System.out.println("Enter Course : ");
			e = sc.next();
			ValidationRules.validationcourse(e);

			Student s1 = new Student(a, b, c, d, e);
			for (Student p : s) {
				if (p != null) {
					if (p.equals(s1)) {
						throw new StudentHandlingException("Duplicate PRN!!!");
					}

				}
			}
			s[counter++] = s1;
			
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		for(Student p :s)
		{
			if(p!=null)
			{
				System.out.println(p);
				
			}
			
		}

	}

}
