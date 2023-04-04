package org.example.pre_2_3_1.controllers;

import org.example.pre_2_3_1.model.User;
import org.example.pre_2_3_1.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String getAllUsers(Model model) {
        model.addAttribute("users", userService.getUsers());
        return "user/users";
    }

    @GetMapping("/new")
    public String createNewUser(@ModelAttribute("user") User user) {
        return "user/new";
    }

    @PostMapping()
    public String saveUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/users";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {
        userService.deleteUserById(id);
        return "redirect:/users";
    }

    @GetMapping("/edit/{id}")
    public String editUser(@PathVariable int id, Model model) {
        model.addAttribute("user", userService.getUserById(id));
        return "user/edit";
    }

    @PatchMapping("/{id}")
    public String updateUser(@ModelAttribute("user") User user) {
        userService.updateUser(user, user.getId());
        return "redirect:/users";
    }
}
