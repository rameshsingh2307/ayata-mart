package com.ayata.ayatamart.testAuthentication;

import com.ayata.ayatamart.dao.UserRepository;
import com.ayata.ayatamart.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.beans.factory.annotation.Autowired;
import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest(showSql = true)
@AutoConfigureTestDatabase(replace=Replace.NONE)
@Rollback(false)
public class TestAuthenticationRepo {

    @Autowired
    UserRepository userRepository;

    @Test
    public void getByUserNameTest()
    {
        String username = "ramesh.singh@ayatacommerce";
        User user = userRepository.getUserByUserName(username);
        System.out.println("test user : "+user);
        assertThat(user).isNotNull();
    }
}
