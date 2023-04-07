package org.student;

import dao.StudentDao;

import java.util.List;

public class StudentMain
{
    public static void main(String[] args)
    {
        StudentDao studentDao = new StudentDao();
        Stdent stdent = new Stdent(101,"satya",456);
        studentDao.saveStudent(stdent);

        List <Stdent> stu = studentDao.getStdents();
        stu.forEach(s -> System.out.println(s.getSname()));

    }
}
