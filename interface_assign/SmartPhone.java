public class SmartPhone extends Phone implements Camera,MusicPlayer{
    public void click(){
		System.out.println("SmartPhone's click method");
	}
	public void record(){
		System.out.println("SmartPhone's record method");
	}
	public void play(){
		System.out.println("SmartPhone's play method");
	}
	public void stop(){
		System.out.println("SmartPhone's stop method");
	}
	// method overriding
	public void call(){
		System.out.println("SmartPhone's call method");
	}
	public void sms(){
		System.out.println("SmartPhone's sms method");
	}
	public static void main(String[] arg){
		Phone ph=new Phone();
		ph.call();
		ph.sms();
		Phone sp=new SmartPhone();
		sp.call();
		sp.sms();
		Camera camera=new SmartPhone();
		camera.click();
		camera.record();
		MusicPlayer mp=new SmartPhone();
		mp.play();
		mp.stop();
		SmartPhone sp1=new SmartPhone();
		sp1.call();
		sp1.sms();
		sp1.click();
		sp1.record();
		sp1.play();
		sp1.stop();
	}
}