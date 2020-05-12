package org.schoolmanagementsystem.domain;

import java.time.LocalDate;

public class Attendance {

    //vagy intben cimkezni?

    private boolean present = true;
    private boolean absent = false;
    private LocalDate date;

    public Attendance(boolean present, boolean absent, LocalDate date) {
        this.present = present;
        this.absent = absent;
        this.date = date;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    public boolean isAbsent() {
        return absent;
    }

    public void setAbsent(boolean absent) {
        this.absent = absent;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
