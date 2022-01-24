package ch02.web.userinfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import ch02.domain.userinfo.UserInfo;
import ch02.domain.userinfo.dao.UserInfoDao;
import ch02.domain.userinfo.dao.mysql.UserInfoMysqlDao;
import ch02.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("db.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("12345");
		userInfo.setUserName("steve");
		userInfo.setPassword("@#$%^");
		
		UserInfoDao userInfoDao = null;
		
		if(dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOracleDao();
		} 
		else if (dbType.equals("MYSQL")) {
			userInfoDao = new UserInfoMysqlDao();
		} 
		else {
			System.out.println("db error");
			return;
		}
		
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);

	}

}
