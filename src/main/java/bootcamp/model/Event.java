package bootcamp.model;

public class Event {
	
	private String name;
	private String description;
	private String location;	
	
	public Event() {
		name = "concert";
		description = "two bands";
		location = "Georgia";
	}
	
	public Event(String name, String description, String location) {
	
		this.name= name;
		this.description=description;
		this.location=location;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
}
