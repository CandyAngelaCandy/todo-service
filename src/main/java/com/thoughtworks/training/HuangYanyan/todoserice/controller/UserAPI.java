package com.thoughtworks.training.huangyanyan.todoserice.controller;

import com.thoughtworks.training.huangyanyan.todoserice.service.UserService;
import com.thoughtworks.training.huangyanyan.todoserice.model.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.Charset;
import java.util.List;

@RestController
public class UserAPI {
    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public ResponseEntity<String> save(@RequestBody User user) {
        userService.save(user);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping("/users")
    public List<User> select() {
        return userService.list();
    }


    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user) {

        String userName = user.getName();
        String userPassword = user.getPassword();

        if (userService.verify(userName, userPassword)) {

            String token = userService.generateToken(userName);

            return ResponseEntity.ok(token);
        }

        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/users/verifications")
    public User verifyToken(@RequestBody String token){

        Integer userId = Jwts.parser()
                .setSigningKey("kitty".getBytes(Charset.forName("UTF-8")))
                .parseClaimsJws(token)
                .getBody()
                .get("userId", Integer.class);

        return userService.findUserById(userId);

    }
}
