package mytopic.collections;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeMain
{
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat spm = new SimpleDateFormat("dd/MM/yyyy");
        Employee emp = new Employee();
        emp.setEid(1);
        emp.setEname("satya");
        emp.setDepartment("development");
        emp.setDesignation("associate");
        emp.setDob(spm.parse("31/05/2022"));
        emp.setSalary(300000.00);
        try{
            FileOutputStream fileOutputStream =  new FileOutputStream("D://serializablefiles//hai.txt");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(emp);
            outputStream.close();
            fileOutputStream.close();
            System.out.println("successfully serializable ");
            System.out.println("process to deserializable");


            FileInputStream fin = new FileInputStream("D://serializablefiles//hai.txt");
            ObjectInputStream in = new ObjectInputStream(fin);
           Employee emp2 = (Employee) in.readObject();
            System.out.println("empid "+emp2.getEid());
            System.out.println("employee name : "+emp2.getEname());
            System.out.println("employee departmet "+emp2.getDepartment());
            System.out.println("employee designation "+emp2.getDesignation());
            System.out.println("employee dob : "+emp2.getDob());
            System.out.println("employee salary : "+emp2.getSalary());
            System.out.println("deserialization successfull.....");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
