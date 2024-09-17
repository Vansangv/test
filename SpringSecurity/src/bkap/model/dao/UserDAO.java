package bkap.model.dao;

import bkap.model.entity.WebUser;

public interface UserDAO {
	public WebUser getUserByUserName(String userName);
}
