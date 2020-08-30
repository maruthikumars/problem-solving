package com.maruthi.dell;

import java.util.Scanner;

class DataBaseCleanUp {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// accepting number of employess
		int numberOfEmployees = Integer.parseInt(s.nextLine());

		String[] employeeDetails = new String[numberOfEmployees];

		// accepting employee details, name and dep
		for (int i = 0; i < employeeDetails.length; i++) {

			employeeDetails[i] = s.nextLine();
		}

		for (String name : employeeDetails) {

			Department department = getReference(name);

			String employeeName = removeSpecialChar(name);

			department.setName(employeeName);
			department.display();
		}
	}

	public static Department getReference(String inputString) {

		String[] name = inputString.split(" ");

		if (name[0].equals("Developer")) {

			return new Developer();
		} else if (name[0].equals("Sales")) {

			return new Sales();
		} else if (name[0].equals("ProblemSetter")) {

			return new ProblemSetter();
		}

		return null;
	}

	public static String removeSpecialChar(String inputString) {

		String[] name = inputString.split(" ");

		String result = name[1].replaceAll("[^a-zA-Z0-9]", "");

		return result;
	}
}