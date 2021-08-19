package me.potato.demomybatisjsoncolumn.controllers;

import lombok.RequiredArgsConstructor;
import me.potato.demomybatisjsoncolumn.entities.User;
import me.potato.demomybatisjsoncolumn.repositories.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserRepository repository;

    @GetMapping("/")
    public List<User> users() throws Exception {
        return repository.selectUsers();
    }

    @PostMapping("/")
    public Long users(@RequestBody User user) throws Exception {
        return repository.createUser(user);
    }
}
