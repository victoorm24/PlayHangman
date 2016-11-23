package playhangman;

public interface Interface{
    int getId();
    int getPuntos();
    void setNombre(String name);
    void setCorreo(String mail);
    void setUsuario(String nickname);
    void setContrasena(String pass);
    void setPuntos(int puntos);
    String getNombre();
    String getCorreo();
    String getUsuario();
    String getContrasena();
}
