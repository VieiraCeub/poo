package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCListagem {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/seu_banco_de_dados";
        String usuario = "seu_usuario";
        String senha = "sua_senha";

        try (Connection conexao = DriverManager.getConnection(url, usuario, senha)) {
            if (conexao != null) {
                System.out.println("Conexão bem-sucedida!");

                Statement statement = conexao.createStatement();

                String consultaSQL = "SELECT * FROM nome_da_tabela";
                ResultSet resultado = statement.executeQuery(consultaSQL);

                while (resultado.next()) {
                    // Aqui você pode acessar os campos da tabela pelo nome ou pelo índice
                    int id = resultado.getInt("id");
                    String nome = resultado.getString("nome");
                    double preco = resultado.getDouble("preco");

                    System.out.println("ID: " + id + ", Nome: " + nome + ", Preço: " + preco);
                }

                resultado.close();
                statement.close();
            } else {
                System.out.println("Falha na conexão.");
            }

        } catch (SQLException e) {
            System.out.println("Erro na conexão com o banco de dados: " + e.getMessage());
        }
    }
}
