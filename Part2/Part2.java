package Assignment6;

public class Part2 {
	private int a;
	private int b;
	
	public Part2(int a){
		this(a,20);
	}
	
	public Part2(int a,int b){
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) {
		Part2 obj = new Part2(10);
		System.out.println("Single Parameter Constructor Values....");
		System.out.println("a = " + obj.a);
		System.out.println("b = " + obj.b);
		Part2 obj1 = new Part2(5,15);
		System.out.println("Double Parameter Constructor Values....");
		System.out.println("a = " + obj1.a);
		System.out.println("b = " + obj1.b);
	}

}
