public class Bow {
	private String name;
	private double price;
	private String type;
	private String category;
	
	Bow(double pr){
		price=pr;
		if (pr>100 && pr<200) 
			System.out.println("category-c");
		if (pr>=1000 && pr<4000) 
			System.out.println("category-b");
		if (pr>=4000) 
			System.out.println("category-a");
		if (pr<50) 
			System.out.println("no category");
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}