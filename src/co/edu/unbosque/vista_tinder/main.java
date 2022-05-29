package co.edu.unbosque.vista_tinder;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import co.edu.unbosque.controlador_tinder.pantalla;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pantalla p1 = new pantalla();
		JPanel panel1 = new JPanel();
	
		int prb = 0;
		p1.setVisible(true);
		
		p1.setTitle("Tinder");
		
		JLabel texto1 = new JLabel("•°o.O(..TINDER..)O.o°• ");
		texto1.setBounds(120, -50, 250, 250);
		p1.add(texto1);
		
		JButton boton1 = new JButton("INICIAR SECION");
		boton1.setBounds(120, 200, 120, 40);
		p1.add(boton1);
		
		JButton boton2 = new JButton("REGISTRARTE");
		boton2.setBounds(120, 400, 120, 40);
		p1.add(boton2);
		
		p1.getContentPane().setBackground(Color.RED);
	
		JLabel welcomeLbl = new JLabel("");
		welcomeLbl.setBounds(120, 200, 120, 40);
		p1.add(welcomeLbl);
		
		
		boton1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			 if(prb == 0){
				
				pantalla p2 = new pantalla();
				p2.setVisible(true);
				p2.setSize(360, 500);
			    p2.setLayout(null);
				p2.setVisible(true);
				
				p2.getContentPane().setBackground(Color.RED);
				JLabel texto2 = new JLabel("INICIAR SECION");
				texto2.setBounds(120, -100, 250, 250);
				p2.add(texto2);
				
				JLabel texto3 = new JLabel("CORREO ELECTRONICO");
				texto3.setBounds(120, -20, 250, 250);
				p2.add(texto3);
				
				JTextField esp = new JTextField();
				esp.setBounds(120, 120, 120, 40); 
				p2.add(esp);
				
				JLabel texto4 = new JLabel("CONTRASEÑA");
				texto4.setBounds(120, 100, 250, 250);
				p2.add(texto4);
				
				JTextField esp2 = new JTextField();
				esp2.setBounds(120, 250, 120, 40);
				p2.add(esp2);
				
				
			 }}
		});
		
		boton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			 if(prb == 0){
				
				pantalla p3 = new pantalla();
				p3.setVisible(true);
				p3.setSize(360, 500);
			    p3.setLayout(null);
				p3.setVisible(true);
				
				p3.getContentPane().setBackground(Color.RED);
				JLabel texto2 = new JLabel("REGISTRARSE");
				texto2.setBounds(140, -100, 250, 250);
				p3.add(texto2);
				
				JLabel texto3 = new JLabel(" PON UN CORREO ELECTRONICO");
				texto3.setBounds(85, -20, 250, 250);
				p3.add(texto3);
				
				JTextField esp = new JTextField();
				esp.setBounds(85, 120, 200, 40); 
				p3.add(esp);
				
				JLabel texto4 = new JLabel(" CREA UNA CONTRASEÑA");
				texto4.setBounds(100, 50, 250, 250);
				p3.add(texto4);
				
				JTextField esp2 = new JTextField();
				esp2.setBounds(120, 190, 120, 40);
				p3.add(esp2);
				
				JLabel texto5 = new JLabel(" NOMBRE");
				texto5.setBounds(120, 120, 250, 250);
				p3.add(texto5);
				
				JTextField esp3 = new JTextField();
				esp3.setBounds(120, 255, 120, 40);
				p3.add(esp3);
				
				JLabel texto6 = new JLabel(" EDAD");
				texto6.setBounds(120, 185, 250, 250);
				p3.add(texto6);
				
				JTextField esp4 = new JTextField();
				esp4.setBounds(120, 320, 120, 40);
				p3.add(esp4);
				
				JButton botonH = new JButton("HOMBRE");
				botonH.setBounds(50, 400, 120, 40);
				p3.add(botonH);
				
				JButton botonM = new JButton("MUJER");
				botonM.setBounds(180, 400, 120, 40);
				p3.add(botonM);
				
				botonH.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
					 if(prb == 0){
						 
						 pantalla pH = new pantalla();
							pH.setVisible(true);
							pH.setSize(360, 500);
						    pH.setLayout(null);
							pH.setVisible(true);
							
							pH.getContentPane().setBackground(Color.BLUE);
							
						 JLabel textop = new JLabel("PERFIL...");
							textop.setBounds(140, -100, 250, 250);
							pH.add(textop);
							
							JLabel imagen = new JLabel(new ImageIcon("200x200.JPEG"));
							imagen.setBounds(50, 50, 200, 200);
							pH.add(imagen);
							
						 }}
				});
				
				botonM.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
					 if(prb == 0){
						 
						 pantalla pM = new pantalla();
							pM.setVisible(true);
							pM.setSize(360, 500);
						    pM.setLayout(null);
							pM.setVisible(true);
							pM.getContentPane().setBackground(Color.PINK);
							
						
						 JLabel textop2 = new JLabel("REGISTRARSE");
							textop2.setBounds(140, -100, 250, 250);
							pM.add(textop2);
						 }}
				});
				
			
			 
			 }}
		});
		
		p1.setSize(360, 500);
		p1.setLayout(null);
		p1.setVisible(true);
	
	
	
	
	}

}

