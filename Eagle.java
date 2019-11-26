public class Eagle extends Bird implements Fly {

	private boolean flying;
	private int altitude;

	public Eagle(String name) {
		super(name);
		this.flying = false;
		this.altitude = 0;
	}

	@Override
	public String sing() {
		return "Screech!";
	}

	public int getAltitude() {
		return altitude;
	}

	public boolean isFlying() {
		return flying;
	}

	/**
	 * takeOff, must be on ground
	 */
	@Override
	public void takeOff() {
		if (!this.flying && this.altitude == 0) {
			this.flying = true;
			System.out.printf("%s takes off in the sky.%n", this.getName());
		}
	}

	/**
	 * ascend
	 * 
	 * @param meters heights increase
	 * @return 
	 * @return heights
	 */
	@Override	
	public int ascend(int meters) {
		if (this.flying) {
			this.altitude = Math.min(this.altitude + meters, 5000);
			System.out.printf("%s flies upward, altitude: %d%n", this.getName(), this.altitude);
		}
		return this.altitude;
	}

	/**
	 * descend
	 * 
	 * @param meters heights decrease
	 * @return heights
	 */
	@Override
	public int descend(int meters) {
		if (this.flying) {
			this.altitude = Math.max(this.altitude - meters, 0);
			System.out.printf("%s flies downward, altitude: %d%n", this.getName(), this.altitude);
		}
		return this.altitude;
	}

	/**
	 * land, must be on ground
	 */
	@Override
	public void land() {
		if (this.flying && this.altitude < 10) {
			System.out.printf("%s lands on the ground.%n", this.getName());
		} else {
			System.out.printf("%s is too high, it can't land.%n", this.getName());
		}
	}

	/**
	 * glide, no change in altitude, displaying "glides into the air"
	 */
	@Override
	public void glide() {
		System.out.println("glides into the air.");
		
	}
		

}




