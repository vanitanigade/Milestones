package logicalmilestone3.collections9.ques2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of persons");
		int n = sc.nextInt();
		
		Person p[] = new Person[n];
		for(int i=0; i<p.length; i++) {
			System.out.println("enter name of persons");
			String name = sc.next();
			p[i] = new Person(name);
		}
		sc.close();
		ArrayList<Person> al = new ArrayList<>();
		for(Person person : p) {
			al.add(person);
		}
		
		Collections.sort(al);
		al.forEach(ps -> System.out.println(ps));
	}

}
