package ch02.domain.userinfo.dao;

import ch02.domain.userinfo.UserInfo;

public interface UserInfoDao {
	
	void insertUserInfo(UserInfo userinfo);
	void deleteUserInfo(UserInfo userinfo);
	void updateUserInfo(UserInfo userinfo);

}
