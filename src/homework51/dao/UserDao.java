package homework51.dao;

import homework51.model.User;
import homework51.model.UserLog;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class UserDao {
    public int insertUser(User user){
        Connection connection = DataBaseConnection.connect();
        try {
            String SQL = "INSERT INTO users(id, login, email, passwordd ) VALUES(?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(SQL);
            statement.setInt(1, user.getId());
            statement.setString(2, user.getLogin());
            statement.setString(3, user.getEmail());
            statement.setString(4, user.getPassword());
            return statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int update(User user){
        return 0;
    }

    public int deleteUser(Integer id){
        return 0;
    }

    public List<UserLog> selectUserLog(){


        return null;
    }
}
