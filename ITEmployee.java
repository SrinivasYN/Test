package java8Practice;

import java.util.*;

import java.util.stream.Collectors;

public class ITEmployee {


    int id;

    String name;

    int age;

    String gender;

    String department;

    int yearOfJoining;

    double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public ITEmployee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Id : "+id
                +", Name : "+name
                +", age : "+age
                +", Gender : "+gender
                +", Department : "+department
                +", Year Of Joining : "+yearOfJoining
                +", Salary : "+salary;
    }

    public static void main(String args[]){

        List<ITEmployee> employeeList = new ArrayList<ITEmployee>();


        employeeList.add(new ITEmployee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new ITEmployee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new ITEmployee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new ITEmployee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new ITEmployee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new ITEmployee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new ITEmployee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new ITEmployee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new ITEmployee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new ITEmployee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new ITEmployee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new ITEmployee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new ITEmployee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new ITEmployee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new ITEmployee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new ITEmployee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new ITEmployee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));


        //System.out.println(employeeList);

        System.out.println("Query 3.1 : How many male and female employees are there in the organization?");


        Map<String,Long> noOfMaleAndFemaleEmployeesold =
                employeeList.stream().collect(Collectors.groupingBy(employee->employee.gender,Collectors.counting()));
        System.out.println(noOfMaleAndFemaleEmployeesold);

        Map<String, Long> noOfMaleAndFemaleEmployees=
                employeeList.stream().collect(Collectors.groupingBy(ITEmployee::getGender, Collectors.counting()));

        System.out.println(noOfMaleAndFemaleEmployees);

        System.out.println(" Query 3.2 : Print the name of all departments in the organization?");

        employeeList.stream().map(employee->employee.department).distinct().forEach(System.out::println);

        List departmentList = employeeList.stream().map(employee->employee.department).distinct().collect(Collectors.toList());
        System.out.println(departmentList);
        Set departmentSet = employeeList.stream().map(employee->employee.department).collect(Collectors.toSet());

        System.out.println(departmentSet);


        System.out.println(" Query 3.3 : What is the average age of male and female employees?");

        Map<String,Double> averageAge_OfMaleAndFemaleEmployees1 =
                employeeList.stream().collect(Collectors.groupingBy(employee->employee.gender,Collectors.averagingInt(employee->employee.age)));

        System.out.println(averageAge_OfMaleAndFemaleEmployees1);

        Map<String,Double> averageAge_OfMaleAndFemaleEmployees2 =
                employeeList.stream().collect(Collectors.groupingBy(ITEmployee::getGender,Collectors.averagingInt(ITEmployee::getAge)));

        System.out.println(averageAge_OfMaleAndFemaleEmployees2);


        System.out.println(" Query 3.4 : Get the details of highest paid employee in the organization?");

        Optional<ITEmployee> highestPaidEmployeeWrapper =
                employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(employee->employee.salary)));

        Optional<ITEmployee> highestPaidEmployeeWrapper2 =
                employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(ITEmployee::getSalary)));

        ITEmployee highestPaidEmployee = highestPaidEmployeeWrapper2.get();


        System.out.println("Details Of Highest Paid Employee : ");

        System.out.println("==================================");

        System.out.println("ID : "+highestPaidEmployee.getId());

        System.out.println("Name : "+highestPaidEmployee.getName());

        System.out.println("Age : "+highestPaidEmployee.getAge());

        System.out.println("Gender : "+highestPaidEmployee.getGender());

        System.out.println("Department : "+highestPaidEmployee.getDepartment());

        System.out.println("Year Of Joining : "+highestPaidEmployee.getYearOfJoining());

        System.out.println("Salary : "+highestPaidEmployee.getSalary());


        System.out.println(" Query 3.5 : Get the names of all employees who have joined after 2015?");

    List<String>  empName =   employeeList.stream().filter(employee->employee.yearOfJoining >2015).map(employee->employee.name).collect(Collectors.toList());

        System.out.println(empName);

        List<String>  empName2 = employeeList.stream().filter(employee->employee.yearOfJoining >2015).map(ITEmployee::getName).collect(Collectors.toList());
                System.out.println(empName2);

                employeeList.stream().filter(employee->employee.yearOfJoining >2015).map(employee->employee.name).forEach(System.out::println);

        System.out.println(" Query 3.6 : Count the number of employees in each department?");

        Map<String,Long> noOfEmpInDept=
        employeeList.stream().collect(Collectors.groupingBy(emp-> emp.department,Collectors.counting()));
        System.out.println(noOfEmpInDept);

        Map<String,Long> employeeCountByDepartment =
                employeeList.stream().collect(Collectors.groupingBy(ITEmployee::getDepartment, Collectors.counting()));

        System.out.println(employeeCountByDepartment);
        Set<Map.Entry<String, Long>> entrySet = employeeCountByDepartment.entrySet();

        for (Map.Entry<String, Long> entry : entrySet)
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }


        System.out.println(" ****** Query 3.7 : What is the average salary of each department? ******");


        Map<String,Double> deptAvgSal =
                 employeeList.stream().collect(Collectors.groupingBy(emp->emp.department,Collectors.averagingDouble(emp->emp.salary)));

        System.out.println(deptAvgSal);

        Map<String, Double> avgSalaryOfDepartments=
                employeeList.stream().collect(Collectors.groupingBy(ITEmployee::getDepartment, Collectors.averagingDouble(ITEmployee::getSalary)));

        Set<Map.Entry<String, Double>> entrySet1 = avgSalaryOfDepartments.entrySet();

        for (Map.Entry<String, Double> entry : entrySet1)
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

