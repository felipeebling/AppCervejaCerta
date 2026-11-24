import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField textField_1;
	private JButton btLogin;
	private JButton btCadastro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {

		createContents();
	}
	private void createContents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(new MigLayout("", "[grow]", "[][][][][][]"));
		
		this.lblNewLabel = new JLabel("Bem vindo !");
		this.contentPane.add(this.lblNewLabel, "cell 0 0");
		
		this.lblNewLabel_1 = new JLabel("Digite seu usuario: ");
		this.contentPane.add(this.lblNewLabel_1, "cell 0 1");
		
		this.textField = new JTextField();
		this.contentPane.add(this.textField, "cell 0 2,growx");
		this.textField.setColumns(10);
		
		this.lblNewLabel_2 = new JLabel("Digite sua senha:");
		this.contentPane.add(this.lblNewLabel_2, "cell 0 3");
		
		this.textField_1 = new JTextField();
		this.contentPane.add(this.textField_1, "cell 0 4,growx");
		this.textField_1.setColumns(10);
		
		this.btLogin = new JButton("Login");
		this.contentPane.add(this.btLogin, "flowx,cell 0 5");
		
		this.btCadastro = new JButton("Não tenho cadastro");
		this.btCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setContentPane(new TelaCadastro());
				setVisible(true);
				
			}
		});
		this.contentPane.add(this.btCadastro, "cell 0 5");
	}

}
