package level2;

import java.util.ArrayList;
import java.util.List;
//Hospital class
class Hospital {
    private List<Doctor> doctors;
    private List<Patient> patients;
// constructor
    public Hospital() {
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }
//method to add doctor
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public List<Patient> getPatients() {
        return patients;
    }
}
// class doctor
class Doctor {
    private String name;
    private List<Patient> patients;
//constructor
    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this); // Ensure bidirectional association
        }
    }

    public List<Patient> getPatients() {

        return patients;
    }

    public void consult(Patient patient) {
        if (patients.contains(patient)) {
            System.out.println("Doctor " + name + " is consulting Patient " + patient.getName());
        } else {
            System.out.println("Patient " + patient.getName() + " is not under Doctor " + name + "'s care.");
        }
    }
}
//Patient class
class Patient {
    private String name;
    private List<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }
//get method
    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
            doctor.addPatient(this); // Ensure bidirectional association
        }
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        Doctor doctor1 = new Doctor("Dr. John");
        Doctor doctor2 = new Doctor("Dr. Akshit");

        Patient patient1 = new Patient("nishu");
        Patient patient2 = new Patient("nisha");

        // Establish relationships
        doctor1.addPatient(patient1);
        doctor1.addPatient(patient2);

        doctor2.addPatient(patient2);

        // Add to hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Consultations
        doctor1.consult(patient1); // Expected: Doctor Dr. john is consulting Patient nishu
        doctor1.consult(patient2); // Expected: Doctor Dr. john is consulting Patient nisha
        doctor2.consult(patient1); // Expected: Patient nishu is not under Doctor Dr. Akshit's care.
        doctor2.consult(patient2); // Expected: Doctor Dr. Akshit is consulting Patient nisha
    }
}
