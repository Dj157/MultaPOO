import java.sql.Connection;

import javax.swing.SwingUtilities;

import model.Conexao;
import view.TelaLogin;
import view.TelaMulta;

public class BibliotecaMain {

	public static String version = "1.2";

	public static void main(String[] args) {
		System.out.println("Iniciar Sistema.");

		Conexao.testConnection();
		Conexao.getConexao();
		Conexao.testConnection();

		SwingUtilities.invokeLater(() -> {
			TelaMulta multa = new TelaMulta();
			multa.setVisible(true);
		});
	}

}