//       /* Map<String,Double> deptMAXSal =
//                employeeList.stream().collect(Collectors.groupingBy(emp->emp.department,Collectors.maxBy(Comparator.comparingDouble(emp->emp.salary)));
//
//        System.out.println(deptMAXSal);
//*/


        System.out.println(" ****** Query 3.8 : Get the details of youngest male employee in the product development department?");

       Optional<ITEmployee> youngestMaleEmployeeInProductDevelopmentWrapper1=
        employeeList.stream().filter(emp -> emp.gender == "Male" && emp.department == "Product Development").min(Comparator.comparingInt(ITEmployee::getAge));

        System.out.println("youngestMaleEmployeeInProductDevelopmentWrapper1 ----"+ youngestMaleEmployeeInProductDevelopmentWrapper1);



        Optional<ITEmployee> youngestMaleEmployeeInProductDevelopmentWrapper=
                employeeList.stream()
                        .filter(e -> e.getGender()=="Male" && e.getDepartment()=="Product Development")
                        .min(Comparator.comparingInt(ITEmployee::getAge));

        Optional<ITEmployee> youngestMaleEmployeeInProductDevelopmentWrapper2=
                employeeList.stream()
                        .filter(e -> e.getGender()=="Male" && e.getDepartment()=="Product Development")
                        .min(Comparator.comparingInt(e->e.age));

        ITEmployee youngestMaleEmployeeInProductDevelopment = youngestMaleEmployeeInProductDevelopmentWrapper.get();

        System.out.println("Details Of Youngest Male Employee In Product Development");

        System.out.println("----------------------------------------------");

        System.out.println("ID : "+youngestMaleEmployeeInProductDevelopment.getId());

        System.out.println("Name : "+youngestMaleEmployeeInProductDevelopment.getName());

        System.out.println("Age : "+youngestMaleEmployeeInProductDevelopment.getAge());

        System.out.println("Year Of Joinging : "+youngestMaleEmployeeInProductDevelopment.getYearOfJoining());

        System.out.println("Salary : "+youngestMaleEmployeeInProductDevelopment.getSalary());


        System.out.println(" ****** Query 3.9 : Who has the most working experience in the organization?");


        Optional<ITEmployee> seniorMostEmployeeWrapper=
                employeeList.stream().sorted(Comparator.comparingInt(ITEmployee::getYearOfJoining)).findFirst();

        ITEmployee seniorMostEmployee = seniorMostEmployeeWrapper.get();

        System.out.println("Senior Most Employee Details :");

        System.out.println("----------------------------");

        System.out.println("ID : "+seniorMostEmployee.getId());

        System.out.println("Name : "+seniorMostEmployee.getName());

        System.out.println("Age : "+seniorMostEmployee.getAge());

        System.out.println("Gender : "+seniorMostEmployee.getGender());

        System.out.println("Age : "+seniorMostEmployee.getDepartment());

        System.out.println("Year Of Joinging : "+seniorMostEmployee.getYearOfJoining());

        System.out.println("Salary : "+seniorMostEmployee.getSalary());



        System.out.println(" ****** Query 3.10 : How many male and female employees are there in the sales and marketing team?");

        Map<String,Long>  countMaleFemaleEmployeesInSalesMarketing=
                employeeList.stream().filter(e->e.department== "Sales And Marketing").collect(Collectors.groupingBy(e->e.gender,Collectors.counting()));
        System.out.println(countMaleFemaleEmployeesInSalesMarketing);

        Map<String,Long>  countMaleFemaleEmployeesInSalesMarketing1=
                employeeList.stream().filter(e->e.department== "Sales And Marketing").collect(Collectors.groupingBy(ITEmployee::getGender,Collectors.counting()));
        System.out.println(countMaleFemaleEmployeesInSalesMarketing1);


        System.out.println(" ****** Query 3.11 : What is the average salary of male and female employees?");

        Map<String,Double>  avgSalaryOfMaleAndFemaleEmployees1=
                employeeList.stream().collect(Collectors.groupingBy(e->e.gender,Collectors.averagingDouble(e-> e.salary)));

        System.out.println(avgSalaryOfMaleAndFemaleEmployees1);

        Map<String, Double> avgSalaryOfMaleAndFemaleEmployees=
                employeeList.stream().collect(Collectors.groupingBy(ITEmployee::getGender, Collectors.averagingDouble(ITEmployee::getSalary)));

        System.out.println(avgSalaryOfMaleAndFemaleEmployees);

        System.out.println(" ****** Query 3.12 : List down the names of all employees in each department?");

        List<String> names = employeeList.stream().map(e->e.name).collect(Collectors.toList());//.collect(Collectors.groupingBy(e->e.department))

        System.out.println(names);



        Map<String, List<ITEmployee>> employeeListByDepartment=
                employeeList.stream().collect(Collectors.groupingBy(ITEmployee::getDepartment));

        Set<Map.Entry<String, List<ITEmployee>>> entrySet2 = employeeListByDepartment.entrySet();

        for (Map.Entry<String, List<ITEmployee>> entry : entrySet2)
        {
            System.out.println("--------------------------------------");

            System.out.println("Employees In "+entry.getKey() + " : ");

            System.out.println("--------------------------------------");

            List<ITEmployee> list = entry.getValue();

            for (ITEmployee e : list)
            {
                System.out.println(e.getName());
            }
        }


        System.out.println(" ****** Query 3.13 : What is the average salary and total salary of the whole organization?");


        DoubleSummaryStatistics employeeSalaryStatistics=
                employeeList.stream().collect(Collectors.summarizingDouble(ITEmployee::getSalary));

        System.out.println("Average Salary = "+employeeSalaryStatistics.getAverage());

        System.out.println("Total Salary = "+employeeSalaryStatistics.getSum());

        System.out.println(" Salary = "+employeeSalaryStatistics);


        employeeList.stream().map(e->e.salary).forEach(System.out::println);


        System.out.println("****** Query 3.14 : Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.");


                Map<Boolean, List<ITEmployee>> partitionEmployeesByAge=
                employeeList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25));

        Set<Map.Entry<Boolean, List<ITEmployee>>> entrySet3 = partitionEmployeesByAge.entrySet();

        for (Map.Entry<Boolean, List<ITEmployee>> entry : entrySet3)
        {
            System.out.println("----------------------------");

            if (entry.getKey())
            {
                System.out.println("Employees older than 25 years :");
            }
            else
            {
                System.out.println("Employees younger than or equal to 25 years :");
            }

            System.out.println("----------------------------");

            List<ITEmployee> list = entry.getValue();

            for (ITEmployee e : list)
            {
                System.out.println(e.getName());
            }

        }


        System.out.println("****** Query 3.15 : Who is the oldest employee in the organization? What is his age and which department he belongs to?");

        System.out.println(employeeList.stream().max(Comparator.comparing(e->e.age)));
        //------


        Optional<ITEmployee> oldestEmployeeWrapper = employeeList.stream().max(Comparator.comparingInt(ITEmployee::getAge));

        ITEmployee oldestEmployee = oldestEmployeeWrapper.get();

        System.out.println("Name : "+oldestEmployee.getName());

        System.out.println("Age : "+oldestEmployee.getAge());

        System.out.println("Department : "+oldestEmployee.getDepartment());

        System.out.println("****** Query 3.16 : i need to find 1st three employee details based on highest salary?");

         employeeList.stream().sorted(Comparator.comparingDouble(e->e.salary)).limit(3).forEach(System.out::println);


    }
}
