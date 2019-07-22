package com.deng.dao;

import com.deng.bean.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {
    @Select("SELECT name FROM t_user where name=#{userName}")
    String findAgeByName(@Param("userName") String userName);
    /**
     * 新增数据
     */
    @Insert("insert into t_user(id,name,age) values(#{id},#{name},#{age})")
    void addUser(User user);

    /**
     * 用户数据修改
     */
    @Update("update t_user set name=#{name},age=#{age} where id=#{id}")
    void updateUser(User user);

    /**
     * 用户数据删除
     */
    @Delete("delete from t_user where id=#{id}")
    void deleteUser(int id);

    /**
     * 根据用户名称查询用户信息
     *
     */
    @Select("SELECT id,name,age FROM t_user where name=#{userName}")
    User findByName(@Param("userName") String userName);

    /**
     * 查询所有
     */
    @Select("SELECT id,name,age FROM t_user")
    List<User> findAll();
}
