
public class Product {
	String name;
	int price;
	double gst;
	double discount;
	int quantity;
	

	public static void main(String[] args) {
		
		Product p1= new Product();
		p1.name="kinderjoy";
		p1.price=50;
		p1.gst=14.4;
		p1.discount=20.4;
		p1.quantity=10;
		System.out.println("product name:"+p1.name);
		System.out.println("price:"+p1.price);
		System.out.println("gst:"+p1.gst);
		System.out.println("discount"+p1.discount);
		System.out.println("quantity:"+p1.quantity);
		

		Product p2= new Product();
		p2.name="dell";
		p2.price=50000;
		p2.gst=14.4;
		p2.discount=20.4;
		p2.quantity=20;
		System.out.println("product name:"+p2.name);
		System.out.println("price:"+p2.price);
		System.out.println("gst:"+p2.gst);
		System.out.println("discount"+p2.discount);
		System.out.println("quantity:"+p2.quantity);
	

		Product p3= new Product();
		p3.name="powerhouse";
		p3.price=500;
		p3.gst=199.9;
		p3.discount=20.4;
		p3.quantity=20;
		System.out.println("product name:"+p3.name);
		System.out.println("price:"+p3.price);
		System.out.println("gst:"+p3.gst);
		System.out.println("discount"+p3.discount);
		System.out.println("quantity:"+p3.quantity);
		
		Product p4= new Product();
		p4.name="powerhouse";
		p4.price=500;
		p4.gst=199.9;
		p4.discount=20.4;
		p4.quantity=20;
		System.out.println("product name:"+p4.name);
		System.out.println("price:"+p4.price);
		System.out.println("gst:"+p4.gst);
		System.out.println("discount"+p4.discount);
		System.out.println("quantity:"+p4.quantity);
	}
	

}
