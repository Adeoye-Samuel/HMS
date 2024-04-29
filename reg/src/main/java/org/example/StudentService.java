package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService {
    Scanner scanner = new Scanner(System.in);
   List<String> studentList=new ArrayList<>();
    Student student = new Student();


    public void displaymenu(){

       while (true){
           System.out.println("1. StudentDetail \n2. printout Details \n3. exit" + "Enter your option>>>>>");
           int register = scanner.nextInt();

           switch (register){
               case 1:
                   System.out.println("Enter your Details below");
                   studentDetails();
                   break;
               case 2:
                   System.out.println("This is your details");
                   printoutDetails();
                   break;
               case 3:
                   System.out.println("exiting...");
                   exitpage();
                   break;
           }
       }
    }

    public void studentDetails() {
        System.out.println("enter your id: ");
        student.setId(scanner.next());
        System.out.println("enter your Name: ");
        student.setName(scanner.next());
        System.out.println("enter your gender: ");
        student.setGender(scanner.next());
        System.out.println("enter your D.O.B: ");
        student.setDob(scanner.next());
        System.out.println("enter your : RegNo");
        student.setRegNo(scanner.next());
        System.out.println("enter your BankName: ");
        student.setBankName(scanner.next());
        System.out.println("enter your ReceiptNO: ");
        student.setReceiptNo(scanner.next());
//        studentList.add(student);

        String listOfStudent = "id:" + student.getId() +"\n"+
                "Name :" + student.getName()+"\n" +
                "Gender:" + student.getGender() +"\n" +
                "DOB :" + student.getDob() +"\n"+
                "Regno :" + student.getRegNo() +"\n"+
                "BankName :" + student.getBankName()+"\n"+
                "ReceiptNumb :" + student.getReceiptNo();
               studentList.add(listOfStudent);

    }
    private void printoutDetails() {
        for(String employee :studentList){
            System.out.println(employee);
        }
    }
    private void exitpage() {
        System.out.println("thank you ");
        System.exit(0);
    }
}
