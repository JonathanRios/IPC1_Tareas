package images;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.*;
public class PnlFondo extends javax.swing.JPanel{
	public PnlFondo(){
		getComponents();
		this.setSize(100,100);
		Icon imgBoton = new ImageIcon (getClass().getResource(""));
		this.btnIngresar.setIcon(imgBoton);	
	}
	private void initComponents(Graphics g) {

		Dimension tamanio = getSize();
		ImageIcon imagenFondo = new ImageIcon(getClass().getResource(""));
		g.drawImage(imagenFondo.getImage(), 0, 0,tamanio.width, tamanio.height, null);
		setOpaque(false);
		
		super.paintComponents(g);
	}

}
