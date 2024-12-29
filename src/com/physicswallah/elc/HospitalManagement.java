package com.physicswallah.elc;

import com.physicswallah.blc.Appointment;
import com.physicswallah.blc.Doctor;
import com.physicswallah.blc.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class HospitalManagement {
    private static ArrayList<Patient> patients=new ArrayList<>();
    private static ArrayList<Doctor> doctors=new ArrayList<>();
    private static ArrayList<Appointment> appointments=new ArrayList<>();

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Hospital Management System");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Schedule Appointment");
            System.out.println("4. View Patients");
            System.out.println("5. View Doctors");
            System.out.println("6. View Appointments");
            System.out.println("0. Exit");
            System.out.println("Enter Your Choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addPatient(sc);
                    break;
                case 2:
                    addDoctor(sc);
                    break;
                case 3:
                    scheduleAppointment(sc);
                    break;
                case 4:
                    viewPatients();
                    break;
                case 5:
                    viewDoctors();
                    break;
                case 6:
                    viewAppointments();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");

            }
        } while (choice != 0);
    }
        private static void addPatient(Scanner sc){
            System.out.println("Enter Patient Name:");
            String name=sc.next();
            System.out.println("Enter Patient Age:");
            int age=sc.nextInt();
            System.out.println("Enter Patient Gender:");
            String gender =sc.next();
            Patient p1=new Patient(name,gender,age);
            patients.add(p1);
            System.out.println("Patient Added Successfully!");
        }
    private static void addDoctor(Scanner sc){
        System.out.println("Enter Doctor Name:");
        String name=sc.next();
        System.out.println("Enter Doctor speciality:");
        String speciality =sc.next();
        Doctor d1=new Doctor(name,speciality);
        doctors.add(d1);
        System.out.println("Doctor Added Successfully!");
    }
    private static void scheduleAppointment(Scanner sc){
        System.out.print("Enter Patient ID: ");
        int patientId = sc.nextInt();
        System.out.print("Enter Doctor ID: ");
        int doctorId = sc.nextInt();
        System.out.print("Enter Appointment Date (YYYY-MM-DD): ");
        String date = sc.next();

        Patient patient = findPatientById(patientId);
        Doctor doctor = findDoctorById(doctorId);

        if (patient != null && doctor != null) {
            Appointment appointment = new Appointment(patient, doctor, date);
            appointments.add(appointment);
            System.out.println("Appointment scheduled successfully!");
        } else {
            System.out.println("Invalid Patient ID or Doctor ID.");
        }

    }
    private static void viewPatients(){
        for(int i=0;i < patients.size();i++){
            System.out.println(patients.get(i));
        }
    }
    private static void viewDoctors(){
        for(int i=0;i < doctors.size();i++){
            System.out.println(doctors.get(i));
        }

    }
    private static void viewAppointments(){
        for(int i=0;i< appointments.size();i++){
            System.out.println(appointments.get(i));
        }

    }
    private static Patient findPatientById(int id) {
        for (Patient patient : patients) {
            if (patient.getId() == id) {
                return patient;
            }
        }
        return null;
    }

    private static Doctor findDoctorById(int id) {
        for (Doctor doctor : doctors) {
            if (doctor.getId() == id) {
                return doctor;
            }
        }
        return null;
    }

}
