package org.example.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Find Employee salary > 40000 and then increase employee grade by 1
 * @author Nadee
 *
 */
public class EmployeeService {

	private static List<Employee> createEmployeeList() {
		return Arrays.asList(
				new Employee(1, "Nadee", 30000, 1), 
				new Employee(1, "Kamal", 40000, 2),
				new Employee(1, "Sundri", 50000, 3), 
				new Employee(1, "NadeeSh", 35000, 1),
				new Employee(1, "Arush", 50000, 3));
	}

	private void updateEmployeeGrade(List<Employee> list) {
		List<Employee> result = list.stream()
				.filter(employee -> (employee.getSalary() > 40000))
				.map(employee -> {
					employee.setGrade(employee.getGrade() + 1);
					return employee;
				})
				.collect(Collectors.toList());

		result.forEach(employee -> System.out.println("Name: " + employee.getName() + " Grade: " + employee.getGrade()));
	}

	private void updateGrade(List<Employee> list) {
		list.stream()
				.filter(employee -> (employee.getSalary() > 40000))
				.forEach(employee -> employee.setGrade(employee.getGrade() + 1));

		list.forEach(employee -> System.out.println("Name: " + employee.getName() + " Grade: " + employee.getGrade()));
	}

	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();

		employeeService.updateEmployeeGrade(createEmployeeList());

		System.out.print("\n");
		employeeService.updateGrade(createEmployeeList());
	}

}
