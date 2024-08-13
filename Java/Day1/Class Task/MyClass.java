import java.util.*;
public class MyClass{
public static void main(String[] args){
 int employeeId;
 String employeeName;
 float employeeSalary;
Scanner sc =new Scanner(System.in);

System.out.println("Enter employee id");
employeeId = sc.nextInt();
System.out.println("Enter employee Name");
employeeName = sc.next();
System.out.println("Enter employee Salary");
employeeSalary = sc.nextInt();

System.out.println("Employee id : "+ employeeId);
System.out.println("Employee Name : "+ employeeName);
System.out.println("Employee Salary : "+ employeeSalary);

}
}