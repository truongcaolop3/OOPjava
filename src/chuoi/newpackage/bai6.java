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
public class bai6 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("String: ");
		String string = sc.nextLine();
		String str[] = string.split("\\s+");
		System.out.print("chữ: ");
		String word = sc.nextLine();
		int count = 0;
		for (int i=0; i<str.length; i++) {
			if (str[i].equals(word)) {
				count++;
			}
		}
		if (count <= 0) {
			System.out.println("so lan xuat hien cua: \"" + word + "\" là " + count + " vì vậy không có vị trí !");
		} else {
			System.out.print("số lần xuất hiện của \"" + word + "\" là " + count + " ở các vị trí: ");
			for (int i=0; i<str.length; i++) {
				if (str[i].equals(word)) {
					System.out.print(i + " ");
				}
			}
		}
	}
}
