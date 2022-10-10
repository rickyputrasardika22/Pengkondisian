package Pengkondisian;

import java.util.Scanner;

public class soal3_pengkondisian_ricky_putra 
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		
		//deklarasi
		double ipk;
		int sks;
		
		//input
		System.out.println("Masukkan IPK Anda = ");
		ipk = scan.nextDouble();
		
		//proses
		if (ipk >= 3.00)
		{
			System.out.println("Selamat Anda Mengambil 24 SKS");
		}
		else if (ipk > 2.50 && ipk < 2.99)
		{
			System.out.println("Selamat Anda Mengambil 21 SKS");
		}
		else if (ipk > 2.00 && ipk < 2.49)
		{
			System.out.println("Selamat Anda Mengambil 18 SKS");
		}
		else if (ipk > 1.50 && ipk < 1.99)
		{
			System.out.println("Selamat Anda Mengambil 15 SKS");
		}
		else if (ipk < 1.50)
		{
			System.out.println("Selamat Anda Mengambil 12 SKS");
		}	
		
	}
}
