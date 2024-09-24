package pkg1;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private float price;
	private static  int bookCount;
	
	static {
		bookCount=0;
		
	}
	
	public static int getBookCount() {
		return bookCount;
	}
	
	public void display() {
		System.out.println(bookNo+": "+title+", "+author+" is - "+price);
		System.out.println("The current bookcount is : "+bookCount);
	}
	
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
//	public Book() {
//		bookCount++;
//	}
	
	public Book(int v1,String v2,String v3,float v4){
		
		bookNo = v1;
		author = v3;
		int flag = 0;
		if(v2.length()<=4){
			System.err.println("Title must be atleast 4 characters");
			//System.exit(0);
			flag=1;
		}
		else
			title = v2;
		
		
		
		if(v4>0 && v4<5001)
			price = v4;
		else{
			System.err.println("Price must be in range 1 to 5000");
			//System.exit(0);
			flag=1;
		}
		
		if(flag==1){
			System.exit(0);
		}
		bookCount++;
	}
}
