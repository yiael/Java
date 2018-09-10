package DepartamentoElectronica;
public class Tableta extends Celulares implements Camara{

	String resolucion;

	public Tableta( String sistema , String display , double precio , String marca ){

		this.sistema = sistema;
		this.display = display;
		this.precio  = precio;
		this.marca	 = marca;

 
		System.out.println("Esto es una tableta \n " + sistema + " " + display + " " + String.valueOf(precio) + " " + marca);	 

	}

	public String resolucionCamara(String resolucion){
		return this.resolucion = resolucion;
	} //end resolucionCamara
	
} //end class