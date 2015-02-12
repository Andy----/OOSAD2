package Week3.week3;

public class Pilot extends Professional {

	private String license;
	private int flyingHours;

	public String getLicense() {
		return this.license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public int getFlyingHours() {
		return this.flyingHours;
	}

	public void setFlyingHours(int flyingHours) {
		this.flyingHours = flyingHours;
	}

}
