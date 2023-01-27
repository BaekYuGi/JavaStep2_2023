package Chapter17.Stack_Queue;

import java.util.Stack;

public class CoinMain {

	public static void main(String[] args) {
		
		Stack<Coin> coinBox=new Stack<Coin>();
		
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(300));
		coinBox.push(new Coin(200));
		coinBox.push(new Coin(600));
		
		System.out.println(!coinBox.isEmpty());
		
		while(!coinBox.isEmpty()) {
			Coin coin=coinBox.pop();
			System.out.println("꺼내온 동전 : "+coin.getValue());
		}
		
	}

}
