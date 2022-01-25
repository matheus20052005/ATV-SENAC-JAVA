package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		// A lista é uma interface e não pode ser instanciada.

		List<Employee> list = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int num = input.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.println("Employee # " + i + " data: ");
			System.out.print("OutsourcedEmployeed (y/n)? ");
			char key = input.next().charAt(0);
			System.out.print("Name: ");
			input.nextLine();
			String name = input.nextLine();
			System.out.print("Hours: ");
			int hours = input.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = input.nextDouble();

			if (key == 'y' || key == 'Y') {
				System.out.print("additional charge: ");
				double additionalCharge = input.nextDouble();
				list.add(new OutsourceEmployee(name, hours, valuePerHour, additionalCharge));
			} else {
				list.add(new Employee(name, hours, valuePerHour));

			}
		}

		System.out.println();
		System.out.println("PAYMENTS: ");

		for (Employee emp : list) {
			System.out.println(emp.getName() + " -  $ " + String.format("%.2f", emp.payment()));

		}

		input.close();
	}

}
