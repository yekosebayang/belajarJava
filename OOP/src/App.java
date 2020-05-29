// import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        // gaji pokok
        // lembur (jam)
        // gajiPerJam
        // int salary = 50_000;
        // int overtime = 5;
        // int payPerHour = 100;

        // hitung jumah gaji -> gaji pokok + (gajiPerJam * lembur)
        // Scanner scanner = new Scanner(System.in);
        // Employee orang = new Employee(50_000, 100);
        // Employee person = new Employee(10_000);

        // int overtime = scanner.nextInt();

        System.out.println(Employee.employeeCount);

    }

    public static int calculateWage(int salary, int overtime, int payPerHour) {
        return salary + (overtime * payPerHour);
    }

    public static void testing() {
        System.out.println("Testing 123");
    }
}