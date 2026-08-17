class EmployeeDetails
{
    int empId;
    String empName;
    double salary;

    void setDetails(int id, String name, double sal)
    {
        empId = id;
        empName = name;
           salary = sal;   
    }

    void display()
    {
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary : " + salary);
    }

    public static void main(String args[])
    {
        EmployeeDetails emp1 = new EmployeeDetails();
        EmployeeDetails emp2 = new EmployeeDetails();

        emp1.setDetails(01, "DinakarSS", 90000);
        emp2.setDetails(02, "Dinas", 50000);

        emp1.display();
        emp2.display();
    }
}