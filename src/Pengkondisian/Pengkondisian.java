package Pengkondisian;

import java.util.Scanner;

public class Pengkondisian 
{
	public static void main(String [] args)
	{
		//Deklarasi
		Scanner scan = new Scanner(System.in);
		int angka;
		
		//input
		System.out.print("Masukkan Angka = ");
		angka = scan.nextInt();
		
		
		//proses
		if (angka % 2 == 0)
		{
			System.out.println("Bilangan Genap");
		}	
		else if (angka % 2 == 1)
		{
			System.out.println("Bilangan Ganjil");
		}	
		
		
	}
}
