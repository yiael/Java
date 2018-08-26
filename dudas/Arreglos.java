public class Arreglos{
	
	public static void main(String[] args) {
		//asignacion de un arreglo 
		String nombres[] = {"Yael","Erick","Guadalupe","Rene","Luviela","Uriel","David"}; 

		//acceder a un elemento del arreglo 
		System.out.println(nombres[0]);
		//saber la longitud del arreglo 
		System.out.println(nombres.length);
		//recorrer el arreglo 
		for (int i = 0; i < nombres.length ; i++ ) 
			System.out.println(nombres[i]);	

		String mascotas [] = new String[3];

		mascotas[0] = "Beck";
		mascotas[1] = "Yoda";
		mascotas[2] = "Laica";

		for (int e = 0; e < mascotas.length ; e++ )
			System.out.println( mascotas[e] );
			
		
	}
}