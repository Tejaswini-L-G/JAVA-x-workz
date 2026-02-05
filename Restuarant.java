class Restuarant{
	public static void main(String[] args){
		String restuarantName="Udupi";
		String owner="Spoorthi";
		String address="Mysore";
		String branches[]={"Kuvempu Nagae","JP Nagar"};
		String menu[]={"Full Meal","Idli Sambar","Masal Dosa"};
		
		System.out.println("The name of Restuarant is :"+restuarantName);
		System.out.println("Owner of Restuarant:"+owner);
		System.out.println("Addresss of Restuarant:"+address);
		System.out.println("Number of branches available:"+branches.length);
		System.out.println("The branches are:");
		for(String branch:branches){
		System.out.println(branch);
		}
		System.out.println("The Menu Conatins:");
		for(String food:menu){
		System.out.println(food);
		}
	}


}