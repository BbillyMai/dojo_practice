package service;

import static org.junit.Assert.assertEquals;

import java.util.List;
import model.Employee;
import org.junit.Test;

public class EmployeeServiceTest {

  @Test
  public void should_return_older_than_18_employees_when_invoke_getAdultEmployee() {
    List<Employee> adultEmployees = getEmployeeService().getAdultEmployee();

    assertEquals(2, adultEmployees.size());
    assertEquals("Sepp", adultEmployees.get(0).getName());
    assertEquals(18, adultEmployees.get(0).getAge());
    assertEquals("Mike", adultEmployees.get(1).getName());
    assertEquals(51, adultEmployees.get(1).getAge());
  }

  @Test
  public void should_return_employees_sorted_by_name_when_invoke_getEmployeesSortedByName() {
    List<Employee> adultEmployees = getEmployeeService().getEmployeesSortedByName();

    assertEquals("Max", adultEmployees.get(0).getName());
    assertEquals("Mike", adultEmployees.get(1).getName());
    assertEquals("Nina", adultEmployees.get(2).getName());
    assertEquals("Sepp", adultEmployees.get(3).getName());
  }

  @Test
  public void should_return_employees_name_is_capitalized_when_invoke_getEmployeesUpperName() {
    List<Employee> adultEmployees = getEmployeeService().getEmployeesUpperName();

    assertEquals("MAX", adultEmployees.get(0).getName());
    assertEquals("SEPP", adultEmployees.get(1).getName());
    assertEquals("NINA", adultEmployees.get(2).getName());
    assertEquals("MIKE", adultEmployees.get(3).getName());
  }

  private EmployeeService getEmployeeService() {
    return new EmployeeService();
  }

}
