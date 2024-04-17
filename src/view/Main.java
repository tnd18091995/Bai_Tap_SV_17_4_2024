package view;

import controller.StudentManager;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("-------Manager Student-------");
            System.out.println("1. Show Students List");
            System.out.println("2. Add Student");
            System.out.println("3. Remove Student");
            System.out.println("4. Show Students List With GPA");
            System.out.println("0. Exit ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    StudentManager.showListStudents();
                    break;
                case 2:
                    StudentManager.addStudent(scanner);
                    break;
                case 3:
                    System.out.println("Enter ID Student");
                    int idRemove = scanner.nextInt();
                    StudentManager.removeStudent(idRemove);
                    break;
                case 4:
                    StudentManager.showListStudentsWithOutGPA();
                    break;
                case 0:
                    System.out.println("Exit Program");
                    break;
                default:
                    System.out.println("Try Enter Again!");
                    break;
            }
        }while(choice != 0);
    }
}
