import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gui extends JFrame implements ActionListener{
	private ArrayList<JButton> botones;
	private JPanel Panel1, Panel2;
	private JLabel Text;
	private JTextField CajaTexto;
	private ActionListener Action;
	
	public Gui() {
		super("ejemplo de interfaz");
		Accion();
		CrearBotones();
//		CrearText();
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void CrearBotones() {
		setLayout(new BorderLayout());
		Panel1 = new JPanel();
		Panel1.setLayout(new GridLayout(5, 5));
		botones = new ArrayList<JButton>();
		for(int i = 0; i < 10; i++) {
			botones.add(i, new JButton("boton " + (1+i)));
			Panel1.add(botones.get(i));
			
			if(i<5) {
				botones.get(i).addActionListener(Action);
			}
			else {
				botones.get(i).addActionListener(this);
			}
		}
		add(Panel1);
	}
	
	public void Accion() {
		Action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String opcion = (String)e.getActionCommand();
				if(opcion.equals("boton 1")) {
					botones.get(0).setText("Se oprimio");
				}
			}	
		};	
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
