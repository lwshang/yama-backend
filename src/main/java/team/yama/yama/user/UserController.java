package team.yama.yama.user;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {

    private final UserRepository userRepository;

    UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/user/{id}")
    Optional<User> one(@PathVariable Long id) {
        return userRepository.findById(id);
    }

    @PostMapping("/user")
    User newUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }

    @PutMapping("/user/{id}")
    Optional<User> replaceUser(@RequestBody User newUser, @PathVariable Long id) {

        return userRepository.findById(id)
                .map(user -> {
                    user.setEmail(newUser.getEmail());
                    user.setPassword(newUser.getPassword());
                    user.setFirstName(newUser.getFirstName());
                    user.setLastName(newUser.getLastName());
                    return userRepository.save(user);
                });
    }

    @DeleteMapping("/user/{id}")
    void deleteEmployee(@PathVariable Long id) {
        userRepository.deleteById(id);
    }

}
