package ch02.domain.userinfo.dao.oracle;

import ch02.domain.userinfo.UserInfo;
import ch02.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userinfo) {
		System.out.println("Insert into Oracle DB userId : " + userinfo.getUserId());
		
	}

	@Override
	public void deleteUserInfo(UserInfo userinfo) {
		System.out.println("Delete into Oracle DB userId : " + userinfo.getUserId());
		
	}

	@Override
	public void updateUserInfo(UserInfo userinfo) {
		System.out.println("Update into Oracle DB userId : " + userinfo.getUserId());
		
	}

}
