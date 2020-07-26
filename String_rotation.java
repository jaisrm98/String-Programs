 package coding;

public class String_rotation {

	public static void main(String[] args) {
		 String str="IndiaVsEngland";
		 String rotation="EnglandIndiaVs";
		 String concatenated=str+rotation;
		 if(str.length()!=rotation.length())
			 System.out.println("Rotation is incorrect");
		 else if(concatenated.contains(rotation))
		 {
			 System.out.println("Rotation is correct");
		 }
		 else
		 {
			 System.out.println("Rotation is incorrect");
		 }
	}

}
