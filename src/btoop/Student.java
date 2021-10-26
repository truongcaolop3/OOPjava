/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btoop;

import java.util.Scanner;


/**
 *
 * @author DELL
 */
public class Student extends Person implements Tax{
    private 
        String name,studentID,phone,email;

    public Student( String name , String studentID, String phone , String email , String birthday , String gender , String blood_type ) {
        super(birthday,gender,blood_type);
        this.name = name;
        this.studentID = studentID;
        this.phone = phone;
        this.email = email; 
    }

    public Student() {
            super();
    }
    
    public String getName() {
        return name;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getGender() {
        return gender;
    }

    public String getBlood_type() {
        return blood_type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBlood_type(String blood_type) {
        this.blood_type = blood_type;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("studentID: ");
        this.studentID = sc.nextLine();
        System.out.println("name: ");
        this.name = sc.nextLine();
        System.out.println("phone: ");
        this.phone = sc.nextLine();
        System.out.println("email: ");
        this.email = sc.nextLine();
        this.inputperson();
        
    }
    public void xuat() {
        
        System.out.println("studentID: " + this.getStudentID());
        System.out.println("họ tên: "+ this.getName());
        System.out.println("phone: " + this.getPhone());
        System.out.println("email: " + this.getEmail());
        System.out.println("birthday: " + this.getBirthday());
        System.out.println("giới tính: " + this.getGender());
        System.out.println("nhóm máu: " + this.getBlood_type());
        System.out.println("thuế: " + this.payTax(0, 0, 0) + " VND");
    }
    
    public double payTax(double income, int start_time, int end_time) {
        if (income > 11000000){
            return income * Math.abs(end_time - start_time) * (5/1000);
        }else return 0;
    }


}
