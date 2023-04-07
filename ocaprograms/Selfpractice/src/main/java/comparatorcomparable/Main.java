package comparatorcomparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args) {
//        Employee[] empArr = new Employee[4];
//        empArr[0] = new Employee(10, "Mikey", 25, 10000);
//        empArr[1] = new Employee(20, "Arun", 29, 20000);
//        empArr[2] = new Employee(5, "Lisa", 35, 5000);
//        empArr[3] = new Employee(1, "Pankaj", 32, 50000);
//        Arrays.sort(empArr);
//        System.out.println("Default Sorting of Employees list:\n"+ Arrays.toString(empArr));
//        List<Employee> employeeList = new ArrayList<>();
//        employeeList.add(new Employee(12,"satya",23,34500));
//        employeeList.add(new Employee(13,"raghav",32,45000));
//        employeeList.add(new Employee(11,"ram",22,50000));

        String s = " satya is a good person sandep";

        String[] a = s.trim().split(" ",5);
        Arrays.stream(a).forEach(System.out::println);
        //Arrays.stream(a).forEach(k -> Arrays.stream(k.split("")).forEach(System.out::println));



    }

}
