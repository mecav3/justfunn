package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DataSingleQuery {

    public static List<String> getAwaitingApprovel(String usr) {
        Connection c;
        Statement s;
        List<String> list = new ArrayList<>();
        try {
            c = DriverManager.getConnection(Datas.DB_URL, "postgres", "admin123");
            s = c.createStatement();
            ResultSet rs = null;

            if (usr.contains("greentech")) rs = s.executeQuery(Datas.awaiting_ApprovalGreentechPurchase);
            else rs = s.executeQuery(Datas.awaiting_ApprovalBluetechPurchase);

            while (rs.next()) {
                String tit = rs.getString("invoice_no");
                list.add(tit);
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

}
