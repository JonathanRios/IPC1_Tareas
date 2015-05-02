import javax.swing.*;
import sun.awt.IconInfo;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class G06ButtonsEjemplo extends JFrame{
	JButton button1;
	JButton button2;
	JButton button3;
	
	public G06ButtonsEjemplo(){
		super ("Juego Torre de Hanoi");
		setLayout(new GridBagLayout());
		button1 = new JButton("Reglas del juego");
		button1.setBackground(Color.CYAN);
		add(button1);
		button2 = new JButton("Tutorial del juego");
		button2.setBackground(Color.YELLOW);
		add(button2);
		button3 = new JButton("Jugar");
		button3.setBackground(Color.GREEN);
		add(button3);
		ButtonHandler handler = new ButtonHandler();
		button1.addActionListener(handler); button2.addActionListener(handler); button3.addActionListener(handler);	
	}
	private class ButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent event){
			if (event.getActionCommand().equals("Reglas del juego")){
				InstruccionesEjemplo();
			}
			else if (event.getActionCommand().equals("Tutorial del juego")){
				System.out.println("PENDIENTE");
			}
			else if (event.getActionCommand().equals("Jugar")){
				Ventana1Ejemplo();				
			}
		}
	}
	public void InstruccionesEjemplo(){
		InstruccionesEjemplo instruccionesEjemplo = new InstruccionesEjemplo();
		G06ButtonsEjemplo frame = new G06ButtonsEjemplo();
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(400,200);
		frame.repaint();
		//frame.setVisible(true);				
	}
	public void Ventana1Ejemplo(){
		Ventana1Ejemplo vn = new Ventana1Ejemplo();
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Ventana1Ejemplo().setVisible(true);
			}
		});
	}
	public static void main(String[] args) {
		G06ButtonsEjemplo frame = new G06ButtonsEjemplo();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,200);
		frame.repaint();
		frame.setVisible(true);
	}
}
