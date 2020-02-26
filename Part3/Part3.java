package Assignment6;

public class Part3 {
	
	public Part3(String arg) {
		System.out.println("Argument is: " + arg);
	}

	public static void main(String[] args) {
		Part3[] objArray = new Part3[5];
		for(int i=0;i<=objArray.length-1;i++)
			objArray[i] = new Part3(i+1 + "th Object!!");
	}

}
