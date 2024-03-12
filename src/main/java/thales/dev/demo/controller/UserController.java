package thales.dev.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import thales.dev.demo.repositories.services.UserService;
import thales.dev.demo.user.User;
import thales.dev.demo.user.UserDTO;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody UserDTO user) {
        User newUser = service.createUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);


    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        var users = this.service.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

}
