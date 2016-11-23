package playhangman;

public class Usuario implements Interface{
    private int id;
    private String nombre;
    private String correo;
    private String usuario;
    private String contrasena;
    private int puntos;

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
@Override
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
@Override
    public String getUsuario() {
        return usuario;
    }
@Override
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
@Override
    public String getContrasena() {
        return contrasena;
    }
@Override
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
@Override
    public int getPuntos() {
        return puntos;
    }
@Override
    public void setPuntos(int puntos) {
        this.puntos += puntos;
    }
    
    public Usuario(int id,String nombre, String correo, String usuario, String contrasena, int puntos){
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.puntos = puntos;   
    }

}
