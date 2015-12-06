package com.wodog.it.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wodog.it.commons.CustomObj;
import com.wodog.it.commons.DataGrid;
import com.wodog.it.model.BmsUser;
import com.wodog.it.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/findAll")
	@ResponseBody
	public DataGrid findAllUser() {
		List<BmsUser> users = userService.findAll();
		return new DataGrid(users.size(), users);
	}

	@RequestMapping("/findAllByPage")
	@ResponseBody
	public DataGrid findAllUserByPage(int page,int rows){
		List<BmsUser> users = userService.findAllByPage(page,rows);
		
		return new DataGrid(findAllUser().getTotal(), users);
	}
	
	@RequestMapping("/addOne")
	@ResponseBody
	public CustomObj addOneUser(BmsUser bmsUser) {
		Map<String, Object> map = userService.addOne(bmsUser);
		return new CustomObj((Boolean) map.get("success"), (String) map.get("messagme"), null);
	}

	@RequestMapping("/deleteOne")
	@ResponseBody
	public void deleteOneUser(int id) {
		userService.deleteOne(id);
	}

	@RequestMapping("/editOne")
	@ResponseBody
	public void editOneUser(BmsUser bmsUser) {
		System.out.println(bmsUser);
		userService.editOne(bmsUser);
	}
	
}
