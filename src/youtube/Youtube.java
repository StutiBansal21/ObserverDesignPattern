package youtube;

public class Youtube {

	public static void main(String[] args) {
		Channel channel=new Channel("Buzzfeed");
		Subscriber subscriber1=new Subscriber("Rie");
		Subscriber subscriber2=new Subscriber("Alvin");
		Subscriber subscriber3=new Subscriber("Kat");
		Subscriber subscriber4=new Subscriber("Alex");
		subscriber3.setIsisNotified(true);
		channel.addSubscriber(subscriber1);
		channel.addSubscriber(subscriber2);
		channel.addSubscriber(subscriber3);
		channel.addSubscriber(subscriber4);
		
		Video video=new Video("Kathy"," How to cook lamb chops");
		channel.setVideo(video);
		channel.notification();

	}

}
