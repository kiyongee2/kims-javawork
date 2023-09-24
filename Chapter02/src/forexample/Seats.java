package forexample;

import java.util.Scanner;

public class Seats {

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
		
		for(int i=0; i<row; i++) {
			for(int j=1; j<=column; j++) {
				int seatNum = column*i+j;
				if(seatNum > customer) 
					break;
				System.out.print(seatNum + " ");
			}
			System.out.println();
		}
		
		scan.close();
	}

}
