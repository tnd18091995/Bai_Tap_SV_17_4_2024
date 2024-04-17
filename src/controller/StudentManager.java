package controller;

import model.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static ArrayList<Student> listStudents =new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public static void addStudent(Scanner scanner){
        int id;
        boolean idExists;
        do{
            System.out.println("Enter ID Student: ");
            id = scanner.nextInt();
            idExists = false;
            for(Student student: listStudents){
                if(student.getId() == id){
                    System.err.println("ID already exists! Please entry again!");
                    idExists = true;
                    break;
                }
            }
        }while (idExists);
        scanner.nextLine();
        System.out.println("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Student Email: ");
        String email = scanner.nextLine();
        System.out.println("Enter Student GPA");
        double gpa = scanner.nextDouble();
        Student student = new Student(id, name, email, gpa);
        listStudents.add(student);
    }
    public static void showListStudents(){
        if(listStudents.isEmpty()){
            System.out.println("List student is empty!");
        }
        for(Student student: listStudents){
            System.out.println(student);
        }
    }
    public static void removeStudent(int id) {
        Student removeStudents = null;
        for (Student student : listStudents) {
            if (student.getId() == id) {
                removeStudents = student;
                break;
            }
        }
        if (removeStudents != null) {
            listStudents.remove(removeStudents);
        } else {
            System.out.println("Not Student Found!");
        }
    }
    public static void showListStudentsWithOutGPA(){
        if(listStudents.isEmpty()){
            System.out.println("List student is empty!");
        }
        for(Student student: listStudents){
            System.out.println(student.toStringWithOutGPA());
        }
    }
}
