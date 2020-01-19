package life.majiang.community.mapper;

import life.majiang.community.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {


//    @Insert("insert into user(name ,account_id ,token,gmt_create,gmt_modified) values(#{name},#{accountId},#{token},#{gmtCreate}.#{gmtModified})")
//    void insert(User user);

    List<User> getAll();

    void insert(User user);

}
