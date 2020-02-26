package Assignment6;

public class Part4 {

	public Part4(String arg) {
		System.out.println("Argument is: " + arg);
	}
	
	public void testing(String test) {
		System.out.println(test);
	}

	public static void main(String[] args) {
		
		Part4 obj1 = new Part4("1st Constructor object");
		Part4 obj2 = new Part4("2nd Constructor object");
		Part4 obj3 = new Part4("3rd Constructor object");
		Part4 obj4 = new Part4("4th Constructor object");
		Part4 obj5 = new Part4("5thConstructor object");
		
		Part4[] objArray = new Part4[5];
		objArray[0]=obj1;
		objArray[1]=obj2;
		objArray[2]=obj3;
		objArray[3]=obj4;
		objArray[4]=obj5;
		
		for(int i=0;i<=objArray.length-1;i++)
			objArray[i].testing(i+1 + "th Object Array Reference!!");
	}

}
