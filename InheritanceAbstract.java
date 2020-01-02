package practice;

public abstract class InheritanceAbstract {
	public abstract void stockname();
	public abstract void listed();
	public abstract void price();
	}

 class s1 extends InheritanceAbstract{
	
	 
	 public void stockname() {
		System.out.println("Reliance");
	}
	
	 public void listed() {
		System.out.println("NSE");
	}
	
	public void price() {
		System.out.println("123");
	}
	public static void main(String args[]) {
		InheritanceAbstract obj1=new s1();
		obj1.stockname();
		obj1.listed();
		obj1.price();
	}
	
}

