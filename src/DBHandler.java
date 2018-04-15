import java.sql.*;

public class DBHandler {
    public static Connection connect = null;

    public static void connect() {

        // Setup the connection with the DB
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager
                    .getConnection("jdbc:mysql://localhost/BookStore?"
                            + "user=root&password=");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void insertCustomer(String name, String surname, String nationality) {
        try {
            String sqlInsert = "INSERT INTO tcustomer (name, surname, nationality)" +
                    " VALUES (?, ?, ?);";

            PreparedStatement preparedStatement = connect.prepareStatement(sqlInsert);

            preparedStatement.setString(1, name);
            preparedStatement.setString(2, surname);
            preparedStatement.setString(3, nationality);

            preparedStatement.executeUpdate();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }

    public static void insertCustomerB2B(String name, String nip, String nationality) {
        try {
            String sqlInsert = "INSERT INTO tcustomerB2B (name, nip, nationality)" +
                    " VALUES (?, ?, ?);";

            PreparedStatement preparedStatement = connect.prepareStatement(sqlInsert);

            preparedStatement.setString(1, name);
            preparedStatement.setString(2, nip);
            preparedStatement.setString(3, nationality);

            preparedStatement.executeUpdate();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }

    public static void insertOrder(int customerId, CustomerType customerType, double price) {
        try {
            String sqlInsert = "INSERT INTO todrer (customer_id, customer_type, price)" +
                    " VALUES (?, ?, ?);";

            PreparedStatement preparedStatement = connect.prepareStatement(sqlInsert);

            preparedStatement.setInt(1, customerId);
            preparedStatement.setString(2, customerType.toString());
            preparedStatement.setDouble(3, price);

            preparedStatement.executeUpdate();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }
}
