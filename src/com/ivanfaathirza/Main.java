package com.ivanfaathirza;

import java.util.Date;
import java.util.Scanner;

/*
	NAMA = Ivan Faathirza
	KELAS = IF1
	NIM = 10119003
	Deskripsi program = program ini berisi perhitungan umur dan hasil
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Date date = new Date();
        Age age = new Age(date.getYear());
        System.out.print("Masukkan Tahun Lahir Anda : ");
        age.setYearBirth(scanner.nextInt());

        System.out.println("\n=====Hasil Perhitungan Umur====" +
                "\nTahun lahir anda : "+age.getYearBirth()+
                "\nHari ini Tahun : "+age.getYearNow()+
                "\nUmur kamu sampai hari ini adalah "+age.hitungUmur()+" tahun" +
                "\nTandanya Kamu "+age.tandanyaKamu(age.hitungUmur()));

    }
}
