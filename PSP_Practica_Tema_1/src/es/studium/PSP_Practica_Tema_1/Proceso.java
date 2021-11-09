package es.studium.PSP_Practica_Tema_1;

public class Proceso
{
	private String nombreProceso;
	private String idProceso;
	
	/* Constructor por defecto */
	  public Proceso () 
	  {
		  nombreProceso = "";
		  idProceso = "";
		  
	  }
	 
	  /* Constructor con parámetros */
	  public Proceso (String n, String i) 
	  {
	  	  nombreProceso = n;
		  idProceso = i;
	  }
	 
	  /* Métodos */
	  public String getNombreProceso() 
	  {
		  return nombreProceso;
	  }
	 
	  public void setNumerocuenta(String n) 
	  {
		  nombreProceso = n;
	  }
	 
	  public String getidProceso() 
	  {
		  return idProceso;
	  }
	 
	  public void setidProceso(String i) 
	  {
		  idProceso = i;
	  }
	 
}
