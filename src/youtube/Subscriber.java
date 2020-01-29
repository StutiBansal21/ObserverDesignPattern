package youtube;

public class Subscriber implements Observer {
	private String name;
	private boolean isisNotified=false;
	public Subscriber(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isIsisNotified() {
		return isisNotified;
	}

	public void setIsisNotified(boolean isisNotified) {
		this.isisNotified = isisNotified;
	}

	@Override
	public void update(Video video) {
		System.out.println("Hi "+name+" new Video added "+video);

	}

	@Override
	public boolean isNotified() {
		return isisNotified;
	}

}
