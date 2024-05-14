import java.util.ArrayList;
import java.util.Scanner;

class Doctor {
    private int id;
    private String name;
    private String specialty;

    public Doctor(int id, String name, String specialty) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}

public class Lab10q4 {
    private ArrayList<Doctor> doctors;

    public Lab10q4() {
        this.doctors = new ArrayList<>();
    }

    public void addDoctor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Doctor ID:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Doctor Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Doctor Specialty:");
        String specialty = scanner.nextLine();

        Doctor doctor = new Doctor(id, name, specialty);
        doctors.add(doctor);
        System.out.println("Doctor added successfully!");
    }

    public void displayDoctors() {
        if (doctors.isEmpty()) {
            System.out.println("No doctors found!");
            return;
        }
        System.out.println("List of Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println(
                    "ID: " + doctor.getId() + ", Name: " + doctor.getName() + ", Specialty: " + doctor.getSpecialty());
        }
    }

    public void updateDoctor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Doctor ID to update:");
        int id = scanner.nextInt();
        scanner.nextLine();

        Doctor doctorToUpdate = null;
        for (Doctor doctor : doctors) {
            if (doctor.getId() == id) {
                doctorToUpdate = doctor;
                break;
            }
        }

        if (doctorToUpdate == null) {
            System.out.println("Doctor not found with ID: " + id);
            return;
        }

        System.out.println("Enter new Doctor Name:");
        String newName = scanner.nextLine();
        System.out.println("Enter new Doctor Specialty:");
        String newSpecialty = scanner.nextLine();

        doctorToUpdate.setName(newName);
        doctorToUpdate.setSpecialty(newSpecialty);
        System.out.println("Doctor information updated successfully!");
    }

    public static void main(String[] args) {
        Lab10q4 dms = new Lab10q4();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add Doctor");
            System.out.println("2. Display Doctors");
            System.out.println("3. Update Doctor");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    dms.addDoctor();
                    break;
                case 2:
                    dms.displayDoctors();
                    break;
                case 3:
                    dms.updateDoctor();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);
        scanner.close();
    }
}
