package jennyworld;
public class DungeonsandDragons {
	public static void main(String[] args) {
		double n = 0.0;
		int four = 0; //four sided
		int six = 0; //six sided
		int eight = 0; //eight sided
		int ten = 0; //ten sided
		int twelve = 0; //twelve sided
		int twenty = 0; //twenty sided
		int hundred = 0; //hundred sided
		System.out.println("Dungeons and Dragons Dice");
		System.out.println("by Jenny Wang");
		System.out.println(" ");
		System.out.println("This program is to be used in Dungeons and Dragons to stimulate the dice game.");
		System.out.println(" ");
		n = Math.random();
		
		four = (int)(n*4+1); //1-4
		System.out.println("4-sided = "+four);	
		
		six = (int)(n*6+1); //1-6
		System.out.println("6-sided = "+six);
		
		eight = (int)(n*8+1); //1-8
		System.out.println("8-sided = "+eight);
		
		ten = (int)(n*10); //0-9
		System.out.println("10-sided = "+ten);
		
		twelve = (int)(n*12+1);//1-12
		System.out.println("12-sided = "+twelve);
		
		twenty = (int)(n*20+1);//1-20
		System.out.println("20-sided = "+twenty);
		
		hundred = (int)(n*100);//0-99
		System.out.println("100-sided = "+hundred);
			
}
}
