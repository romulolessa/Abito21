package face;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaInicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaInicial frame = new JanelaInicial();
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
	public JanelaInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Abito 21");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 36));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 416, 91);
		contentPane.add(lblNewLabel);
		
		JButton btnCadastraProduto = new JButton("Cadastro \r\nde\r\n produto");
		btnCadastraProduto.setFont(new Font("Arial", Font.PLAIN, 10));
		btnCadastraProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JanelaCadastraProduto cadProduto = new JanelaCadastraProduto();
				cadProduto.setVisible(true);
			}
		});
		btnCadastraProduto.setBounds(10, 140, 133, 52);
		contentPane.add(btnCadastraProduto);
		
		JButton btnCadastroDeCliente = new JButton("Cadastro \r\nde\r\n Cliente");
		btnCadastroDeCliente.setFont(new Font("Arial", Font.PLAIN, 10));
		btnCadastroDeCliente.setBounds(10, 203, 133, 52);
		contentPane.add(btnCadastroDeCliente);
		
		JButton btnEstoque = new JButton("Estoque");
		btnEstoque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEstoque.setFont(new Font("Arial", Font.PLAIN, 10));
		btnEstoque.setBounds(293, 140, 133, 52);
		contentPane.add(btnEstoque);
		
		JButton btnFaturamento_2 = new JButton("Faturamento");
		btnFaturamento_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFaturamento_2.setFont(new Font("Arial", Font.PLAIN, 10));
		btnFaturamento_2.setBounds(293, 203, 133, 52);
		contentPane.add(btnFaturamento_2);
	}
}
