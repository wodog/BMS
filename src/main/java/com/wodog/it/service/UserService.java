package com.wodog.it.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wodog.it.dao.BmsUserMapper;
import com.wodog.it.model.BmsUser;
import com.wodog.it.model.BmsUserExample;
import com.wodog.it.utils.DateUtil;

@Service
public class UserService {

	@Autowired
	private BmsUserMapper userMapper;

	public List<BmsUser> findAll() {
		return userMapper.selectByExample(new BmsUserExample());
	}

	public Map<String, Object> addOne(BmsUser bmsUser) {
		bmsUser.setCreateDate(new Date());
		int rows = userMapper.insert(bmsUser);

		Map<String, Object> map = new HashMap<String, Object>();
		if (rows != 1) {
			map.put("success", false);
			map.put("message", "失败咯");
		} else {
			map.put("success", true);
			map.put("message", "成功咯");
		}
		return map;

	}

	public void deleteOne(int id) {
		userMapper.deleteByPrimaryKey(id);
	}

	public void editOne(BmsUser bmsUser) {
		userMapper.updateByPrimaryKeySelective(bmsUser);
	}

	public List<BmsUser> findAllByPage(int page, int rows) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("param1", (page - 1) * rows);
		map.put("param2", rows);
		List<BmsUser> users=userMapper.selectAllByPage(map);
		return users;
	}
}
