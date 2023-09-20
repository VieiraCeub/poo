package maven;
import com.google.gson.Gson;

public class ExemploGson {
    public static void main(String[] args) {
        // Criando um objeto Pessoa
        Pessoa pessoa = new Pessoa("João", 30);

        // Convertendo o objeto para JSON
        Gson gson = new Gson();
        String json = gson.toJson(pessoa);

        System.out.println("Objeto Pessoa em JSON:");
        System.out.println(json);

        // Convertendo JSON de volta para um objeto
        Pessoa pessoaDeserializada = gson.fromJson(json, Pessoa.class);

        System.out.println("\nObjeto deserializado:");
        System.out.println("Nome: " + pessoaDeserializada.getNome());
        System.out.println("Idade: " + pessoaDeserializada.getIdade());
    }
}