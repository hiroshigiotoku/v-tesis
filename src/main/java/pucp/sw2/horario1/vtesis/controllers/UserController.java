/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pucp.sw2.horario1.vtesis.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pucp.sw2.horario1.vtesis.dao.UserDAO;

/**
 *
 * @author Hiroshi
 */
@Controller(value = "userController")
public class UserController {
    @Autowired
    UserDAO userDao;
    
    private static final Logger log = Logger.getLogger("UserController");
    
    @RequestMapping(value = "inicio")
    public String inicial(){
        log.info("/inicio");
        return "login";
    }
}
