public class Product{
	static String category="Electronics";
		String productName;
	public static void main(String args[]){
		System.out.println("Category :"+category);
		Product product1=new Product();
		Product product2=new Product();
		product1.productName="Laptop";
		System.out.println("Product1 :"+product1.productName);
		product2.productName="Smart phone";
		System.out.println("Product2 :"+product2.productName);
	}
}
	
		