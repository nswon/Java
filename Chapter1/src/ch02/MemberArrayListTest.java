package ch02;

public class MemberArrayListTest {

	public static void main(String[] args) {

		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(001, "�̼���");
		Member memberKim = new Member(002, "������");
		Member memberKang = new Member(003, "������");
		Member memberHong = new Member(004, "ȫ�浿");
		
		
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberKang);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showAllMember();
		memberArrayList.removeMember(memberKim.getMemberId());
		System.out.println("-------------------");
		memberArrayList.showAllMember();
	}

}
