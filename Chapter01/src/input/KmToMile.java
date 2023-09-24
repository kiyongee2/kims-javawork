package input;

import java.util.Scanner;

public class KmToMile {

	public static void main(String[] args) {
		// km를 마일로 환산(1mile = 1.609344km)
		final double RATE_KPH_MPH = 1.609344;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("당신의 구속: ");
		double kph = scan.nextDouble();
		
		//변환 처리
		double mph = kph / RATE_KPH_MPH;
		
		//System.out.println(kph);
		System.out.println(mph);
		
		System.out.printf("%.2f", mph);
		scan.close();
	}

}
