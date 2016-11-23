package playhangman;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ConsultasBD {
    public static MySqlBD baseDatos = new MySqlBD().conectar("localhost", "hangman", "root", "");
    public static Interface UsuarioLogin;
    
    public Usuario buscarUser(String Usuario, String Pass) {
        Usuario pac = null;
        ResultSet rs = baseDatos.consultar("SELECT * FROM usuarios" + " where Usuario='" + Usuario + "' AND Contraseña='" + Pass + "'");
        if (rs != null) {
            try {
                while (rs.next()) {
                    pac = new Usuario(rs.getInt("ID"),
                            rs.getString("Nombre"),
                            rs.getString("Correo"),
                            rs.getString("Usuario"),
                            rs.getString("contraseña"),
                            rs.getInt("Puntos"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        UsuarioLogin = pac;
        return pac;
    }

    public void insertar(String nombre, String correo, String usuario, String pass) {
        if (baseDatos.ejecutar("INSERT INTO usuarios VALUES(null,'" + nombre + "','" + correo + "', '" + usuario + "', '" + pass + "',0)")) {
            System.out.println("Los valores han sido agregados a la base de datos!");
        } else {
            System.out.println("Ocurrio un problema al insertar los valores a la base de datos!");
        }
    }
    
    public ResultSet consultar(String sql){
        ResultSet resultado;
        try{
            Statement sentencia = baseDatos.getConexion().createStatement(java.sql.ResultSet.TYPE_FORWARD_ONLY, java.sql.ResultSet.CONCUR_READ_ONLY);
            resultado = sentencia.executeQuery(sql);
        } catch (Exception e){
            return null;
        }
        return resultado;
    }
    
    public void update(){
        String sql = "UPDATE usuarios SET Puntos= " + UsuarioLogin.getPuntos() + " where correo='" +UsuarioLogin.getCorreo() +"'";
        if(baseDatos.ejecutar(sql)){
        } else {
            System.out.print("Error");
        }
    }
}
