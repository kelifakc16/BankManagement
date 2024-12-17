package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBQueries {
    public static void main(String[] args) {
//        try {
//            Connection connection=DBConnection.getDbConnection();
//            PreparedStatement  pstmt = connection.prepareStatement("INSERT INTO accounts(id,account_holder_name,account_type,balance) values(?,?,?,?)");
//            pstmt.setString(1,"100");
//            pstmt.setString(2,"Rupa");
//            pstmt.setString(3,"Saving");
//            pstmt.setString(4,"30000");
//            int rowsAffected =pstmt.executeUpdate();
//            if(rowsAffected>0){
//                System.out.println("students saved successfully");
//
//            }else{
//                System.out.println("not saved");
//            }
//
//
//
//
//
//        } catch (SQLException sqlException) {
//            System.err.println(sqlException.getMessage());
//        }
    }
}
