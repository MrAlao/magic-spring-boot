package com.chloneda.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author chloneda
 * @description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class QueryDaoTest {

    @Autowired
    QueryDao queryDao;

    @Test
    public void testQuery() {
        System.out.println(
                "用户信息列表：" + queryDao.query("select * from user"));
    }

}
