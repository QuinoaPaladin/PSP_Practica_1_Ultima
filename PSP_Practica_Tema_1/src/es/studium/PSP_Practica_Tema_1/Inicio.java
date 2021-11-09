package es.studium.PSP_Practica_Tema_1;

public class Inicio
{

	public static void main(String[] args)
	{
		Vista vista = new Vista();
		Modelo modelo = new Modelo();
		
		new Controlador(vista, modelo);
	}

}
