package question1;

import java.util.Scanner;

abstract class Shape
{
	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	abstract double calculateArea(int value);
}

class Circle extends Shape
{
	double calculateArea(int value)
	{
		return (double) (3.14*value*value);
	}
}

class Square extends Shape
{
	double calculateArea(int value)
	{
		return (value*value);
	}
}

public class ShapeMain 
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Circle \nSquare");
		System.out.println("Enter the shape");
		String type = input.next();
		Shape s;
		if(type.equalsIgnoreCase("Circle"))
		{
			System.out.println("Enter the radius");
			int rad = input.nextInt();
			s=new Circle();
			System.out.println("Area of Circle:"+s.calculateArea(rad));
		}
		else
		{
			System.out.println("Enter the side");
			int side = input.nextInt();
			s=new Square();
			System.out.println("Area of Circle:"+s.calculateArea(side));
		}
	}
}
