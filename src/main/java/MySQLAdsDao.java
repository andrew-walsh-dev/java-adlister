import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Driver;

public class MySQLAdsDao implements Ads {
    private Connection connection;

    public MySQLAdsDao() throws SQLException {
        this.connection = getConnection();
    }

    @Override
    public List<Ad> all() throws SQLException {
        Statement statement = this.connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM ads");
        List<Ad> ads = new ArrayList<Ad>();
        while (rs.next()) {
            ads.add(new Ad(rs.getLong("id"), rs.getLong("user_id"), rs.getString("title"), rs.getString("description")));
        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) throws SQLException {
        Statement statement = this.connection.createStatement();
        statement.execute("INSERT INTO ads (id, user_id, title, description) VALUES (${ad.getId()}, ${ad.getUserId()}, ${ad.getTitle()}, ${ad.getDescription()})");
        return 1L;
    }

    public Connection getConnection() throws SQLException {
        try {
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(
                    Config.getUrl(),
                    Config.getUser(),
                    Config.getPassword()
            );
            System.out.println("Connected to the database!");
            return connection;
        }
        catch (Exception e) {
            throw new SQLException(e.getMessage());
        }
    }
}
