package jp.co.bss.kintai.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.co.bss.kintai.dao.User;

/**
 * ユーザー情報 Mapper
 * 
 * @author miaoc
 *
 */
@Mapper
public interface UserMapper {
	List<User> findAll();
	
	User findOne(Long id);
	
	void save(User item);
	
	void update(User item);
	
	void delete(Long id);

}
