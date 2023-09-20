package persistencia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {
    public static void main(String[] args) {
        // Informações de conexão com o banco de dados
        String url = "jdbc:mysql://localhost:3306/seu_banco_de_dados";
        String usuario = "seu_usuario";
        String senha = "sua_senha";

        try {
            // Carrega o driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Estabelece a conexão com o banco de dados
            Connection conexao = DriverManager.getConnection(url, usuario, senha);

            if (conexao != null) {
                System.out.println("Conexão bem-sucedida!");
                
                // Aqui você pode executar consultas SQL ou outras operações com o banco de dados

                // Não se esqueça de fechar a conexão quando terminar
                conexao.close();
            } else {
                System.out.println("Falha na conexão.");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC não encontrado.");
        } catch (SQLException e) {
            System.out.println("Erro na conexão com o banco de dados: " + e.getMessage());
        }
    }
}