package jp.co.bss.kintai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.bss.kintai.dao.User;
import jp.co.bss.kintai.mapper.UserMapper;

/**
 * ユーザー情報 Service
 */
@Service
public class UserService {
	/**
	 * ユーザー情報 Mapper
	 */
	@Autowired
	private UserMapper userMapper;

	/**
	 * ユーザー情報 全検索
	 * 
	 * @return 検索結果
	 */
	@Transactional
	public List<User> findAll() {
		return userMapper.findAll();
	}
	

	@Transactional
	public User findById(Long id) {
		return userMapper.findById(id);
	}

	@Transactional
	public void create(User user) {
		userMapper.create(user);
	}

	@Transactional
	public void update(User user) {
		userMapper.update(user);
	}

	@Transactional
	public void delete(Long id) {
		userMapper.delete(id);
	}

}