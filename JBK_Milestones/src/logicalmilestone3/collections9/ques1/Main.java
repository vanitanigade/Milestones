package logicalmilestone3.collections9.ques1;
//Write a java program to read n Students names from user, store them into the ArrayList collection. Display the names in Ascending order.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of students");
		int n = sc.nextInt();
		
		Student s[] = new Student[n];
		for(int i=0; i<s.length; i++) {
			System.out.println("enter name: ");
			String name = sc.next();
			s[i] = new Student(name);
		}
		sc.close();
		ArrayList<Student> al = new ArrayList<>();
		for(Student student:s) {
			al.add(student);
		}
		Collections.sort(al);
		al.forEach(s1 -> System.out.println(s1));
	}

}
