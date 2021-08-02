package assignment3;

import java.util.ArrayList;
import java.util.List;

public class Zipcodes implements ZipService {

	List<Zipcodedata> list;

	public Zipcodes() {
		list = new ArrayList<>();
		list.add(new Zipcodedata(210, "Jaipur", "Rajasthan", "India"));
		list.add(new Zipcodedata(220, "Saharanpur", "Uttar Pradesh", "India"));
		list.add(new Zipcodedata(230, "Pune", "Maharashtra", "India"));
		list.add(new Zipcodedata(240, "Ranchi", "Jharkhand", "India"));
	}

	@Override
	public List<Zipcodedata> getZips() {
		return list;
	}

	@Override
	public Zipcodedata getZips(long zip) {
		Zipcodedata z = null;
		for (Zipcodedata zipdata : list) {
			if (zipdata.getZip() == zip) {
				z = zipdata;
				break;
			}
		}
		return z;
	}
}
