package Example1;

class Friend // 친구의 기본정보를 저장하는 클래스
{
	String name, phone, addr; // 친구 주소록에 저장될 가장 기본적인 정보
	public Friend(String name, String phone, String addr){
		// 생성자에서 기본 정보들을 저장(인스턴스 생성시 정보를 가지고 있음)
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}
	public void showData(){
		System.out.println("이름 : " + name);
		System.out.println("전화 : " + phone);
		System.out.println("주소 : " + addr);
	}
	public void showBasicInfo(){}
	// 하위클래스에서 오버라이딩하기 위해 비어있는 상태로 정의한 메소드
	public String getName(){return name;}
}