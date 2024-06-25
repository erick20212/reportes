
package pe.edu.upeu.grafico.daolmpt;

import pe.edu.upeu.grafico.dao.EscuelaDao;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pe.edu.upeu.grafico.config.Conexion;

/**
 *
 * @author USUARIO
 */
public class EscueDaolmpl implements EscuelaDao {
private PreparedStatement ps;
private ResultSet rs;
private Connection cx= null;
    
    @Override
    public  List<String> getEscuelas(){
        List<String> lista = new  ArrayList<>();
        String SQL ="SELECT nombre FROM categorias";
        try {
            cx= Conexion.getConexion();
            ps= cx.prepareStatement(SQL);
            rs=ps.executeQuery();
            while(rs.next()){
                lista.add(rs.getString("nombre"));
                
            }
            
        } catch (SQLException e) {
            System.out.println("Error"+e);
        }
        return lista;
    }
    @Override
    public List<Integer> getCantidad(){
        List<Integer> lista = new  ArrayList<>();
        String SQL ="SELECT cantidad FROM categorias";
        try {
            cx= Conexion.getConexion();
            ps= cx.prepareStatement(SQL);
            rs=ps.executeQuery();
            while(rs.next()){
                lista.add(rs.getInt("cantidad"));
                
            }
            
        } catch (SQLException e) {
            System.out.println("Error"+e);
        }
        return lista;
    }  
}
