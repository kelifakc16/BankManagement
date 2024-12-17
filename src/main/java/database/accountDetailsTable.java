package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class accountDetailsTable {
    public static void main(String[] args) throws SQLException {
      Connection connection=DBConnection.getDbConnection();
//        accountDetails accountD=new accountDetails(6,"Ram Karki","Saving",4000);
//        PreparedStatement pstmt = connection.prepareStatement("INSERT INTO accounts(id,account_holder_name,account_type,balance) values(?,?,?,?)");
//        pstmt.setInt(1,accountD.getId());
//        pstmt.setString(2,accountD.getAccountHolderName());
//        pstmt.setString(3,accountD.getAccountType());
//        pstmt.setDouble(4,accountD.getBalance());
//        int rowsAffected =pstmt.executeUpdate();
//        if(rowsAffected>0){
//            System.out.println("students saved successfully");
//
//        }else{
//            System.out.println("not saved");
//        }
    }
}
