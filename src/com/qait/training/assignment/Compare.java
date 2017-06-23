package com.qait.training.assignment;

import java.util.Comparator;

import com.qait.training.assignment.Student;

/**
 * get sort elements using Compare method of Comparator interface
 * 
 *
 */

public class Compare implements Comparator<Student> {
	/**
	 * get sorted values of ID,Name and CGPA
	 * 
	 * @return ID,Name,CGPA
	 */

	public int compare(Student s1, Student s2) {

		if (s1.getCGPA() == s2.getCGPA()) {
			if (s1.getName() == s2.getName()) {
				if (s1.getID() < s2.getID())
					return 1;
				else
					return -1;

			} else {
				return s1.getName().compareTo(s2.getName());
			}
		} else if (s1.getCGPA() < s2.getCGPA())
			return 1;

		else
			return -1;

	}
}
