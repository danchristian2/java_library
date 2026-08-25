import java.sql.Connection;

public class Main {

    public static void main(String[] args) {

        try {
            Connection connection = DatabaseConnection.getConnection();

            System.out.println("Connected to PostgreSQL!");

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}