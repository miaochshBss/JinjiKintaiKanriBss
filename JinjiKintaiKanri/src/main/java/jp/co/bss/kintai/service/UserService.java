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
   * @return 検索結果
   */
	@Transactional
	public List<User> findAll() {
		return userMapper.findAll();
	}
}