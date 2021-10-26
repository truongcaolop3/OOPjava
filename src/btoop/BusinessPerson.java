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
public class BusinessPerson extends Person implements Tax{
    private 
        String name , citizenID , phone , email;
        double salary , business_income , other_income;
    public BusinessPerson() {
        super();
    }
    public BusinessPerson(String name, String citizenID, String phone, String email, double salary, double business_income, double other_income, String birthday, String gender, String blood_type) {
        super(birthday, gender, blood_type);
        this.name = name;
        this.citizenID = citizenID;
        this.phone = phone;
        this.email = email;
        this.salary = salary;
        this.business_income = business_income;
        this.other_income = other_income;
    }

    public String getName() {
        return name;
    }

    public String getCitizenID() {
        return citizenID;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public double getSalary() {
        return salary;
    }

    public double getBusiness_income() {
        return business_income;
    }

    public double getOther_income() {
        return other_income;
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

    public void setCitizenID(String citizenID) {
        this.citizenID = citizenID;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBusiness_income(double business_income) {
        this.business_income = business_income;
    }

    public void setOther_income(double other_income) {
        this.other_income = other_income;
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
    

    @Override
    public double payTax(double income, int start_time, int end_time) {
        if (income >50000000){
            return income * Math.abs(end_time - start_time) * (3/100);
        }else if (income >10000000){
            return income * Math.abs(end_time - start_time) * (2/100);
        }else return 0;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("citizenID: ");
        this.citizenID = sc.nextLine();
        System.out.println("name: ");
        this.name = sc.nextLine();
        System.out.println("phone: ");
        this.phone = sc.nextLine();
        System.out.println("email: ");
        this.email = sc.nextLine();
        System.out.println("lương: ");
        this.salary = sc.nextDouble();
        System.out.println("thu nhập doanh nghiệp: ");
        this.business_income = sc.nextDouble();
        System.out.println("thu nhập khác:");
        this.other_income = sc.nextDouble();
        this.inputperson();
    }
    public void xuat() {
        
        System.out.println("studentID: " + this.getCitizenID());
        System.out.println("họ tên: "+ this.getName());
        System.out.println("phone: " + this.getPhone());
        System.out.println("email: " + this.getEmail());
        System.out.println("lương: " + this.salary);
        System.out.println("thu nhập doanh nghiệp: " + this.getBusiness_income());
        System.out.println("thu nhập khác: " + this.getOther_income());
        System.out.println("birthday: " + this.getBirthday());
        System.out.println("giới tính: " + this.getGender());
        System.out.println("nhóm máu: " + this.getBlood_type());
        System.out.println("thuế: " + this.payTax(0, 0, 0) + " VND");
    }
}
