package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Иванов Иван");
        student.setGroup("Физики!");
        student.setCreated(new Date());
        System.out.println(student.getFullName() + " зачислен в группу: " + student.getGroup()
                + System.lineSeparator() + "Дата зачисления: " + student.getCreated());
    }
}
