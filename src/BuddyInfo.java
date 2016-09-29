
public class BuddyInfo {
	private String name;
	private String address;
	private String phoneNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public static void main(String[] args) {
		BuddyInfo buddyInfo = new BuddyInfo();
		buddyInfo.setName("Aly");
		System.out.println("Hello " + buddyInfo.getName());

	}

}
