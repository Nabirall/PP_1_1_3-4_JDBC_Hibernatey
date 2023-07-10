package jm.task.core.jdbc;


import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;


public class Main {
public static void main(String[] args) {
    UserDao userDao = new UserDaoJDBCImpl();
    userDao.createUsersTable();
    userDao.saveUser("bob", "lol", (byte) 34);
    userDao.saveUser("vov", "lole", (byte) 4);
    userDao.saveUser("zpd", "lolw", (byte) 124);
    userDao.saveUser("cww", "lolq", (byte) 54);
    userDao.getAllUsers();
    userDao.cleanUsersTable();
    userDao.dropUsersTable();
}
}