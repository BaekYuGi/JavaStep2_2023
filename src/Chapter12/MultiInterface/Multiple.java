package Chapter12.MultiInterface;

import Chapter12.Interface.Calc;

public class Multiple extends CompleteCalc implements Calc, Runnable{
	
	public static void main(String[] args) {
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int substaract(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
