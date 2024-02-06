package sockets.repositories;

import sockets.models.User;

import java.util.Optional;

public interface UsersRepository extends CrudRepository<User>{

    Optional<User> findByUsername(String username);
}
