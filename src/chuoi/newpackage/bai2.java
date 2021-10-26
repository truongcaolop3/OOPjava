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
public class bai2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        String str = sc.nextLine();
        str = str.trim().toLowerCase();
        str = str.replaceAll("\\s+", " ");
        String []arr = str.split(" ");
        str = "";
        for (int i=0; i<arr.length; i++) {
                str += String.valueOf(arr[i].charAt(0)).toUpperCase() + arr[i].substring(1);
                str += " ";
        }
        System.out.println("sau khi viet hóa:  " + str);
        sc.close();
    }
}
