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
public abstract class Person {

    /**
     * @param args the command line arguments
     */
    String birthday;
    String gender;
    String blood_type;
    public Person() {
        super();
    }
    public Person(String birthday, String gender, String blood_type) {
        super();
        this.birthday = birthday;
        this.gender = gender;
        this.blood_type = blood_type;
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

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBlood_type(String blood_type) {
        this.blood_type = blood_type;
    }
    
    public void inputperson() {
        Scanner sc = new Scanner(System.in);
        System.out.println("birthday: ");
        this.birthday = sc.nextLine();
        System.out.println("giới tính: ");
        this.gender = sc.nextLine();
        System.out.println("nhóm máu: ");
        this.blood_type = sc.nextLine();
    }
}
