/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btoop;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */

public class Taxmanagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // STUDENT
        ArrayList<Student> students = new ArrayList<>();
        System.out.print("số học sinh: ");
        int n_students = scanner.nextInt();
        double TaxStudent = 0;
        for (int i=0; i<n_students;i++) {
            System.out.println("nhập thông tin sinh viên: " + (i+1) + ": ");
            Student student = new Student();
            student.inputperson();
            students.add(student);
        }
		
        for (int i=0; i<students.size(); i++) {
            System.out.print("thu nhập của học sinh: " + students.get(i).getStudentID() + "= ");
            Double incomeStudent = scanner.nextDouble();
            System.out.print("thời gian bắt đầu tính bằng giờ: " + students.get(i).getStudentID() + "= ");
            int start_time = scanner.nextInt();
            System.out.print("thời gian kết thúc tính bằng giờ: " + students.get(i).getStudentID() + "= ");
            int end_time = scanner.nextInt();
            TaxStudent = students.get(i).payTax(incomeStudent, start_time, end_time);
            System.out.println();
            System.out.println("------------ " + students.get(i).getStudentID() + " ------------");
            students.get(i).xuat();
            System.out.println("thuế của: " + students.get(i).getStudentID() + " là " + (long) Math.floor(TaxStudent) + " VND");
            System.out.println();
        }
        System.out.println();
		
        //WORKER
        ArrayList<Worker> workers = new ArrayList<>();
        System.out.print("số công nhân là: ");
        int n_workers = scanner.nextInt();
        double TaxWorker = 0;
        for (int i=0; i<n_workers;i++) {
            System.out.println("nhập thông tin công nhân: " + (i+1) + ": ");
            Worker worker = new Worker();
            worker.inputperson();
            workers.add(worker);
        }

        for (int i=0; i<workers.size(); i++) {
            System.out.print("thu nhập của công nhân: " + workers.get(i).getCitizenID() + "= ");
            Double incomeWorker = scanner.nextDouble();
            System.out.print("thời gian bắt đầu tính bằng ngày: " + workers.get(i).getCitizenID() + "= ");
            int start_time = scanner.nextInt();
            System.out.print("thời gian kết thúc tính bằng ngày: " + workers.get(i).getCitizenID() + "= ");
            int end_time = scanner.nextInt();
            TaxWorker = workers.get(i).payTax(incomeWorker, start_time, end_time);
            System.out.println();
            System.out.println("------------ " + workers.get(i).getCitizenID() + " ------------");
            //System.out.println("\nWorker information " + (i+1) + " is ");
            workers.get(i).xuat();
            System.out.println("thuế của: " + workers.get(i).getCitizenID() + " là " + (long) Math.floor(TaxWorker) + " VND");
            System.out.println();
        }
        System.out.println();
		
        //BUSINESS
        ArrayList<BusinessPerson> businessPersons = new ArrayList<>();
        System.out.print("số doanh nhân: ");
        int n_bp = scanner.nextInt();
        double TaxBusinessPerson = 0;
        for (int i=0; i<n_bp;i++) {
            System.out.println("thông tin doanh nhân: " + (i+1) + ": ");
            BusinessPerson businessPerson = new BusinessPerson();
            businessPerson.xuat();
            businessPersons.add(businessPerson);
        }

        for (int i=0; i<businessPersons.size(); i++) {
            System.out.print("thu nhập của doanh nhân: " + businessPersons.get(i).getCitizenID() + "= ");
            Double incomeBusinessPerson = scanner.nextDouble();
            System.out.print("thời gian bắt đầu tính bằng phút: " + businessPersons.get(i).getCitizenID() + "= ");
            int start_time = scanner.nextInt();
            System.out.print("thời gian kết thúc tính bằng phút: " + businessPersons.get(i).getCitizenID() + "= ");
            int end_time = scanner.nextInt();
            TaxBusinessPerson = businessPersons.get(i).payTax(incomeBusinessPerson, start_time, end_time);
            System.out.println();
            System.out.println("------------ " + businessPersons.get(i).getCitizenID() + " ------------");
            //System.out.println("\nBusiness Person information " + (i+1) + " is ");
            businessPersons.get(i).xuat();
            System.out.println("thuế của: " + businessPersons.get(i).getCitizenID() + " là " + (long) Math.floor(TaxBusinessPerson) + " VND");
            System.out.println();
        }
        System.out.println();
    }
}
