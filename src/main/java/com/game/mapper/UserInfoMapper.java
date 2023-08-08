package com.game.mapper;

import java.util.*;

import com.game.vo.UserInfoVO;

public interface UserInfoMapper {
	
	List<UserInfoVO> selectUserInfoList(UserInfoVO user);
	
	

}
