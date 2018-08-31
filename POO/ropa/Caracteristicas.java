public class Caracteristicas{

	private String tamaño;
	private String color;
	private String tipo;
	private double precio;

	public void setColor(String color){
		this.color = color;
	}//end setprenda

	public String getColor(){
		return this.color;
	}//end getprenda


	public void setTamaño(String tamaño){
		this.tamaño = tamaño;
	}//end set tamaño

	public String getTamaño(){
		return this.tamaño;
	}//end gettamaño

	public void setTipo(String tipo){
		this.tipo = tipo;
	}//end setTipo

	public String getTipo(){
		return this.tipo;
	}

	public void setPrecio(double precio){
		this.precio = precio;
	}//end setPrecio
	public double getPrecio(){
		return this.precio;
	}
}//end class