package Assignment1;


abstract class Market{
	abstract void getPrice();
	abstract void getProductName();
}
class Product extends Market{
	int Price;
	String Name;
	public void Market(int Price,String Name){
		this.Price=Price;
		this.Name=Name;
	}
	public void getPrice(){
		System.out.println(this.Price);

	}
	public void getProductName(){
		System.out.println(this.Name);
	}
}
public class ques2{
	public static void main(String[] args)
	{ 

	}
}



