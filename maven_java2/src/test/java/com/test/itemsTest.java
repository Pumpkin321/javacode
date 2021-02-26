package com.test;

import com.dao.impl.itemsDAOimpl;
import com.dao.itemsDAO;
import com.domain.items;
import org.junit.Test;
import java.util.List;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/26 15:12
 */

public class itemsTest {
    @Test
    public void findAll() throws Exception {
        itemsDAO itemsdao = new itemsDAOimpl();
        List<items> list = itemsdao.findAll();
        for (items it : list){
            System.out.println(it.getId());
            System.out.println(it.getName());
        }
    }
}
