package Pengkondisian;

import java.util.Scanner;

public class soal2_pengkondisian_ricky_putra 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		//deklarasi
		double diskon = 0;
		double totalBelanja;
		double totalBayar;
		
		
		
		//input
		System.out.println("Masukkan Total Belanja = ");
		totalBelanja = scan.nextDouble();
		
		//proses
		if (totalBelanja > 350000)
		{
			diskon = 0.05;
		}
		
		else if(totalBelanja > 200000 && totalBelanja < 350000)
		{
			diskon = 0.025;
		}
		
	
		totalBayar = totalBelanja - (totalBelanja * diskon);
		
		//output
		System.out.println("Total Bayar Anda Adalah = " + totalBayar);
	}
}
