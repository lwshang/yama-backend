package team.yama.yama.repository;

import org.springframework.data.repository.CrudRepository;
import team.yama.yama.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
}