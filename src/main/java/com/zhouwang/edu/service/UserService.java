package com.zhouwang.edu.service;

import com.zhouwang.edu.domain.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * description:
 *
 * @author zgw
 * date 2019/7/13
 */
@Service
public class UserService {

    public List<User> getList() {
        List<User> list = new ArrayList<>();
        User joker = new User();
        joker.setUserId(1);
        joker.setUserName("Joker");
        joker.setAge(20);
        joker.setAddress("Shanghai");
        list.add(joker);

        User jerry = new User();
        jerry.setUserId(2);
        jerry.setUserName("jerry");
        jerry.setAge(25);
        jerry.setAddress("北京");
        list.add(joker);

        return list;
    }
}
