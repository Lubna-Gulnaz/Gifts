package maven.gift;

public class sweets {
	String[] candies;
	int[] weight;
	public sweets(String[] candies,int[] weight) {
		this.candies=candies;
		this.weight=weight;

	}
	public void display() {
		System.out.println("The chocolates in the gifts are : ");
		for (int i=0;i<candies.length;i++) {
			System.out.println(candies[i]);
			System.out.println(" - "+weight[i]);
		}
	}
	
	public int totalweight() {
		int total=0;
		for(int i=0;i<weight.length;i++) {
			total+=weight[i];
		}
		return total;
	}

}
