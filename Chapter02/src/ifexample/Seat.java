package ifexample;

import java.util.Scanner;

public class Seat {

	public static void main(String[] args) {
		// 줄 수 계산
		//Seat seat = new Seat();
		//System.out.println(seat);
		int customer, column, row;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("입장객 수:");
		customer = scan.nextInt();
		
		System.out.print("좌석 열 수:");
		column = scan.nextInt();
		
		if(customer % column == 0) {
			row = customer / column;
		}else {
			row = (int)(customer / column) + 1;
		}
		
		System.out.println("줄 수: " + row);
	}

}
