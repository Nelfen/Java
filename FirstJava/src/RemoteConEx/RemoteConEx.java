package RemoteConEx;

import Chapter16.RemoteControl;

public class RemoteConEx {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new RemoteControl() {
			int volume;
			
			@Override
			public void turnOn() {
				System.out.println("전등을 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("전등을 끕니다.");
			}
			
			@Override
			public void setVolume(int volume) {
				if (volume < RemoteControl.MIN_VOLUME) {
					this.volume = RemoteControl.MIN_VOLUME;
				} else if (volume > RemoteControl.MAX_VOLUME) {
					this.volume = RemoteControl.MAX_VOLUME;
				} else {
					this.volume = volume;
				}
				System.out.println("전등의 현재 밝기는 " + this.volume + "입니다.");
			}
		};
		
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}

}