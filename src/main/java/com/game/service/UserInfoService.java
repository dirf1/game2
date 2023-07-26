package com.game.service;

import java.util.List;
import java.util.Map;

public interface UserInfoService {
	List<Map<String,String>> selectUserInfoList(Map<String,String> userInfo);
	Map<String,String> selectUserInfo(String uiNum);
	int insertUserInfo(Map<String,String> userInfo);
	int updateUserInfo(Map<String,String> userInfo);
	int deleteUserInfo(String uiNum);
}