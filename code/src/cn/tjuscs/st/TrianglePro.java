package cn.tjuscs.st;

public class TrianglePro {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triangle(1,2,3);
	}
	public static void triangle(int a, int b, int c){
		if(a <= 0 || b <=0 || c <= 0){
			System.out.println("The triangle is illegal.");
		}
		else if(a + b <= c || a + c <= b || b + c <= a ){
			System.out.println("The triangle is illegal.");
		}
		else if (a == b && a == c){
			System.out.println("The triangle is equilateral.");
		}
		else if (a == b || a == c || b == c){
			System.out.println("The triangle is isosceles.");
		}
		else{
			System.out.println("The triangle is scalene.");
		}
	}

}
