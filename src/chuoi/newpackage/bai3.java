/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuoi.newpackage;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class bai3 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("chieu dai cua chuoi ");
        int n = sc.nextInt();
        char s[] = new char[n];
        for (int i=0; i<n; i++) {
            System.out.printf("s[%d]= ", i);
            s[i] = sc.next().charAt(0);
        }
        String str = "";
        for (int i=0; i<s.length; i++) {
            str += Character.toString(s[i]);
        }
        System.out.println("chuoi ky tu: " + str);

    }

}
