package org.schoolmanagementsystem.domain;

import java.time.LocalDate;

public class Student extends UserDetails {

   private int classes;

    public Student(int id, String name, String gender, String phoneNumber, String emailAddress,
                   long registrationNumber, LocalDate birthday, int age, int classes) {
        super(id, name, gender, phoneNumber, emailAddress, registrationNumber, birthday, age);
        this.classes = classes;
    }

    public int getClasses() {
        return classes;
    }

    public void setClasses(int classes) {
        this.classes = classes;
    }
}
