package Practice;

public class Stringeverywordfirstlettercapital {

	public static void main(String[] args){
		String s = "My Name Is MaharsHI not";
		String x[] = s.split(" ");

		String r = "";
		for(String q:x) {
			String d = q.substring(0,1).toUpperCase();
			String e = q.substring(1);
			r = r+d+e+" ";
		}
		System.out.println(r);

	}

}
