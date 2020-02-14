package face;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JSlider;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaCadastraProduto extends JFrame {

	private JPanel contentPane;
	private JTextField textCodigo;
	private JTextField textNome;
	private JTextField textCompra;
	private JTextField textVenda;
	private JTextField textDataCompra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCadastraProduto frame = new JanelaCadastraProduto();
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
	public JanelaCadastraProduto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDeProduto = new JLabel("Cadastro de Produto");
		lblCadastroDeProduto.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroDeProduto.setForeground(Color.BLACK);
		lblCadastroDeProduto.setFont(new Font("Arial Black", Font.BOLD, 34));
		lblCadastroDeProduto.setBounds(10, 11, 414, 91);
		contentPane.add(lblCadastroDeProduto);
		
		JLabel lblNewLabel = new JLabel("Codigo:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(47, 113, 115, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setBounds(47, 138, 115, 14);
		contentPane.add(lblNome);
		
		JLabel lblPreoDeCompra = new JLabel("pre\u00E7o de compra:");
		lblPreoDeCompra.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPreoDeCompra.setBounds(27, 163, 135, 14);
		contentPane.add(lblPreoDeCompra);
		
		JLabel lblPreoDeVenda = new JLabel("pre\u00E7o de venda:");
		lblPreoDeVenda.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPreoDeVenda.setBounds(27, 213, 135, 14);
		contentPane.add(lblPreoDeVenda);
		
		JLabel lblDataDeCompra = new JLabel("data de compra:");
		lblDataDeCompra.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDataDeCompra.setBounds(27, 188, 135, 14);
		contentPane.add(lblDataDeCompra);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
			}
		});
		btnNewButton.setBounds(172, 239, 101, 23);
		contentPane.add(btnNewButton);
		
		textCodigo = new JTextField();
		textCodigo.setBounds(172, 113, 177, 20);
		contentPane.add(textCodigo);
		textCodigo.setColumns(10);
		
		textNome = new JTextField();
		textNome.setColumns(10);
		textNome.setBounds(172, 135, 177, 20);
		contentPane.add(textNome);
		
		textCompra = new JTextField();
		textCompra.setColumns(10);
		textCompra.setBounds(172, 160, 101, 20);
		contentPane.add(textCompra);
		
		textVenda = new JTextField();
		textVenda.setColumns(10);
		textVenda.setBounds(172, 210, 101, 20);
		contentPane.add(textVenda);
		
		textDataCompra = new JTextField();
		textDataCompra.setBounds(172, 185, 101, 20);
		contentPane.add(textDataCompra);
		textDataCompra.setColumns(10);
	}
}
