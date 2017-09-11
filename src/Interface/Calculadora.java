package Interface;

import java.awt.Container;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculadora extends JFrame{
		Metodos fun = new Metodos();
		double a, b;
		char z;
		
		
	//classe calculador a ganha as funções de JFrame(interface)
		JTextField txtVisor = new JTextField(); //declara visor
		JButton btnMK = new JButton("MKE");
		JButton btnMc = new JButton("MC"); //declara botão MC
		JButton btnMr = new JButton("MR");
		JButton btnMs = new JButton("MS");
		JButton btnMmai = new JButton("M+");
		JButton btnMmen = new JButton("M-");
		JButton btnSeta = new JButton("←");
		JButton btnCE = new JButton("CE");
		JButton btnC = new JButton("C");
		JButton btnMaMe = new JButton("±");
		JButton btnRaiz = new JButton("√");
		JButton btnSete = new JButton("7");
		JButton btnOito = new JButton("8");
		JButton btnNove = new JButton("9");
		JButton btnBarra = new JButton("/");
		JButton btnPto = new JButton("%");
		JButton btnQua = new JButton("4");
		JButton btnCin = new JButton("5");
		JButton btnSei = new JButton("6");
		JButton btnMult = new JButton("*");
		JButton btnX = new JButton("1/x");
		JButton btnUm = new JButton("1");
		JButton btnDois = new JButton("2");
		JButton btnTres = new JButton("3");
		JButton btnMenos = new JButton("-");
		JButton btnIgual = new JButton("=");
		JButton btnZero = new JButton("0");
		JButton btnVirg = new JButton(",");
		JButton btnMais = new JButton("+");
	
	public Calculadora(){ //construtor		
		super("Calculadora"); //super - responsável por identificar a janela		
		Container paine = this.getContentPane(); //atribui a variavel paine aos parametros de container
		
		paine.add(txtVisor); //acrescenta visor na janela
		txtVisor.setBounds(10,10,270,40); //parametros para posicionar o visor
		
		paine.add(btnMK);
		btnMK.setBounds(290,10,60,40);
		
		paine.add(btnMc);
		btnMc.setBounds(10,60,60,30);
		
		paine.add(btnMr);
		btnMr.setBounds(80,60,60,30);
		
		paine.add(btnMs);
		btnMs.setBounds(150,60,60,30);
		
		paine.add(btnMmai);
		btnMmai.setBounds(220,60,60,30);
		
		paine.add(btnMmen);
		btnMmen.setBounds(290,60,60,30);
		
		paine.add(btnSeta);
		btnSeta.setBounds(10,100,60,30);
		
		paine.add(btnCE);
		btnCE.setBounds(80,100,60,30);
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtVisor.setText("");
			}
		});
		
		paine.add(btnC);
		btnC.setBounds(150,100,60,30);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtVisor.setText("");
				a = 0;
				z = ' ';
			}
		});
		
		paine.add(btnMaMe);
		btnMaMe.setBounds(220,100,60,30);
		
		paine.add(btnRaiz);
		btnRaiz.setBounds(290,100,60,30);
		btnRaiz.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "√");
			}
		});
		
		paine.add(btnSete);
		btnSete.setBounds(10,140,60,30);
		btnSete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "7");
			}
		});
		
		paine.add(btnOito);
		btnOito.setBounds(80,140,60,30);
		btnOito.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "8");
			}
		});
		
		paine.add(btnNove);
		btnNove.setBounds(150,140,60,30);
		btnNove.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "9");
			}
		});
		
		paine.add(btnBarra);
		btnBarra.setBounds(220,140,60,30);
		btnBarra.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				a = Double.parseDouble(txtVisor.getText());
				z = '/';
				txtVisor.setText("");
			}
		});
		
		paine.add(btnPto);
		btnPto.setBounds(290,140,60,30);
		btnPto.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "%");
			}
		});
		
		paine.add(btnQua);
		btnQua.setBounds(10,180,60,30);
		btnQua.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "4");
			}
		});
		
		paine.add(btnCin);
		btnCin.setBounds(80,180,60,30);
		btnCin.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "5");
			}
		});
		
		paine.add(btnSei);
		btnSei.setBounds(150,180,60,30);
		btnSei.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "6");
			}
		});
		
		paine.add(btnMult);
		btnMult.setBounds(220,180,60,30);
		btnMult.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				a = Double.parseDouble(txtVisor.getText());
				z = '*';
				txtVisor.setText("");
			}
		});
		
		paine.add(btnX);
		btnX.setBounds(290,180,60,30);
		
		paine.add(btnUm);
		btnUm.setBounds(10,220,60,30);
		btnUm.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "1");
			}
		});
		
		paine.add(btnDois);
		btnDois.setBounds(80,220,60,30);
		btnDois.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "2");
			}
		});
		
		paine.add(btnTres);
		btnTres.setBounds(150,220,60,30);
		btnTres.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "3");
			}
		});
		
		paine.add(btnMenos);
		btnMenos.setBounds(220,220,60,30);
		btnMenos.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				a = Double.parseDouble(txtVisor.getText());
				z = '-';
				txtVisor.setText("");
			}
		});
		
		paine.add(btnIgual);
		btnIgual.setBounds(290,220,60,70);
		btnIgual.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if (z == '+'){
					txtVisor.setText(""+fun.soma(a, Double.parseDouble(txtVisor.getText())));
				}
				else if (z == '-'){
					txtVisor.setText(""+fun.subtra(a, Double.parseDouble(txtVisor.getText())));
				}
				else if (z == '*'){
					txtVisor.setText(""+fun.multi(a, Double.parseDouble(txtVisor.getText())));
				}
				else txtVisor.setText(""+fun.div(a, Double.parseDouble(txtVisor.getText())));
			}
		});
		
		paine.add(btnZero);
		btnZero.setBounds(10,260,130,30);
		btnZero.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "0");
			}
		});
		
		paine.add(btnVirg);
		btnVirg.setBounds(150,260,60,30);
		btnVirg.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + ",");
			}
		});
		
		paine.add(btnMais);
		btnMais.setBounds(220,260,60,30);
		btnMais.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				a = Double.parseDouble(txtVisor.getText());
				z = '+';
				txtVisor.setText("");
			}
		});
		
		paine.setLayout(null); //ele define o lugar dos objetos na tela
		//paine.setSize(200,400); //o tamanho da janela
		this.setSize(380,340);
		//paine.setVisible(true); //deixa a janela visivel
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
				
	}
	public static void main (String args[]){
		Calculadora calc = new Calculadora();
	}
}
