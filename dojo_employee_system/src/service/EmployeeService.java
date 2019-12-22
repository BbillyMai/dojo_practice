package service;

import dao.EmployeeDao;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import model.Employee;

public class EmployeeService {

  private EmployeeDao employeeDao = new EmployeeDao();

  public List<Employee> getAdultEmployee() {
    List<Employee> allEmployee = getAllEmployees();
    List<Employee> adultEmployee = allEmployee.stream()
        .filter(Employee::isAdult).collect(Collectors.toList());
    return adultEmployee;
  }

  public List<Employee> getEmployeesSortedByName() {
    List<Employee> allEmployee = getAllEmployees();
    List<Employee> employeesSortedByName = allEmployee.stream()
        .sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
    return employeesSortedByName;
  }

  private List<Employee> getAllEmployees() {
    return employeeDao.getAllEmployee();
  }
}
