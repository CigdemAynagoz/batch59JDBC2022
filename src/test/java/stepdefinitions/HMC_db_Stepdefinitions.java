package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import java.sql.*;

public class HMC_db_Stepdefinitions {
    String url="jdbc:sqlserver://184.168.194.58:1433;databaseName=hotelmycamp ; user=techproed;password=P2s@rt65";
    String username="techproed";
    String password="P2s@rt65";
    Connection connection;
    Statement statement;
    ResultSet resultSet;

    @Given("kullanici HMC veri tabanina baglanir")
    public  void kullanici_hmc_veri_tabanina_baglanir() throws SQLException {
    connection= DriverManager.getConnection(url,username,password);
        statement= connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    }

    @And("kullanici {string} sutunundaki verileri okur")
    public void kullaniciSutunundakiVerileriOkur(String arg0) {
        
    }

    @And("kullanici {string} tablosundaki {string} verilerini alir")
    public void kullaniciTablosundakiVerileriniAlir(String table, String field) throws SQLException {
        String query = "SELECT "+field+" FROM "+ table;
        resultSet = statement.executeQuery(query);
    }
}
