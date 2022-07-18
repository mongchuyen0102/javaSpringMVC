/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import dao.UserDao;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Admin
 */
@Controller
public class RegistrationController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ModelAndView userRegistration(@RequestParam("username") String username,
            @RequestParam("password") String password) {

        ModelAndView mv = new ModelAndView();

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        int counter = userDao.registerUser(user);

        if (counter > 0) {
            mv.addObject("msg", "User registration successful.");
        } else {
            mv.addObject("msg", "Error- check the console log.");
        }

        mv.setViewName("registration");

        return mv;
    }
}
