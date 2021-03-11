package utilitarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class conexao
{
    final private String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
    final private String url = "jdbc:odbc:estoque";
    final private String usuario = "";
    final private String senha = "";
    private Connection conexao;
    public Statement statement;
    public ResultSet resultset;
    
    public boolean conecta()
    {
        boolean result = true;
        try
        {
            Class.forName(driver);//tenta carregar o driver citado acima
            conexao = DriverManager.getConnection(url,usuario,senha);//efetua a conexao com a url acima a chave e a senha vazia
            JOptionPane.showMessageDialog(null,"conectou");
        }
        catch(ClassNotFoundException Driver)
        {
            JOptionPane.showMessageDialog(null,"Driver não localizado : "+Driver);
            result= false;
        }
                catch(SQLException Fonte)
                {
                    JOptionPane.showMessageDialog(null,"Erro na conexão com a fonte de dados "+Fonte);
                    result = false;
                }
                return result;
    }
        public void desconecta()
    {
        boolean result = true;
        try
        {
            conexao.close();
            JOptionPane.showMessageDialog(null,"Banco Fechado");
        }
        catch(SQLException fecha)
                {
                    JOptionPane.showMessageDialog(null,"Não foi possivel fechar o Banco de dados "+fecha);
                    result = false;
                }
    }
        public void executeSQL(String sql)
        {
                try
                {
                    statement = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);// criar ligação para o bdd
                    resultset = statement.executeQuery(sql);//executar os dados gravados no resultset
                }
        catch(SQLException sqlex)
        {
            JOptionPane.showMessageDialog(null,"Não foi possivel executar "+sqlex);
            
        }
        }
}
    