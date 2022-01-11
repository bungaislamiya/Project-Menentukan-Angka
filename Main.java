/*
Nama    : Bunga Islamiya Putri
NPM     : 20191310053
 */
package com.company;

import javax.swing.*;
public class Main {

    public static void main(String[] args) {
        int nilai;
        String n;
        n = JOptionPane.showInputDialog("input nilai mahasiswa:");
        nilai = Integer.parseInt(n);
        if (nilai > 0) {
            System.out.println("Bilangan " + nilai + " adalah bilangan positif");
        } else if (nilai == 0) {
            System.out.println("Bilangan " + nilai + " adalah bilangan nol");
        } else {
            System.out.println("Bilangan " + nilai + " adalah bilangan negatif");
        }
    }
}
