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

@Entity
@Table(name = "WebGroup")
public class WebGroup {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "GroupId")
	private int groupId;
	@Column(name = "GroupName")
	private String groupName;
	@Column(name = "GroupStatus")
	private boolean groupStatus;
	@OneToMany(mappedBy = "webGroup")
	private List<UserGroup> listUserGroup = new ArrayList<UserGroup>();

	public WebGroup() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WebGroup(int groupId, String groupName, boolean groupStatus, List<UserGroup> listUserGroup) {
		super();
		this.groupId = groupId;
		this.groupName = groupName;
		this.groupStatus = groupStatus;
		this.listUserGroup = listUserGroup;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public boolean isGroupStatus() {
		return groupStatus;
	}

	public void setGroupStatus(boolean groupStatus) {
		this.groupStatus = groupStatus;
	}

	public List<UserGroup> getListUserGroup() {
		return listUserGroup;
	}

	public void setListUserGroup(List<UserGroup> listUserGroup) {
		this.listUserGroup = listUserGroup;
	}

}
