package dependencyInversion;

public class Main {
    public static void main(String[] args) {
        Database db = new MySQLDatabase(); // ou new PostgreSQLDatabase()
        UsuarioService usuarioService = new UsuarioService(db);

        usuarioService.registrarUsuario("Isaac");
    }
}
