package TODO.demo.user;


import javax.swing.text.html.Option;
import java.util.Optional;

public interface UserRepository {
    /*
        DB에 User 저장
     */
    User save(User user);

    /*
        ID를 가지고 Nickname을 찾음
     */
    Optional<User> findByNickid(String id);



}
