package org.schoolmanagementsystem.domain;

import java.time.LocalDate;

public class Teacher extends UserDetails {

    private int numberOfClasses;
    private boolean formMaster;

    public Teacher(int id, String name, String gender, String phoneNumber, String emailAddress,
                   long registrationNumber, LocalDate birthday, int age, int numberOfClasses, boolean formMaster) {
        super(id, name, gender, phoneNumber, emailAddress, registrationNumber, birthday, age);
        this.numberOfClasses = numberOfClasses;
        this.formMaster = formMaster;
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }

    public boolean isFormMaster() {
        return formMaster;
    }

    public void setFormMaster(boolean formMaster) {
        this.formMaster = formMaster;
    }
}