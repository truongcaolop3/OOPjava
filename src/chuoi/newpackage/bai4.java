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
public class bai4 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("String: " );
        String string = sc.nextLine();
        String word[] = string.split("\\s+");
        System.out.println("từng chữ của chuỗi: ");
        for (int i=0; i<word.length; i++) {
                System.out.println(word[i]);
        }
    }
}
