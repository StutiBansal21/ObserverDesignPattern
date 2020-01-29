package youtube;

public interface Observer {
	void update(Video video);
	boolean isNotified();
}
