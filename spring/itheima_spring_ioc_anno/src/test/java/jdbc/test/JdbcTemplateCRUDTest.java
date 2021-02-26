package jdbc.test;

import jdbc.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/1 21:05
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JdbcTemplateCRUDTest {

    @Autowired
    private JdbcTemplate jdbcTemplateTest;

    @Test
    public void testUpdate(){
        jdbcTemplateTest.update("update account set money=? where name=?",10000.23,"jack");
    }

    @Test
    public void testDel(){
        jdbcTemplateTest.update("delete from account where name = ?","jack");
    }

    @Test
    public void QueryAll(){
        List<Account> accountList = jdbcTemplateTest.query("select * from account", new BeanPropertyRowMapper<Account>(Account.class));
        System.out.println(accountList);
    }

    @Test
    public void QueryOne(){
        Account account = jdbcTemplateTest.queryForObject("select * from account where name = ?", new BeanPropertyRowMapper<Account>(Account.class), "rose");
        System.out.println(account);
    }

    @Test
    public void QueryCount(){
        Long count = jdbcTemplateTest.queryForObject("select count(*) from account", long.class);
        System.out.println(count);
    }
}
