package homeWork2;

public class UseString {

	public static void main(String[] args) {
	String x="Mohammad Hamid";
	int len=x.length();
	System.out.println("x="+x );
	System.out.println("x="+len );
	System.out.println("Character at 7th position ="+x.charAt(7));
	System.out.println("Substring ="+x.substring(1));
	boolean con = x.contains("Mohammad");
	System.out.println("con");
	boolean T = x.contains("mohammad");
	System.out.println("T="+T);
	String firstName ="Mohammad";
	String lastName ="Hmaid";
	String fullName = firstName.concat(lastName);
	System.out.println("FullName  = " + fullName);
	String upperName = fullName.toUpperCase();
	String lowerName = fullName.toLowerCase();
	System.out.println("fullName =" +upperName);
	boolean M = firstName.isEmpty();
	System.out.println("fullName +" +M);
	boolean b = firstName.startsWith("M");
	System.out.println(" b = "+b);
	boolean y = lastName.startsWith("M");
	System.out.println(" y = "+y);
	boolean last = lastName.endsWith("g");
	System.out.println(" last = "+last);
	String[] names = {"John", "Tom" ,"Mochel"};
	for(int i = 0; i<4; i++) {
	System.out.println(names[i]);
	String z1="Java is good";
	String z2 = z1.replace('J', 'L');
	System.out.println(z2);
	String[]z3=z1.split("  ");
	for(String x1 : z3) {
	System.out.println(x1);
	String x4 = "PeopleNTech";
	String x5 = "PNT";
	String x6 = "PeopleNTech";
	System.out.println("Concatenated string=" +x4.codePointBefore(7));
	System.out.println("Index of a =" +x5.indexOf('N', 1));
	String reverse = new StringBuffer(x4).reverse().toString();
	System.out.println("String before reverse :" + x4);
	System.out.println("String after reverse :" + reverse);
	if (x4.equals(x5)) {
	System.out.println("Equal");
	}else {
	System.out.println("Not equal");
	if(x4.contains(x6)) {
	System.out.println("same");
	}else {
	System.out.println("Not same");
    if(x4.equalsIgnoreCase(x5)) {
	System.out.println("Same");
	}else {
	System.out.println("Not ok");
					
						
		}
	   }
	  }	
	 }
	}
   }
  }

	
  

