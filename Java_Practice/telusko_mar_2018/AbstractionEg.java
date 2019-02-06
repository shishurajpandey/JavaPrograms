package telusko_mar_2018;

abstract class phone{
	
	public void call()
	{
		System.out.println("Calling");
	}
	public void message()
	{
		System.out.println("Messaging");
	}
	public abstract void VideoCall();
	
	public abstract void ScreenTouch();
	
	public abstract void Internet();
}


abstract class Nokia extends phone{

	@Override
	public void ScreenTouch() {
		System.out.println("ScreenTouching");
		
	}

	@Override
	public void Internet() {
		System.out.println("Interneting");
		
	}
	
}

class Iphone extends Nokia{

	@Override
	public void VideoCall() {
	System.out.println("Video Calling");
		
	}
	
}

public class AbstractionEg {

	public static void main(String[] args) {
		
		//You can create the refernce of Abstract class, But you can't create the object.
		
		Nokia nokia;
		
		//Nokia nokia1=new Nokia();
		
		Iphone ip6=new Iphone();
		ip6.call();
		ip6.message();
		ip6.VideoCall();
		ip6.Internet();

	}

}
