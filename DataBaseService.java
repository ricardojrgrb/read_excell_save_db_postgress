import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseService
{
    private String url;
    private String usr;
    private String pswd;

    public DataBaseService()
    {
        url = "jdbc:postgresql://localhost:5432/postgres";
        usr = "postgres";
        pswd = "root";
    }

    private Connection getConnection()
    {
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url, usr, pswd);
            return connection;
        } catch (ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, "O driver não foi encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Problemas com a conexão\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public int executeUpdate(String query){
        try{
            Connection con = getConnection();
            Statement stm = con.createStatement();
            System.out.println(query);
            int res=stm.executeUpdate(query);
            con.close();
            return res;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Problemas com a conexão\n"+ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }

    public ResultSet executeQuery(String query){
        try{
            Connection con = getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            //con.close();
            return rs;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Problemas com a conexão\n"+ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
