package com.example.clihis.Model;

public class Prescription {

    private String doctorName;
    private String prescription;
    private String diagnosis;
    private String date;
    private String patientId;

    public Prescription() {
    }

    public Prescription(String doctorName, String prescription, String diagnosis, String date, String patientId) {
        this.doctorName = doctorName;
        this.prescription = prescription;
        this.diagnosis = diagnosis;
        this.date = date;
        this.patientId = patientId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}
