package br.edu.fatecpg.tecprog.swing.view;
import br.edu.fatecpg.tecprog.swing.model.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_nome;
	private JLabel lbl_nome_resultado;
	private JLabel lbl_idade_resultado;
	private JLabel lbl_sexo_resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroForm frame = new CadastroForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Idade:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 73, 96, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 11, 96, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Sexo:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(10, 150, 96, 30);
		contentPane.add(lblNewLabel_2);
		
		txt_nome = new JTextField();
		txt_nome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt_nome.setBounds(10, 42, 96, 20);
		contentPane.add(txt_nome);
		txt_nome.setColumns(10);
		
		JSpinner spin_idade = new JSpinner();
		spin_idade.setFont(new Font("Tahoma", Font.PLAIN, 18));
		spin_idade.setBounds(10, 109, 59, 30);
		contentPane.add(spin_idade);
		
		JRadioButton radio_masc = new JRadioButton("Masculino");
		radio_masc.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radio_masc.setBounds(10, 175, 123, 42);
		contentPane.add(radio_masc);
		
		JRadioButton radio_fem = new JRadioButton("Feminino");
		radio_fem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radio_fem.setBounds(10, 220, 123, 36);
		contentPane.add(radio_fem);
		
		ButtonGroup grupo = new ButtonGroup();
			grupo.add(radio_masc);
			grupo.add(radio_fem);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txt_nome.getText();
				String idade = spin_idade.getValue().toString();
				String selecao = "";
			    if (radio_masc.isSelected()) {
			        selecao = "Masculino";
			    } 
			    else if (radio_fem.isSelected()) {
			        selecao = "Feminino";
			    }
				
			    Cliente cliente = new Cliente(nome, idade, selecao);
			    
			    lbl_nome_resultado.setText("Nome: " + cliente.getNome());
		        lbl_idade_resultado.setText("Idade: " + cliente.getIdade());
		        lbl_sexo_resultado.setText("Sexo: " + cliente.getSexo());
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(170, 102, 106, 42);
		contentPane.add(btnNewButton);
		
		JLabel lblResumo = new JLabel("--- Dados Cadastrados ---");
		lblResumo.setBounds(10, 272, 200, 20);
		contentPane.add(lblResumo);

		lbl_nome_resultado = new JLabel("Nome: -");
		lbl_nome_resultado.setBounds(10, 292, 200, 20);
		contentPane.add(lbl_nome_resultado);

		lbl_idade_resultado = new JLabel("Idade: -");
		lbl_idade_resultado.setBounds(10, 312, 200, 20);
		contentPane.add(lbl_idade_resultado);

		lbl_sexo_resultado = new JLabel("Sexo: -");
		lbl_sexo_resultado.setBounds(10, 332, 200, 20);
		contentPane.add(lbl_sexo_resultado);

	}
}
