package SistemaAcademico.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JToggleButton;

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_2;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() throws Exception {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 677, 380);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Aluno");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Salvar");
		mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Alterar");
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Consultar");
		mntmNewMenuItem_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Excluir");
		mntmNewMenuItem_3.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Sair");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mntmNewMenuItem_4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.ALT_DOWN_MASK | InputEvent.SHIFT_DOWN_MASK));
		mntmNewMenuItem_4.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_1 = new JMenu("Notas e Faltas");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Salvar");
		mnNewMenu_1.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Alterar");
		mntmNewMenuItem_6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_DOWN_MASK));
		mnNewMenu_1.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Consultar");
		mnNewMenu_1.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Excluir");
		mnNewMenu_1.add(mntmNewMenuItem_8);
		
		JMenu mnNewMenu_2 = new JMenu("Ajuda");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Sobre");
		mntmNewMenuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//BOTAO AJUDA
				JOptionPane.showMessageDialog(null, "Informações do Menu");
				
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_9);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 10, 639, 304);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Dados Pessoais", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("RGM");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		lblNewLabel.setBounds(28, 23, 37, 29);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(62, 26, 138, 24);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		lblNome.setBounds(251, 23, 37, 29);
		panel.add(lblNome);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento");
		lblDataDeNascimento.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		lblDataDeNascimento.setBounds(28, 82, 125, 29);
		panel.add(lblDataDeNascimento);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		lblCpf.setBounds(290, 82, 28, 29);
		panel.add(lblCpf);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		lblEmail.setBounds(28, 140, 37, 29);
		panel.add(lblEmail);
		
		JLabel lblEndereo = new JLabel("Endereço");
		lblEndereo.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		lblEndereo.setBounds(28, 177, 53, 29);
		panel.add(lblEndereo);
		
		JLabel lblMunicpio = new JLabel("Município");
		lblMunicpio.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		lblMunicpio.setBounds(28, 227, 63, 29);
		panel.add(lblMunicpio);
		
		JLabel lblComplemento = new JLabel("complemento");
		lblComplemento.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		lblComplemento.setBounds(398, 177, 82, 29);
		panel.add(lblComplemento);
		
		JLabel lblUf = new JLabel("UF");
		lblUf.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		lblUf.setBounds(262, 227, 28, 29);
		panel.add(lblUf);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES ", "GO", "MA", "MT", "MS", "MG ", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR,", " SC", "SP", "SE", "", "TO"}));
		comboBox.setBounds(282, 231, 43, 20);
		panel.add(comboBox);
		
		JLabel txtCelular = new JLabel("Celular");
		txtCelular.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		txtCelular.setBounds(376, 138, 63, 29);
		panel.add(txtCelular);
		
		textField_1 = new JTextField();
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_1.setColumns(10);
		textField_1.setBounds(290, 26, 286, 24);
		panel.add(textField_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(69, 143, 279, 24);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(83, 182, 286, 24);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(97, 230, 103, 24);
		panel.add(textField_6);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(476, 182, 103, 24);
		panel.add(textField_8);
		
		JFormattedTextField txtData = new JFormattedTextField(new MaskFormatter("##/##/####"));
		txtData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtData.setBounds(153, 85, 109, 24);
		panel.add(txtData);
		
		JFormattedTextField formattedTextField = new JFormattedTextField(new MaskFormatter("###-###-###-##"));
		formattedTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		formattedTextField.setBounds(328, 85, 154, 24);
		panel.add(formattedTextField);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField(new MaskFormatter("(##) ##### ####"));
		formattedTextField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		formattedTextField_1.setBounds(422, 140, 154, 24);
		panel.add(formattedTextField_1);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Curso", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Curso");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(24, 37, 44, 12);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Campus");
		lblNewLabel_1_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(24, 81, 78, 12);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Período");
		lblNewLabel_1_1_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(24, 121, 78, 12);
		panel_1.add(lblNewLabel_1_1_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(new Color(255, 255, 255));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "Análise e Desenvolvimento de Sistemas (ADS)", "Ciência da Computação", "Engenharia de Software", "Sistemas de Informação"}));
		comboBox_1.setBounds(74, 30, 356, 27);
		panel_1.add(comboBox_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBackground(new Color(255, 255, 255));
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"", "Tatuapé", "Villa-Lobos", "São Miguel", "Liberdade", "Itaquera", "Guaianazes"}));
		comboBox_1_1.setBounds(74, 70, 356, 27);
		panel_1.add(comboBox_1_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Matutino");
		chckbxNewCheckBox.setBounds(88, 117, 92, 20);
		panel_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxVespertino = new JCheckBox("Vespertino");
		chckbxVespertino.setBounds(195, 117, 92, 20);
		panel_1.add(chckbxVespertino);
		
		JCheckBox chckbxNoturno = new JCheckBox("Noturno");
		chckbxNoturno.setBounds(310, 117, 92, 20);
		panel_1.add(chckbxNoturno);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Notas e Faltas", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("RGM");
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(20, 22, 37, 29);
		panel_2.add(lblNewLabel_2);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(57, 25, 146, 24);
		panel_2.add(textField_9);
		
		JLabel lblNewLabel_2_1 = new JLabel("Disciplina");
		lblNewLabel_2_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(20, 112, 62, 29);
		panel_2.add(lblNewLabel_2_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBackground(new Color(255, 255, 255));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"", "Lógica de Programação", "Programação Orientada a Objetos (POO)", "Estrutura de Dados", "Engenharia de Software", "Redes de Computadores", "Programação Web"}));
		comboBox_2.setBounds(80, 114, 363, 24);
		panel_2.add(comboBox_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Semestre");
		lblNewLabel_2_1_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		lblNewLabel_2_1_1.setBounds(20, 172, 62, 29);
		panel_2.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Nota");
		lblNewLabel_2_1_2.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		lblNewLabel_2_1_2.setBounds(207, 172, 29, 29);
		panel_2.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Faltas");
		lblNewLabel_2_1_3.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		lblNewLabel_2_1_3.setBounds(346, 172, 37, 29);
		panel_2.add(lblNewLabel_2_1_3);
		
		JComboBox comboBox_2_1 = new JComboBox();
		comboBox_2_1.setBackground(new Color(255, 255, 255));
		comboBox_2_1.setModel(new DefaultComboBoxModel(new String[] {"", "2023-1", "2023-2", "2024-1", "2024-2", "2025-1", "2025-2", "2026-1"}));
		comboBox_2_1.setBounds(80, 176, 93, 24);
		panel_2.add(comboBox_2_1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setEnabled(false);
		textArea_1.setEditable(false);
		textArea_1.setBounds(262, 24, 358, 27);
		panel_2.add(textArea_1);
		
		JTextArea textArea_1_1 = new JTextArea();
		textArea_1_1.setEnabled(false);
		textArea_1_1.setEditable(false);
		textArea_1_1.setBounds(57, 75, 374, 27);
		panel_2.add(textArea_1_1);
		
		JTextArea textArea_1_2 = new JTextArea();
		textArea_1_2.setEnabled(false);
		textArea_1_2.setEditable(false);
		textArea_1_2.setBounds(496, 75, 124, 27);
		panel_2.add(textArea_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Nome");
		lblNewLabel_2_2.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		lblNewLabel_2_2.setBounds(221, 22, 37, 29);
		panel_2.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Curso");
		lblNewLabel_2_3.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		lblNewLabel_2_3.setBounds(20, 73, 37, 29);
		panel_2.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Período");
		lblNewLabel_2_4.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		lblNewLabel_2_4.setBounds(446, 73, 51, 29);
		panel_2.add(lblNewLabel_2_4);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(246, 175, 68, 24);
		panel_2.add(textField_2);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(386, 175, 68, 24);
		panel_2.add(textField_10);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Salvar");
		tglbtnNewToggleButton.setBackground(new Color(0, 128, 64));
		tglbtnNewToggleButton.setForeground(new Color(0, 0, 0));
		tglbtnNewToggleButton.setBounds(30, 211, 93, 56);
		panel_2.add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnAtualizar = new JToggleButton("Atualizar");
		tglbtnAtualizar.setBounds(143, 211, 93, 56);
		panel_2.add(tglbtnAtualizar);
		
		JToggleButton tglbtnNewToggleButton_2 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_2.setBounds(256, 209, 93, 56);
		panel_2.add(tglbtnNewToggleButton_2);
		
		JToggleButton tglbtnNewToggleButton_3 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_3.setBounds(371, 211, 93, 56);
		panel_2.add(tglbtnNewToggleButton_3);
		
		JToggleButton tglbtnSair = new JToggleButton("Sair");
		tglbtnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					System.exit(0);
				
			}
		});
		tglbtnSair.setBackground(new Color(128, 0, 0));
		tglbtnSair.setBounds(527, 211, 93, 56);
		panel_2.add(tglbtnSair);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Boletim", null, panel_3, null);
		panel_3.setLayout(null);

	}
}
