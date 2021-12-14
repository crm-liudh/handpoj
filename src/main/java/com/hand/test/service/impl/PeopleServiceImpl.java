package com.hand.test.service.impl;

import com.hand.test.dto.People;
import com.hand.test.service.PeopleService;
import org.springframework.stereotype.Service;

/**
 * @author dinghuai.liu
 */
@Service
public class PeopleServiceImpl implements PeopleService {

    @Override
    public People initUser() {
        People people = new People();
        people.setUserName("ldh");
        people.setPassword("111222");
        return people;
    }
}
