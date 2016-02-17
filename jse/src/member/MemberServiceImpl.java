package member;

public class MemberServiceImpl implements MemberService {
	private int count = 0;
	private MemberBean[] beans;
	
	public MemberServiceImpl() {
		// TODO Auto-generated constructor stub
		beans = new MemberBean[100];
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public MemberBean[] getMembers() {
		return beans;
	}

	public void setMembers(MemberBean[] members) {
		this.beans = members;
	}

	@Override
	public String join(MemberBean member) {
		// 회원가입
		if (searchById(member.getUserid()) != null) {
			return "이미 존재하는 ID입니다.";
		}
		MemberBean bean = new MemberBean();
		bean = member;
		beans[count] = bean;
		count++;
		return bean.toString();
	}

	@Override
	public MemberBean searchById(String id) {
		// 1. 아이디로 회원정보 검색
		MemberBean bean = null;
		for (int i = 0; i < this.getCount(); i++) {
			if (beans[i].getUserid().equals(id)) {
				bean = beans[i];
			}
		}
		return bean;
	}

	@Override
	public MemberBean[] searchByName(String name) {
		// 2. 이름으로 회원정보 검색
		MemberBean[] tempBeans = new MemberBean[searchCountByName(name)];
		int j = 0;
		System.out.println("입력 이름 : " + name);
		for (int i = 0; i < this.getCount(); i++) {
			if (beans[i].getName().equals(name)) {
				System.out.println("확인됨");
				tempBeans[j] = beans[i];
				j++;
			}
		}
		return tempBeans;
	}

	@Override
	public String remove(String id) {
		// 3. 회원탈퇴
		for (int i = 0; i < this.getCount(); i++) {
			if (beans[i].getUserid().equals(id)) {
				beans[i] = beans[this.getCount() - 1];
				beans[this.getCount() - 1] = null;
				count--;
				return "삭제 성공";
			}
		}
		return "삭제 실패";
	}

	@Override
	public int countAll() {
		// 4. 전체 회원 수 조회
		return this.getCount();
	}

	@Override
	public int searchCountByName(String name) {
		// 5. 이름에 대한 회원 수 조회
		int tempCount = 0;
		for (int i = 0; i < this.getCount(); i++) {
			if (beans[i].getName().equals(name)) {
				tempCount++;
			}
		}
		return tempCount;
	}
	
	@Override
	public String login(String id, String pw) {
		// 로그인
		if (searchById(id) == null) {
			return "존재하지 않는 ID";
		} else {
			
		}
		return null;
	}

	@Override
	public String update(MemberBean member) {
		// 업데이트
		return null;
	}
}
