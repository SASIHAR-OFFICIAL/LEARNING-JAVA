package _03_Return_Function;

public class ReturnWithDivide2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnWithDivide2 Addinput = new ReturnWithDivide2();
		int Addoutput = Addinput.Add();
		ReturnWithDivide2.Divide(Addoutput);
	}
	private static void Divide(int Addoutput) {
		// TODO Auto-generated method stub
		int e = Addoutput / 2;
		System.out.println("divide output = " + e);
	}
	private int Add() {
		// TODO Auto-generated method stub
		int a = 12, b = 38;
		int c = a + b;
		System.out.println("Add output = " + c);
		return c;
	}
}
