package com.qait.training.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Student {

	public int ID;
	private String Name;
	private double CGPA;

	public Student(int ID, String Name, double CGPA) {
		this.ID = ID;
		this.Name = Name;
		this.CGPA = CGPA;
	}

	/**
	 * 
	 * @return ID of student
	 */

	public int getID() {
		return ID;
	}

	/**
	 * 
	 * @return Name of student
	 */
	public String getName() {
		return Name;

	}

	/**
	 * 
	 * @return CGPA of student
	 */
	public double getCGPA() {
		return CGPA;

	}

	public String toString() {
		return " Name: " + this.Name;
	}

	public static void main(String args[]) {

		ArrayList<Student> al = new ArrayList<Student>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter number of students between 2 to 100");
		int n = sc.nextInt();
		if (n < 2 || n > 100)
			throw new IllegalArgumentException();
		System.out.println("enter id between 0-10000,name length between 5-30 and CGPA upto 4.00");
		for (int i = 0; i < n; i++) {

			int ID = sc.nextInt();
			String Name = sc.next();
			double CGPA = sc.nextDouble();
			if ((ID < 0 || ID > 10000) || (Name.length() < 5 || Name.length() > 30) || (CGPA < 0 || CGPA > 4.00))
				throw new IllegalArgumentException();

			al.add(new Student(ID, Name, CGPA));
		}

		Collections.sort(al, new Compare());
		for (Student e : al) {
			System.out.println(e);
		}
	}
}
