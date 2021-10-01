package Assignment;

public class Project {
	
	int id;
	String company;
	int duration;
	public Project(int id, String company, int duration) {
		super();
		this.id = id;
		this.company = company;
		this.duration = duration;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", company=" + company + ", duration=" + duration + "]";
	}
	
	

}
