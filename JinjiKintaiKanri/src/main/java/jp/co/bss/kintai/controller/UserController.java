package jp.co.bss.kintai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jp.co.bss.kintai.dao.User;
import jp.co.bss.kintai.service.UserService;

/**
 * ユーザー情報 Controller
 */
@Controller
public class UserController {
	// http://localhost:8080/user/list

  /**
   * ユーザー情報 Service
   */
  @Autowired
  private UserService userService;

  /**
   * ユーザー情報一覧画面を表示
   * @param model Model
   * @return ユーザー情報一覧画面
   */
  @GetMapping(value = "/user/list")
  public String displayList(Model model) {
    List<User> userlist = userService.findAll();
    model.addAttribute("userlist", userlist);
    return "user/list";
  }

}