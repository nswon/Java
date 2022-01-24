package ch02.domain.userinfo.dao.mysql;

import ch02.domain.userinfo.UserInfo;
import ch02.domain.userinfo.dao.UserInfoDao;

public class UserInfoMysqlDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userinfo) {
		System.out.println("Insert into Mysql DB userId : " + userinfo.getUserId());
		
	}

	@Override
	public void deleteUserInfo(UserInfo userinfo) {
		System.out.println("Delete from Mysql DB userId : " + userinfo.getUserId());
		
	}

	@Override
	public void updateUserInfo(UserInfo userinfo) {
		System.out.println("Update into Mysql DB userId : " + userinfo.getUserId());
		
	}

}
