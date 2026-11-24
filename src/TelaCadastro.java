import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaCadastro extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel;
	private JTextField txtNome;
	private JLabel lblNewLabel_1;
	private JTextField txtEmail;
	private JLabel lblNewLabel_2;
	private JTextField txtSenha;
	private JButton btCadastrarUsuario;

	/**
	 * Create the panel.
	 */
	public TelaCadastro() {

		createContents();
	}
	private void createContents() {
		setLayout(new MigLayout("", "[grow]", "[][][][][][][]"));
		
		this.lblNewLabel = new JLabel("Digite seu nome:");
		add(this.lblNewLabel, "cell 0 0");
		
		this.txtNome = new JTextField();
		add(this.txtNome, "cell 0 1,growx");
		this.txtNome.setColumns(10);
		
		this.lblNewLabel_2 = new JLabel("Digite seu email:");
		add(this.lblNewLabel_2, "cell 0 2");
		
		this.txtEmail = new JTextField();
		add(this.txtEmail, "cell 0 3,growx");
		this.txtEmail.setColumns(10);
		
		this.lblNewLabel_1 = new JLabel("Digite sua senha:");
		add(this.lblNewLabel_1, "cell 0 4");
		
		this.txtSenha = new JTextField();
		add(this.txtSenha, "cell 0 5,growx");
		this.txtSenha.setColumns(10);
		
		this.btCadastrarUsuario = new JButton("Cadastrar");
		add(this.btCadastrarUsuario, "cell 0 6");
	}
	

}
