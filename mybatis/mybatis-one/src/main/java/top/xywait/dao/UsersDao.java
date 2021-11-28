package top.xywait.dao;

import top.xywait.doMain.Users;

public interface UsersDao {

    Users selectUserById(Integer userId);
}
