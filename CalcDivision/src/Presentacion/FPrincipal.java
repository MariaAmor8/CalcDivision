package Presentacion;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import logica.Calculator;
import logica.MiExcepcion;

public class FPrincipal extends JFrame{
	JTextField txtNumerador;
	JTextField txtDenominador;
	Calculator calculadora;
	JLabel lblResultado;
	
	public void ejecutar() {
		this.calculadora = new Calculator();
		this.setPreferredSize(new Dimension(350,200));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setLayout(new GridLayout(3,2));
		
		this.add(new JLabel("numerador"));
		this.txtNumerador = new JTextField();
		this.add(this.txtNumerador);
		
		this.add(new JLabel("denominador"));
		this.txtDenominador = new JTextField();
		this.add(txtDenominador);
		
		JButton bEnviar = new JButton("calcular division");
		this.add(bEnviar);
		bEnviar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				calcularDiv();
			}
			
		});
		
		this.lblResultado = new JLabel("?",SwingConstants.CENTER);
		this.add(this.lblResultado);
		
		this.pack();
	}

	protected void calcularDiv() {
		try {
		double numerador = Double.parseDouble(this.txtNumerador.getText());
		double denominador = Double.parseDouble(this.txtDenominador.getText());
		double result = this.calculadora.calcular(numerador, denominador);
		this.lblResultado.setText(""+result);
		}
		catch(NumberFormatException e){
			JOptionPane.showMessageDialog(this, "Sólo puede ingresar numeros", "Error", JOptionPane.WARNING_MESSAGE);
		}
		catch(MiExcepcion e1) {
			JOptionPane.showMessageDialog(this, e1.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
		}
		
		
	}

	public static void main(String[] args) {
		FPrincipal principal = new FPrincipal();
		principal.ejecutar();
	}

}
