package de.codexbella.week7oauthtest.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
   private final UserRepository userRepository;

   public String createUser(User user) {
      if (userRepository.findByGithubId(user.getGithubId()).isEmpty()) {
         userRepository.save(user);
         return "New user created with Github ID: " + user.getGithubId();
      }
      return "User already exists.";
   }
}
