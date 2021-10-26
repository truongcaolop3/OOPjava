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
public class bai7 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        String string = sc.nextLine();
        String stringReverse = "";
        for (int i=string.length()-1; i>=0; i--) {
                stringReverse += string.charAt(i);
        }
        System.out.println("chuoi sau khi dao nguoc: " + stringReverse);
    }
}
