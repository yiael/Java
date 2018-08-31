public class MesaPrincipal{

	public static void main(String[] args) {
		

		Tazon palomitas = new Tazon();
		Vaso agua 		= new Vaso();

		palomitas.setColor("rojo");
		String misPalomitas = palomitas.getColor();

		agua.setMaterial("plastico");
		String misVasos = agua.getMaterial();

		System.out.println( "Mi tazón de palomitas es de color" +" "+ misPalomitas+" "+"y un vaso fabricado de"+" "+ misVasos );

	} //end method
} //end class