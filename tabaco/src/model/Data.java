package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Data {
    
    private final Conexion con;
    private String query;
    private ResultSet rs;
    private List<TipoP> listaPapel;
    private List<TipoT> listaTabaco;

    public Data() throws ClassNotFoundException, SQLException{
        con = new Conexion("localhost", "BD_Tabaco", "root", "");
    }
    
    public void createProducto(Producto nuevo) throws SQLException{
        query = "INSERT INTO producto VALUES(NULL, '" + nuevo.getTipoT() + "', '" + nuevo.getTipoP() + "', '" + nuevo.getTipoF() + "', '45656' );";
        con.ejecutar(query);
    }
    
    public List<TipoP> readPapel() throws SQLException{
        query = "SELECT * FROM TipoP";
        rs = con.ejecutarSelect(query);
        listaPapel = new ArrayList<>();
        
        TipoP p;
        while(rs.next()){
            p = new TipoP();
            
            p.setId(rs.getInt(1));
            p.setNombre(rs.getString(2));
            p.setSabor(rs.getString(3));

            listaPapel.add(p);
        }
        
        con.close();
        return listaPapel;
        
    }
     
    public List<TipoT> readTabaco() throws SQLException{
        query = "SELECT * FROM TipoT";
        rs = con.ejecutarSelect(query);
        listaTabaco = new ArrayList<>();
        
        TipoT t;
        while(rs.next()){
            t = new TipoT();
            
            t.setId(rs.getInt(1));
            t.setNombre(rs.getString(2));

            listaTabaco.add(t);
        }
        
        con.close();
        return listaTabaco;
        
    }

    
    
}
