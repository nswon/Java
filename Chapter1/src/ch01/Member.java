package ch01;

public class Member {

	private int memberId; // ȸ�� ���̵�
	private String memberName; // ȸ�� �̸�
	private String password;
	
	public Member(int memberId, String memberName) { // ������
		this.memberId = memberId;
		this.memberName = memberName;
		this.password = password;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + ", password=" + password + "]";
	}

	
	
	
}
