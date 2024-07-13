package Interface;

class INFC implements IFIF,sec {

	public static void main(String[] args) {

		System.out.println("MAin Class is IF ");
		
		System.out.println(IFIF.k);
		IFIF i = new INFC();
		i.first();
		sec s = new INFC();
		((INFC) s).two();
		 
		

	}

	@Override
	public void first() {
		this.two();
		System.out.println("Implementation of First");
		
	}
	
	public void two() {
		System.out.println("Interface two");
	}

}
