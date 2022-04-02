package test.Hospital;

import java.time.LocalDate;

public class Visit {
    private LocalDate dateOfVisit;
    private String rating;
    private Doctor doctor;
    private Patient patient;

    public LocalDate getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit(LocalDate dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Visit(LocalDate dateOfVisit, String rating, Doctor doctor, Patient patient) {
        this.dateOfVisit = dateOfVisit;
        this.rating = rating;
        this.doctor = doctor;
        this.patient = patient;
    }
}
