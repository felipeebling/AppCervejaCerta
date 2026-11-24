import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;

public class TelaGerenciamento extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public TelaGerenciamento() {
		setLayout(new MigLayout("", "[][grow][]", "[][][grow][][]"));
		
		JLabel lblNewLabel = new JLabel("Gerencie suas degustações");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		add(lblNewLabel, "cell 1 1,alignx center");

	}

}
