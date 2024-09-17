package bkap.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;



@Entity
@Table(name = "WebUser")
public class WebUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "UserId")
	private int userId;
	@Column(name = "UserName")
	private String username;
	@Column(name = "Pass")
	private String password;
	@Column(name = "UserStatus")
	private int userStatus;
	@OneToMany(mappedBy = "webUser")
	private List<UserGroup> listUserGroup = new ArrayList<UserGroup>();
	public WebUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WebUser(int userId, String username, String password, int userStatus, List<UserGroup> listUserGroup) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.userStatus = userStatus;
		this.listUserGroup = listUserGroup;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}
	public List<UserGroup> getListUserGroup() {
		return listUserGroup;
	}
	public void setListUserGroup(List<UserGroup> listUserGroup) {
		this.listUserGroup = listUserGroup;
	}
	
	@Transient
	public List<GrantedAuthority> getAuthorities(){
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		for (UserGroup userGroup : this.listUserGroup) {
			authorities.add(new SimpleGrantedAuthority(userGroup.getWebGroup().getGroupName()));
		}
		return authorities;
	}	
}
