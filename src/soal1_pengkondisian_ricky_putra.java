package Pengkondisian;

import java.util.Scanner;

public class soal1_pengkondisian_ricky_putra 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		//deklarasi
		double suhu;
		
		//input
		System.out.print("Masukkan Suhu = " + "");
		suhu = scan.nextDouble();
		
		//proses
		if (suhu <= 0)
		{
			System.out.println("Keadaan Beku");
		}	
		
		else if (suhu > 0 && suhu < 100)
		{
			System.out.println("Keadaan Cair");
		}
		else												// bisa juga else if ( suhu>100)
		{
			System.out.println("Keadaan Gas");
		}	
	}
}
