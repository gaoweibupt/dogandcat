package com.smart.controller;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.soap.SOAPBinding;
import java.io.PrintStream;
import java.security.Principal;

/**
 * Created by gaowei on 2017/10/24.
 */
@RestController
public class SysInfo {

    @RequestMapping("/curuser")
    public Principal user(Principal user) {
        System.out.println("user class "+user.getClass().getName());
        System.out.println("user class2 " + currentUserDetails());
        return user;
    }

    public static UserDetails currentUserDetails(){
        SecurityContext securityContext = SecurityContextHolder.getContext();
        Authentication authentication = securityContext.getAuthentication();
        if (authentication != null) {
            Object principal = authentication.getPrincipal();
            return principal instanceof UserDetails ? (UserDetails)principal:null;
        }
        return null;
    }
}
