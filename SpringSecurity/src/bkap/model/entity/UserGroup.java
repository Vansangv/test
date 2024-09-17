package bkap.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "User_Group")
public class UserGroup {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "UserGroupId")
	private int userGroupId;
	@ManyToOne
	@JoinColumn(name = "userId", referencedColumnName = "userId")
	private WebUser webUser;
	@ManyToOne
	@JoinColumn(name = "groupId", referencedColumnName = "groupId")
	private WebGroup webGroup;

	public UserGroup() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserGroup(int userGroupId, WebUser webUser, WebGroup webGroup) {
		super();
		this.userGroupId = userGroupId;
		this.webUser = webUser;
		this.webGroup = webGroup;
	}

	public int getUserGroupId() {
		return userGroupId;
	}

	public void setUserGroupId(int userGroupId) {
		this.userGroupId = userGroupId;
	}

	public WebUser getWebUser() {
		return webUser;
	}

	public void setWebUser(WebUser webUser) {
		this.webUser = webUser;
	}

	public WebGroup getWebGroup() {
		return webGroup;
	}

	public void setWebGroup(WebGroup webGroup) {
		this.webGroup = webGroup;
	}

}
