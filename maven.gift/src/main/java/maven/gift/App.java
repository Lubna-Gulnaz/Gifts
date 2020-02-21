package maven.gift;

public class App {

	public static void main(String[] args) {
		String[] sweet= {"cadbury","munch","five star","ferrero rocher"};
		String[] gift = {"diary milk","m&m","nougat",""};
		String[] chocolate = {"m&m","nougat","others"};
		int[] wt1= {10,15,16};
		int cost[]= {18,14,17,12};
		sweets object1=new sweets(sweet,cost);
		
		object1.display();
		System.out.println("The total weight of the gift box is "+object1.totalweight());
		gifts obj2=new gifts();
		obj2.display();
		
		gifts obj3=new gifts(gift);
		obj3.display();
		chocolates choc=new chocolates(chocolate,wt1);
		choc.display();
		System.out.println("The total weight of chocolate box is: "+choc.totalweight());
		}

	}


