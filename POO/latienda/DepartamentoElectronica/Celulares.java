package DepartamentoElectronica;
public class Celulares{
	
	String sistema;
	String display;
	double precio;
	String marca;

	public void setSistema( String sistema ){
		this.sistema = sistema;
	} //end setSistema

	public String getSistema(){
		return this.sistema;
	} //end getSistema

	public void setDisplay( String display ){
		this.display = display;
	} //end setSistema 

	public String getDisplay(){
		return this.display;
	} //end getDisplay

	public void setPrecio( double precio ){
		this.precio = precio;
	} //end setPrecio

	public double getPrecio(){
		return this.precio;
	} //end getPrecio

	public void setMarca( String marca ){
		this.marca = marca;
	} //end setMarca
	public String getMarca(){
		return this.marca; 
	}
} //end class 