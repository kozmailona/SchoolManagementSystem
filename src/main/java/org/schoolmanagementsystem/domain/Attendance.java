package org.schoolmanagementsystem.domain;

import java.time.LocalDate;

public class Attendance {

    private boolean isPresent;
    private LocalDate date;

    public Attendance(boolean isPresent, LocalDate date) {
        this.isPresent = isPresent;
        this.date = date;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
