package DepartamentoElectronica;
public class Smartphones extends Celulares implements Camara{

	String companyTel;
	String resolucion;

	public void setCompanyTel(String companyTel){
		this.companyTel = companyTel;
	} //end setCompanyTel

	public String getCompanyTel(){
		return this.companyTel;
	}

	public String resolucionCamara(String resolucion){
		return this.resolucion = resolucion;
	}

} //end class 