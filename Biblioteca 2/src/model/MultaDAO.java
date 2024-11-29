package model;

import java.util.List;

public interface MultaDAO {

    public boolean cadastrarMulta(Multa multa);  // Método para cadastrar uma multa
    public boolean excluirMulta(int id);         // Método para excluir uma multa
    public List<Multa> listarMultas();          // Método para listar todas as multas
    public void calcularMultas();               // Método para calcular as multas
}
