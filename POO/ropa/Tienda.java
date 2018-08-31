import java.util.Scanner;

public class Tienda{
	public static void main(String[] args) {
		
		Caracteristicas blusa = new Caracteristicas();
		Scanner in = new Scanner(System.in);
		String co;
		String ta;
		String ty;
		double pre;

		System.out.println("Que tipo de prenda sera? (blusa, camisa, camiseta etc ) " );		
		blusa.setTipo( ty = in.nextLine());
		String elTipo = blusa.getTipo();

		System.out.println();

		System.out.println("De que color quieres que sea tu prenda?");
		blusa.setColor( co = in.nextLine());
		String laPrenda = blusa.getColor();

		System.out.println();		

		System.out.println("De que tamaño/talla quieres que sea tu prenda? " );		
		blusa.setTamaño( ta = in.nextLine());
		String elTamaño = blusa.getTamaño();

		System.out.println();
		System.out.print("Su precio total sera de: ");
		blusa.setPrecio(pre = in.nextDouble());
		double elPrecio = blusa.getPrecio();

		System.out.println();
		System.out.println("---------------Prenda--------------");
		System.out.println();

		System.out.println("Tu " + elTipo + " es de color " + laPrenda);
		System.out.println("Con un tamaño " + elTamaño + " y un precio de " + elPrecio);
		
	}
}