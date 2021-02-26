package proxy;

import proxy.dao.StudentDao;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/1 16:22
 */

public class Test {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();
        studentDao.add("aaa");
        studentDao.sel(1);
    }
}
