package Array;

public class addarrayelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {5,3,2,4,7,8};
		int key = 11;
		for(int i = 0; i< a.length; i++) {
			int sum = 0;
	
			for(int j=i+1; j<a.length; j++) {
				
				sum = a[i] + a[j];
				if (sum == key) {
					System.out.println(a[i]+" "+ a[j]);
					
				}else {
					System.out.println("--");
				}
			}
		}
		
		
	}
}
