import javax.swing.*;
import sun.awt.IconInfo;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class InstruccionesEjemplo extends JFrame{
	public JButton buttonx;
	static int ancho= 750;
	static int alto= 200;
	public InstruccionesEjemplo (){
		super ("Instrucciones");

		buttonx = new JButton();
		buttonx.setBackground(Color.CYAN);
		add(buttonx);	

		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout (panel, BoxLayout.Y_AXIS));
		panel.add(new JLabel("1.Solo se puede mover un disco a la vez."));
		panel.add(new JLabel("2.El juego tendrá solamente 3 estacas (torres)."));
		panel.add(new JLabel("3.No se permite colocar un disco más grande sobre otro de menor tamaño."));
		panel.add(new JLabel("4.Solamente se puede mover el disco que esta hasta arriba de cada la torre."));
		panel.add(new JLabel("5.El juego se gana cuando se forma la torre de discos que inicialmente se tiene en la torre 1, en cualquiera de las otras 2 torres."));

		panel.add(buttonx);

		add (panel);
		setSize(ancho,alto);
		panel.setBackground(Color.cyan);
		setVisible(true);	
	}	
	public static void main(String[] args) {
		InstruccionesEjemplo frame = new InstruccionesEjemplo();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,200);
		frame.repaint();
		frame.setVisible(true);
	}

}