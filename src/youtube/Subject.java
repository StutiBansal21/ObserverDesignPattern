package youtube;

public interface Subject {
	void addSubscriber(Subscriber subscribe);
	void removeSubscriber(Subscriber subscribe);
	void notification();
	//notify method is already in Object class so can't make it 
}
