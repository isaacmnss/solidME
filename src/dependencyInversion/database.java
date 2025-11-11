package dependencyInversion;

interface Database {
    void salvarNoBanco(String data);
}

class MySQLDatabase implements Database {
    public void salvarNoBanco(String dados) {
        System.out.println("Salvando no MySQL: " + dados);
    }
}
class PostgreSQLDatabase implements Database {
    public void salvarNoBanco(String dados) {
        System.out.println("Salvando no PostgreSQL: " + dados);
    }
}

class UsuarioService {
    private Database database;

    public UsuarioService(Database database) {
        this.database = database;
    }

    public void registrarUsuario(String nome) {
        database.salvarNoBanco(nome);
    }
}
