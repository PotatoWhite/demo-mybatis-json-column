package me.potato.demomybatisjsoncolumn.repositories;

import me.potato.demomybatisjsoncolumn.entities.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserRepository {
    List<User> selectUsers() throws Exception;

    Long createUser(User newUser);
}
