package youtube;

import java.util.*;

public class Channel implements Subject {
	private String channelName;
	private Video video;
	private List<Subscriber>listOfSubscriber;
		
	public Channel(String channelName) {
		super();
		this.channelName = channelName;
		this.listOfSubscriber=new ArrayList<>();
	}

	@Override
	public void addSubscriber(Subscriber subscribe) {
		this.listOfSubscriber.add(subscribe);

	}

	@Override
	public void removeSubscriber(Subscriber subscribe) {
		this.listOfSubscriber.remove(subscribe);

	}

	@Override
	public void notification() {
		this.listOfSubscriber.stream().filter(sub->sub.isNotified()).
		forEach(subscriber->{
			subscriber.update(video);
		});

	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public List<Subscriber> getListOfSubscriber() {
		return listOfSubscriber;
	}

	public void setListOfSubscriber(List<Subscriber> listOfSubscriber) {
		this.listOfSubscriber = listOfSubscriber;
	}
	

}
