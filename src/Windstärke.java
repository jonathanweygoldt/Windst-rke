import java.util.Scanner;

public class Windstärke {

	public static void main(String[] args) {
		
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Geschwindigkeit: ");
	
		double kmh = s.nextInt();
		
		System.out.println("Knoten: "+getKnots(kmh));
		System.out.println("Beaufort: "+getBeaufort(kmh));
	
	
		if(windstill(kmh)){
			System.out.println("Windstill");
			
		
		}
	
		else{
			if(kmh >= 100){
				System.out.println("Orkan");}
			else{System.out.print("");
			}
			}
		
	
	
	}
		
		public static double getKnots(double kmh){
			return (kmh*0.5399568);
		}
		
		public static double getBeaufort(double kmh){
			return ((kmh/3.6)/0.836*0.66666666666666);
		}
		
		public static boolean windstill(double kmh){
			if(kmh <= 2){
				return true;}
			
			else{return false;}
			}			
		}
	

	