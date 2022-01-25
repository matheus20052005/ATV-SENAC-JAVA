package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("How many employees will be registred? ");
		int num = input.nextInt();
		System.out.println();

		for (int i = 1; i <= num; i++) {
			System.out.println("Employoee #" + i + ": ");
			System.out.print("Id: ");
			int id = input.nextInt();
			while (hasId(list, id)) {
				System.out.println("Id already taken. try again: ");
				id = input.nextInt();
			}
			System.out.print("Name: ");
			input.nextLine();
			String name = input.nextLine();
			System.out.print("Salary: ");
			double salary = input.nextDouble();
			System.out.println();

			
			list.add(new Employee(id, name, salary));

		}

		System.out.print("Enter the employee id that will have salary increase: ");
		int id = input.nextInt();
		
		
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");

		} else {
			
			System.out.print("Enter the Porcentage ");
			double percentage = input.nextDouble();
			emp.increaseSalary(percentage);

		}

		System.out.println();
		System.out.println("List of employess: ");
		for (Employee employee : list) {
			System.out.println(employee);

			input.close();
		}
	}

	private static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
