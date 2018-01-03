package be.vdab;

import java.util.Properties;

class HelpdeskMedewerkers {
	private final Properties medewerkers;
	//key = naam medewerker, value=intern telefoonnummer

	HelpdeskMedewerkers(Properties medewerkers) {
		this.medewerkers = medewerkers;
	}
	
	@Override
	public String toString() {
		return medewerkers.toString();
	}
}


