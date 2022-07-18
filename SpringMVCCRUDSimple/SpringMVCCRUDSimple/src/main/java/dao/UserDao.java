/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

//import model.login;
import model.User;

/**
 *
 * @author Admin
 */
public interface UserDao {

 public int registerUser(User user);

 public String loginUser(User user);
}

