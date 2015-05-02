import javax.swing.ImageIcon;
import javax.swing.Timer;

import java.lang.*;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Ventana1Ejemplo extends javax.swing.JFrame{
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JMenuItem jMenuItem2;
	private javax.swing.JMenuItem jMenuItem3;
	private javax.swing.JMenuItem jMenuItem4;
	private javax.swing.JMenuItem jMenuItem5;
	private javax.swing.JMenuItem jMenuItem6;
	private javax.swing.JMenuItem jMenuItem7;
	private javax.swing.JMenuItem jMenuItem8;

	int i = 1;
	int posicionTorre1;
	int posicionTorre2;
	int posicionTorre3;
	int matrizTores[][] = new int[11][11];
	int j = 3;
	int escalones = 9;
	int vertical = 90;
	double pixelVertical;
	double pixelHorizontal;

	public Ventana1Ejemplo(){
		pixelHorizontal = 800;
		pixelVertical = 600;
		posicionTorre1 = 30;
		posicionTorre2 = 280;
		posicionTorre3 = 530;
		initComponents();
		this.setSize((int) pixelHorizontal, (int) pixelVertical);
		mostrarBbases();
		cargarMatrizTorres();
		mostrarTorre();
	}

	public void mostrarBbases(){ 
		jButton1.setBounds(30, 360, 220, 60); 
		jButton2.setBounds(280, 360, 220, 60);
		jButton3.setBounds(530, 360, 220, 60);
	}
	public void cargarMatrizTorres() {
		for (i = 1; i <= escalones; i++) {
			for (j = 1; j <= 3; j++) {
				matrizTores[i][j] = 0;
				matrizTores[i][1] = i;
			}
		}
		mostrarMatrizTorres();
	}
	public void mostrarMatrizTorres() {
		System.out.println("------------------------------");
		for (i = 1; i <= escalones; i++) {

			System.out.println("matrizTores[i][j]= " + matrizTores[i][1] + " / " + matrizTores[i][2] + " / " + matrizTores[i][3]);
		}

	}
	public void mostrarTorre() {

		for ( i = 1; i <= escalones; i++) {  

			if (i == 1) {
				jLabel1.setBounds(posicionTorre1, vertical + 0, 220, 30);
			}
			if (i == 2) {
				jLabel2.setBounds(posicionTorre1, vertical + 30, 220, 30);
			}
			if (i == 3) {
				jLabel3.setBounds(posicionTorre1, vertical + 60, 220, 30);
			}
			if (i == 4) {
				jLabel4.setBounds(posicionTorre1, vertical + 90, 220, 30);
			}
			if (i == 5) {
				jLabel5.setBounds(posicionTorre1, vertical + 120, 220, 30);
			}
			if (i == 6) {
				jLabel6.setBounds(posicionTorre1, vertical + 150, 220, 30);
			}
			if (i == 7) {
				jLabel7.setBounds(posicionTorre1, vertical + 180, 220, 30);
			}
			if (i == 8) {
				jLabel8.setBounds(posicionTorre1, vertical + 210, 220, 30);
			}
			if (i == 9) {
				jLabel9.setBounds(posicionTorre1, vertical + 240, 225, 30);
			}
		}
	}
	private void initComponents() {
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jMenu2 = new javax.swing.JMenu();
		jMenuItem1 = new javax.swing.JMenuItem();
		jMenuItem2 = new javax.swing.JMenuItem();
		jMenuItem3 = new javax.swing.JMenuItem();
		jMenuItem4 = new javax.swing.JMenuItem();
		jMenuItem5 = new javax.swing.JMenuItem();
		jMenuItem6 = new javax.swing.JMenuItem();
		jMenuItem7 = new javax.swing.JMenuItem();
		jMenuItem8 = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		jButton1.setText("TORRE 1");
		getContentPane().add(jButton1);
		jButton1.setBounds(10, 310, 73, 23);

		jButton2.setText("TORRE 2");
		getContentPane().add(jButton2);
		jButton2.setBounds(10, 340, 73, 23);

		jButton3.setText("TORRE 3");
		getContentPane().add(jButton3);
		jButton3.setBounds(10, 370, 73, 23);
		//MODIFICACIONES
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setIcon(new javax.swing.ImageIcon("C://Users//Administrador//Desktop//Torre De Hanoi//imagenes//escalon1a.gif"));
		getContentPane().add(jLabel1);
		jLabel1.setBounds(0, 10, 50, 40);

		jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel2.setIcon(new javax.swing.ImageIcon("C://Users//Administrador//Desktop//Torre De Hanoi//imagenes//escalon2a.gif"));
		getContentPane().add(jLabel2);
		jLabel2.setBounds(0, 50, 60, 30);

		jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel3.setIcon(new javax.swing.ImageIcon("C://Users//Administrador//Desktop//Torre De Hanoi//imagenes//escalon3a.gif"));
		getContentPane().add(jLabel3);
		jLabel3.setBounds(0, 80, 100, 30);

		jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel4.setIcon(new javax.swing.ImageIcon("C://Users//Administrador//Desktop//Torre De Hanoi//imagenes//escalon4a.gif"));
		getContentPane().add(jLabel4);
		jLabel4.setBounds(10, 100, 110, 40);

		jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel5.setIcon(new javax.swing.ImageIcon("C://Users//Administrador//Desktop//Torre De Hanoi//imagenes//escalon5c.gif"));
		getContentPane().add(jLabel5);
		jLabel5.setBounds(10, 140, 130, 30);

		jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel6.setIcon(new javax.swing.ImageIcon("C://Users//Administrador//Desktop//Torre De Hanoi//imagenes//escalon6f.gif"));
		getContentPane().add(jLabel6);
		jLabel6.setBounds(10, 170, 160, 40);

		jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel7.setIcon(new javax.swing.ImageIcon("C://Users//Administrador//Desktop//Torre De Hanoi//imagenes//escalon7.gif"));
		getContentPane().add(jLabel7);
		jLabel7.setBounds(10, 210, 174, 30);

		jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel8.setIcon(new javax.swing.ImageIcon("C://Users//Administrador//Desktop//Torre De Hanoi//imagenes//escalon8d.gif"));
		getContentPane().add(jLabel8);
		jLabel8.setBounds(10, 240, 190, 30);

		//MODIFICACIONES
		jLabel9.setBackground(new java.awt.Color(204, 204, 204));
		jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); 
		jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel9.setIcon(new javax.swing.ImageIcon("C://Users//Administrador//Desktop//Torre De Hanoi//imagenes//escalon9c.gif"));
		jLabel9.setOpaque(true);
		getContentPane().add(jLabel9);
		jLabel9.setBounds(10, 270, 230, 32);

		jMenu1.setText("Opciones");//MODIFICAR
		jMenuBar1.add(jMenu1);

		jMenu2.setText("Escalones");

		jMenuItem1.setText("2 Escalones");
		jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem1ActionPerformed(evt);
			}
		});
		jMenu2.add(jMenuItem1);

		jMenuItem2.setText("3 Escalones");
		jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem2ActionPerformed(evt);
			}
		});
		jMenu2.add(jMenuItem2);

		jMenuItem3.setText("4 Escalones");
		jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem3ActionPerformed(evt);
			}
		});
		jMenu2.add(jMenuItem3);

		jMenuItem4.setText("5 Escalones");
		jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem4ActionPerformed(evt);
			}
		});
		jMenu2.add(jMenuItem4);

		jMenuItem5.setText("6 Escalones");
		jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem5ActionPerformed(evt);
			}
		});
		jMenu2.add(jMenuItem5);

		jMenuItem6.setText("7 Escalones");
		jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem6ActionPerformed(evt);
			}
		});
		jMenu2.add(jMenuItem6);

		jMenuItem7.setText("8 Escalones");
		jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem7ActionPerformed(evt);
			}
		});
		jMenu2.add(jMenuItem7);

		jMenuItem8.setText("9 Escalones");
		jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem8ActionPerformed(evt);
			}
		});
		jMenu2.add(jMenuItem8);

		jMenuBar1.add(jMenu2);

		setJMenuBar(jMenuBar1);

		pack();	
	}
	private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
		vertical = 300;
		jLabel1.setVisible(true);
		jLabel2.setVisible(true);
		jLabel3.setVisible(false);
		jLabel4.setVisible(false);
		jLabel5.setVisible(false);
		jLabel6.setVisible(false);
		jLabel7.setVisible(false);
		jLabel8.setVisible(false);
		jLabel9.setVisible(false);
		escalones = 2;
		mostrarTorre();
		cargarMatrizTorres();
	}
	private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
		vertical = 270;
		jLabel1.setVisible(true);
		jLabel2.setVisible(true);
		jLabel3.setVisible(true);
		jLabel4.setVisible(false);
		jLabel5.setVisible(false);
		jLabel6.setVisible(false);
		jLabel7.setVisible(false);
		jLabel8.setVisible(false);
		jLabel9.setVisible(false);
		escalones = 3;
		mostrarTorre();
		cargarMatrizTorres();
	}
	private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {
		vertical = 240;
		jLabel1.setVisible(true);
		jLabel2.setVisible(true);
		jLabel3.setVisible(true);
		jLabel4.setVisible(true);
		jLabel5.setVisible(false);
		jLabel6.setVisible(false);
		jLabel7.setVisible(false);
		jLabel8.setVisible(false);
		jLabel9.setVisible(false);
		escalones = 4;
		mostrarTorre();
		cargarMatrizTorres();
	}
	private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {
		vertical = 210;
		escalones = 5;
		jLabel1.setVisible(true);
		jLabel2.setVisible(true);
		jLabel3.setVisible(true);
		jLabel4.setVisible(true);
		jLabel5.setVisible(true);
		jLabel6.setVisible(false);
		jLabel7.setVisible(false);
		jLabel8.setVisible(false);
		jLabel9.setVisible(false);
		mostrarTorre();
		cargarMatrizTorres();
	}
	private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {
		vertical = 180;
		jLabel1.setVisible(true);
		jLabel2.setVisible(true);
		jLabel3.setVisible(true);
		jLabel4.setVisible(true);
		jLabel5.setVisible(true);
		jLabel6.setVisible(true);
		jLabel7.setVisible(false);
		jLabel8.setVisible(false);
		jLabel9.setVisible(false);
		escalones = 6;
		mostrarTorre();
		cargarMatrizTorres();
	}
	private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {
		vertical = 150;
		jLabel1.setVisible(true);
		jLabel2.setVisible(true);
		jLabel3.setVisible(true);
		jLabel4.setVisible(true);
		jLabel5.setVisible(true);
		jLabel6.setVisible(true);
		jLabel7.setVisible(true);
		jLabel8.setVisible(false);
		jLabel9.setVisible(false);
		escalones = 7;
		mostrarTorre();
		cargarMatrizTorres();
	}
	private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {
		vertical = 120;
		jLabel1.setVisible(true);
		jLabel2.setVisible(true);
		jLabel3.setVisible(true);
		jLabel4.setVisible(true);
		jLabel5.setVisible(true);
		jLabel6.setVisible(true);
		jLabel7.setVisible(true);
		jLabel8.setVisible(true);
		jLabel9.setVisible(false);
		escalones = 8;
		mostrarTorre();
		cargarMatrizTorres();
	}
	private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt){
		vertical = 90;
		jLabel1.setVisible(true);
		jLabel4.setVisible(true);
		jLabel3.setVisible(true);
		jLabel4.setVisible(true);
		jLabel5.setVisible(true);
		jLabel6.setVisible(true);
		jLabel7.setVisible(true);
		jLabel8.setVisible(true);
		jLabel9.setVisible(true);
		escalones = 9;
		mostrarTorre();
		cargarMatrizTorres();
	}
	public static void main (String [] args){
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Ventana1Ejemplo().setVisible(true);
			}
		});
	}
}