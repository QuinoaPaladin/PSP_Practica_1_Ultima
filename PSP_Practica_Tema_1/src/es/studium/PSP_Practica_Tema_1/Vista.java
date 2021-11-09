package es.studium.PSP_Practica_Tema_1;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.TextArea;
import java.awt.Choice;

import javax.swing.BoxLayout;

public class Vista extends Frame
{

	private static final long serialVersionUID = 1L;
	
	Frame ventana = new Frame ("Menú");
	
	Button btnBloc = new Button("Bloc de notas");
	Button btnPaint = new Button("Paint");
	Button btnReloj = new Button("Reloj");
	Label lblProcesos = new Label("Procesos activos:");
	Choice choProcesos = new Choice();
	Button btnTerminar = new Button("Terminar");
	
	//Choice choProcesos2 = new Choice();
	
	Label lblComando = new Label ("Línea de CMD");
	TextField txfComando = new TextField(800);
	Button btnComando = new Button("Ejecutar");
	TextArea txaComando = new TextArea("");
	
	public Vista()
	{
		ventana.setLayout(new BoxLayout(ventana, BoxLayout.Y_AXIS));    
		ventana.setTitle("Menú Principal");
		ventana.add(btnBloc);
		ventana.add(btnPaint);
		ventana.add(btnReloj);
		ventana.add(lblProcesos);
		ventana.add(choProcesos);
		//ventana.add(choProcesos2);
		ventana.add(btnTerminar);
		ventana.add(lblComando);
		ventana.add(txfComando);
		ventana.add(btnComando);
		ventana.add(txaComando);
		ventana.setResizable(false);
		ventana.setSize(800, 800); 
		ventana.setVisible(true);
	}
	
	
	
	
	
}
