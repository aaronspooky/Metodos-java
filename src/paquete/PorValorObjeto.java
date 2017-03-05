package paquete;

public class PorValorObjeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//crea objeto de la clase Julian
		Julian jan = new Julian();
		//muestra valores actuales
		System.out.println("Propiedades del objeto en la creacion.");
		jan.mostrar();
		//llamada a metodo que modifica el objeto
		modifica(jan);
		System.out.println("\nPropiedades del objeto modificado");
		jan.mostrar();
	}
	
	static void modifica(Julian obj){
		//se modifica las variables instancia de obj
		
		obj.fecha = "01-feb-2001";
		obj.dias = 32;
	}

}

class Julian{
	String fecha;
	int dias;
	Julian(){
		fecha = "01-Jan-2001";
		dias = 1;
	}
	void mostrar(){
		System.out.print("Fecha actual: "+fecha+"\t Dias = "+dias);
	}
}