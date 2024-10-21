
public class Residential extends Building {

	private int numBedrooms;
	private int numBathrooms;
	private boolean garage;

	public Residential( String own, String addr, double sqFt,
			int nBed, int nBath, boolean gar) {
				
		super( own, addr, sqFt);
		
		numBedrooms = nBed;
		numBathrooms = nBath;
		garage = gar;
	
	}

	public int getNumBedrooms() {
		return numBedrooms;
	}

	public void setNumBedrooms(int numBed) {
		numBedrooms = numBed;
	}

	public int getNumBathrooms() {
		return numBathrooms;
	}

	public void setNumBathrooms(int numBath) {
		numBathrooms = numBath;
	}
	
	public void setGarage(boolean gar) {
		garage = gar;
	}

	public boolean hasGarage() {
		return garage;
	}

	

	public String toString() {
		String str = super.toString() +
					 String.format("Bedrooms: %d\n", numBedrooms)+
					 String.format("Bathrooms: %d\n", numBathrooms)+
					 String.format("Garage: %b\n", garage);
		return str;
	}
}