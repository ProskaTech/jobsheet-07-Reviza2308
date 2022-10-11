/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
    Created By 21343031_Muhammad Reviza Dekry
*/
package js7;

/**
 *
 * @author Revskyyy
 */

import java.util.Scanner;
public class tugas1a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda : ");
        String nama = in.nextLine();
        int jumlah;
        for (jumlah = 0; jumlah < 10; jumlah += 1)
            System.out.println(nama);
    }
}
