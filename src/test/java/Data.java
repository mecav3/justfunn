import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class Data {
    public static Map<String, String> getusers() {
        Connection c;
        Statement s;
        Map<String, String> list = new HashMap<>();
        try {
            c = DriverManager.getConnection(DB_URL, "postgres", "admin123");
            s = c.createStatement();

            if (!tableExistsSQL(c, "active_user"))
                System.out.println("no view! creating:" + s.executeUpdate(query_create));
            else System.out.println("there is view!\n");

              ResultSet rs = s.executeQuery(query);

         //   s.addBatch(Datas.deleteRoles);
//    s.addBatch(Datas.deleteUsers);
         //   s.addBatch("ALTER TABLE roles serial = 1");
          //  s.addBatch(Datas.insertRoles);
        //   s.addBatch(Datas.insertUsers);

           // System.out.println("s.executeBatch() = " + s.executeBatch());

            while (rs.next()) {
                String tit = rs.getString("title");
                String usr = rs.getString("username");
                list.put(usr, tit);
            }

            rs.close();
            s.close();
            c.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage() + " ..DATABASE error..");
            System.exit(0);
        }
        return list;
    }

    //  jdbc:mysql://localhost/test?allowMultiQueries=true
    static final String DB_URL = "jdbc:postgresql://my-aws-db.c2lx0dpfuqfr.us-east-1.rds.amazonaws.com:5432/my_aws_db";
    static String query = "SELECT * FROM active_user";
    static String origin = "create view company_user_view1 as select c.id as c_id, c.title, c.company_status, u.id as u_id, u.username from companies c join users u on c.id = u.company_id where company_status='ACTIVE'";
    static String query_create = "create view active_user as select c.title, u.username from companies c join users u on c.id = u.company_id where company_status='ACTIVE'";

    static boolean tableExistsSQL(Connection connection, String tableName) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT count(*) " + "FROM information_schema.tables " + "WHERE table_name = ?" + "LIMIT 1;");
        preparedStatement.setString(1, tableName);
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        return resultSet.getInt(1) != 0;

    }
}
