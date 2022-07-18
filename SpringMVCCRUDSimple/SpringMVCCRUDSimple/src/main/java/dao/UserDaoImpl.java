/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.User;
//import model.login;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
/**
 *
 * @author Admin
 */
public class UserDaoImpl implements UserDao {

    private JdbcTemplate jdbcTemplate;

    public UserDaoImpl(DataSource dataSoruce) {
        jdbcTemplate = new JdbcTemplate(dataSoruce);
    }

    @Override
    public int registerUser(User user) {

        String sql = "INSERT INTO USER_DATA VALUES(?,?)";

        try {

            int counter = jdbcTemplate.update(sql, new Object[]{user.getUsername(), user.getPassword()});

            return counter;

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public String loginUser(User user) {

        String sql = "SELECT username FROM account WHERE username=? AND password=?";

        try {

            String username = jdbcTemplate.queryForObject(sql, new Object[]{
                user.getUsername(), user.getPassword()}, String.class);

            return username;

        } catch (Exception e) {
            return null;
        }
    }

}
