package playhangman;

import java.sql.ResultSet;
import java.util.ArrayList;

public class ConsultasPalabras{
    public ArrayList<Palabra> consultarLista(){
        ArrayList<Palabra> result = new java.util.ArrayList<>();
        ResultSet rs = ConsultasBD.baseDatos.consultar("SELECT*FROM palabras");
        if(rs != null){
            try{
                while(rs.next()){
                    result.add(new Palabra( rs.getInt("id"),
                            rs.getString("ingles"),
                            rs.getString("español")));
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        return result;
    }
}
