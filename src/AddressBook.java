import java.util.ArrayList;

public class AddressBook {
	private ArrayList<BuddyInfo> addresses;
	
	public ArrayList<BuddyInfo> getAddresses() {
		return addresses;
	}

	public void setAddresses(ArrayList<BuddyInfo> addresses) {
		this.addresses = addresses;
	}

	public AddressBook () {
		addresses =  new ArrayList<BuddyInfo>();
	}
	
	public void addBuddy(BuddyInfo buddyInfo) {
		addresses.add(buddyInfo);
	}
	
	public void removeBuddy(BuddyInfo buddyInfo) {
		addresses.remove(buddyInfo);
	}
}
