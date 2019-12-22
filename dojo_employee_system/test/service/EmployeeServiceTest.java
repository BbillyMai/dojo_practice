package service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import model.Employee;
import org.junit.Test;

public class EmployeeServiceTest {

  @Test
  public void should_return_older_than_18_employees_invoke_getAdultEmployee() {
    EmployeeService employeeService = new EmployeeService();
    List<Employee> adultEmployees = employeeService.getAdultEmployee();

    assertEquals(2, adultEmployees.size());
    assertEquals("Sepp", adultEmployees.get(0).getName());
    assertEquals(18, adultEmployees.get(0).getAge());
    assertEquals("Mike", adultEmployees.get(1).getName());
    assertEquals(51, adultEmployees.get(1).getAge());
  }
}
