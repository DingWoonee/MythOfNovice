package novice.present.repository;

import novice.present.domain.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public void clearStore() {

    }

    @Override
    public Optional<User> findByUserLoginIdAndUserPassword(String userLoginId, String userPassword) {
        return Optional.empty();
    }
}
