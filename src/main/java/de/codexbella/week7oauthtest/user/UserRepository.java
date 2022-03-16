package de.codexbella.week7oauthtest.user;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
   Optional<User> findByGithubId(String githubId);
}
