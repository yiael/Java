package DepartamentoRopa;
public class Ropa{
	String talla;
	String color;
	double precio;

	public void setTalla(String talla){
		this.talla = talla;
	}//end setTalla
	public String getTalla(){
		return this.talla;
	}//end getTalla


	public void setColor(String color){
		this.color = color;
	} // end setColor 
	public String getColor(){
		return this.color;
	}//end getColor 


	public void setPrecio(double precio){
		this.precio = precio;
	}//end setPrecio
	public double getPrecio(){
		return this.precio;
	}

}//end class