package dubbo.provider.server.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import dubbo.simple.service.model.User;

public interface UserMapper {
    @Select("select * from user order by userid desc limit 1 ")
    @Results({@Result(id = true, property = "userid", column = "userid", javaType = String.class),
            @Result(property = "email", column = "email", javaType = String.class),
            @Result(property = "nickname", column = "nickname", javaType = String.class)})
    List<User> getAllUser1();

    @Select("select * from user order by userid desc limit 1,2 ")
    @Results({@Result(id = true, property = "userid", column = "userid", javaType = String.class),
            @Result(property = "email", column = "email", javaType = String.class),
            @Result(property = "nickname", column = "nickname", javaType = String.class)})
    List<User> getAllUser2();
}
