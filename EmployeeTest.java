public class EmployeeTest {
public static void main(String[] args) {
// using the constructor with everything
Employee susan = new Employee(
"Susan Meyers",
47899,
"Accounting",
"Vice President"
);
// using the name and id constructor
Employee mark = new Employee("Mark Jones", 39119);
mark.setDepartment("IT");
mark.setPosition("Programmer");
// using the default constructor
Employee joy = new Employee();
joy.setName("Joy Rogers");
joy.setIdNumber(81774);
joy.setDepartment("Manufacturing");
joy.setPosition("Engineer");
System.out.println("Employee 1:");
susan.displayInfo();
System.out.println();
System.out.println("Employee 2:");
mark.displayInfo();
System.out.println();
System.out.println("Employee 3:");

joy.displayInfo();
// checking a few getters
System.out.println();
System.out.println("Retrieved employee name: " + susan.getName());
System.out.println("Retrieved employee ID: " + mark.getIdNumber());
System.out.println("Retrieved department: " + joy.getDepartment());
System.out.println("Retrieved position: " + joy.getPosition());
}
}