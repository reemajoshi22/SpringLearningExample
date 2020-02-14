package xmlBased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

    int emp_id;
    String emp_name;
    String employee_dept;
    Float employee_salary;

    @Qualifier("details2")
    @Autowired
    EmployeeDetails details;

    public EmployeeDetails getDetails() {
        return details;
    }

   /* public Employee(EmployeeDetails details) {

        this.details = details;
    }*/

    public void setDetails(EmployeeDetails details) {
        this.details = details;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmployee_dept() {
        return employee_dept;
    }

    public void setEmployee_dept(String employee_dept) {
        this.employee_dept = employee_dept;
    }

    public Float getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_salary(Float employee_salary) {
        this.employee_salary = employee_salary;
    }

    // method to print employee details
    public void print() {
        System.out.println("employee id is " + emp_id + "\n employee name is"
                + emp_name + "\n employee department is" + employee_dept
                + "\n employee salary is" + employee_salary
                + "employee age is " + details.age + "\n employee sex is"
                + details.sex);

    }


}
