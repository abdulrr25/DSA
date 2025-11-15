package com.demo.beans;
import java.util.Scanner;

class Employee {
    int empid;
    String ename;
    double salary;

    Employee(int empid, String ename, double salary) {
        this.empid = empid;
        this.ename = ename;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return empid + " - " + ename + " - " + salary;
    }
}

public class EmployeeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array of size 20
        Employee[] employees = new Employee[20];
        int count = 0;

        // Add 15 employees initially
        System.out.println("Enter details of 15 employees (empid, ename, salary):");
        for (int i = 0; i < 15; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            double sal = sc.nextDouble();
            employees[count++] = new Employee(id, name, sal);
        }

        // Bubble sort first 15 employees by salary
        bubbleSort(employees, count);

        System.out.println("\nEmployees after Bubble Sort (by salary):");
        printEmployees(employees, count);

        // Accept 5 more employees
        System.out.println("\nEnter details of 5 more employees (empid, ename, salary):");
        for (int i = 0; i < 5; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            double sal = sc.nextDouble();
            Employee newEmp = new Employee(id, name, sal);

            // Insert using insertion sort logic
            insertEmployee(employees, count, newEmp);
            count++;
        }

        System.out.println("\nFinal Employees after Insertion Sort (by salary):");
        printEmployees(employees, count);

        sc.close();
    }

    // Bubble Sort
    public static void bubbleSort(Employee[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].salary > arr[j + 1].salary) {
                    Employee temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Insert employee into sorted array (Insertion Sort logic)
    public static void insertEmployee(Employee[] arr, int n, Employee newEmp) {
        int i = n - 1;
        while (i >= 0 && arr[i].salary > newEmp.salary) {
            arr[i + 1] = arr[i];
            i--;
        }
        arr[i + 1] = newEmp;
    }

    // Print employees
    public static void printEmployees(Employee[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
