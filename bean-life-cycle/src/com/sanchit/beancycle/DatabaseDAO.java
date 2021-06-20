package com.sanchit.beancycle;

import java.sql.*;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author: Sanchit Raina
 */
public class DatabaseDAO {
    private String driver;
    private String url;
    private String user;
    private String password;

    public String getDriver() {
        return this.driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    Connection conn;
    Statement stmt;

    @PostConstruct
    public void makeConnection() throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        conn = DriverManager.getConnection(url, user, password);
        stmt = conn.createStatement();
    }

    @PreDestroy
    public void closeConnection() throws SQLException {
        conn.close();
    }

    public void selectAllRows() throws ClassNotFoundException, SQLException {
        String sql = "SELECT * FROM availability";
        ResultSet rs = stmt.executeQuery(sql);
        System.out.println("bId\n");
        while (rs.next()) {
            String bId = rs.getString("bId");
            System.out.println(bId);
        }
    }

    public void deleteRecord(String bId) throws ClassNotFoundException, SQLException {
        String sql = "DELETE FROM availability where bId = '" + bId + "'";
        stmt.executeUpdate(sql);
        selectAllRows();
    }
}
