import DepartamentoElectronica.*;
import DepartamentoRopa.*;

public class Tienda{
	public static void main(String[] args) {

		Camisa laCamisa 	= new Camisa();
		Pantalon elPantalon = new Pantalon();
		Smartphones elTel	= new Smartphones();
		Tableta laTableta   = new Tableta("Android 7.0 ", "10 Inch", 3099.23, " LG"  );

		//Ropa
		laCamisa.setColor("Rojo");
		laCamisa.setTalla("Chica");
		laCamisa.setPrecio(209.09);
		laCamisa.setTipo("Cuello de tortuga");
		elPantalon.setColor("Negro");
		elPantalon.setMaterial("Mezclilla");



		String colorCamisa 		= laCamisa.getColor();
		String tallaCamisa 		= laCamisa.getTalla();
		String precioCamisa 	= String.valueOf(laCamisa.getPrecio());
		String tipoCamisa 		= laCamisa.getTipo();
		String materialPantalon = elPantalon.getColor();
		String colorPantalon 	= elPantalon.getMaterial();

		//Celulares 
		elTel.setSistema("Android 6.0");
		elTel.setDisplay("4.5 Pul.");
		elTel.setPrecio(2000);
		elTel.setMarca("Motorola");
		elTel.setCompanyTel("A&T");


		String caracteristicasTel = elTel.getSistema() + " " + elTel.getDisplay() + " " + String.valueOf(elTel.getPrecio()) + " " + elTel.getMarca() + " " + elTel.getCompanyTel() + " " + elTel.resolucionCamara("20 px");

		//Tabletas 
		laTableta.setMarca("Samsumng");  
		String caracteristicasTableta = laTableta.getSistema() + " " + laTableta.getDisplay() + " " + String.valueOf(laTableta.getPrecio()) + " " + laTableta.getMarca() + " " + laTableta.resolucionCamara("50 px");


		System.out.println("Camisa");
		System.out.println(colorCamisa + " " + tallaCamisa + " " + precioCamisa + " " + tipoCamisa + "\n");
		System.out.println("Pantalon");
		System.out.println(materialPantalon + " " + colorPantalon + "\n");
		System.out.println("Celular");
		System.out.println(caracteristicasTel);	
		System.out.println(caracteristicasTableta);		

	}
}