package week9project.util;

import java.sql.Connection;

public class MainDBConnection {

    public static void main(String[] args) {
        try (Connection conn = DBConnection.getConnection()) {
            if (conn != null) {
                System.out.println("✅ Patika Store veritabanına bağlanıldı!");
            }
        } catch (Exception e) {
            System.out.println("❌ Bağlantı hatası:");
            e.printStackTrace();
        }
    }
}
