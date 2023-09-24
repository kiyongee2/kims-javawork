package collection.list;

import java.util.Stack;

public class StackCoinTest{
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<>();
		
		//동전 객체 생성
		Coin coin500 = new Coin(500);
		Coin coin100 = new Coin(100);
		Coin coin10 = new Coin(10);
		
		//동전 추가(500 - 100 - 100)
		coinBox.push(coin500);
		coinBox.push(coin100);
		coinBox.push(coin10);
		
		//맨 위 자료 출력(꺼내기)
		//System.out.println(coinBox.pop().getCoint());
		
		//동전 빼기(10 - 100 - 500)
		while(!coinBox.empty()) {
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전: " + coin.getCoint() + "원");
		}
	}
}
