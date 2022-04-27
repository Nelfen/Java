package Example1;

class HighFriend extends Friend // 고교동창 정보를 저장하기 위한 클래스로 Friend클래스를 상속받음
{
	String job;
	public HighFriend(String name, String phone, String addr, String job){
		super(name, phone, addr);
		// 상위클래스(Friend)의 생성자 호출
		this.job = job;
	}
	public void showData(){
		super.showData();
		System.out.println("직업 : " + job);
	}
	public void showBasicInfo(){
		System.out.println("이름 : " + name);
		System.out.println("전화 : " + phone);
	}
}