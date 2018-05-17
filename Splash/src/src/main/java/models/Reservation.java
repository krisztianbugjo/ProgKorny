package models;

/**
 * A foglalások modelljét reprezentáló osztály.
 * @author hallgato
 *
 */

public class Reservation {
	
	/**
	 * A foglalásokban megjelenő változók, melyeknek értéket kell adni.
	 */
	private String poolId;
	private String date;
	private String lane;
	private String time;
	
	/**
	 * Elkészít egy új foglalást, ezekkel a változókkal.
	 * @param poolId
	 * @param date
	 * @param lane
	 * @param time
	 */
	public Reservation(String poolId, String date, String lane, String time) {
		super();
		this.poolId = poolId;
		this.date = date;
		this.lane = lane;
		this.time = time;
		
/**
 * Visszaadja a poolId változót.
 */
	}
	public String getPoolId() {
		return poolId;
	}
	
/**
 * Beállítja a poolId változót.	
 * @param poolId
 */
	public void setPoolId(String poolId) {
		this.poolId = poolId;
	}
	
/**
 * Visszaadja a date változót.	
 * @return
 */
	public String getDate() {
		return date;
	}
	
/**
 * Beállítja a date változót.	
 * @param date
 */
	public void setDate(String date) {
		this.date = date;
	}
	
/**
 * Visszaadja a lane változót.	
 * @return
 */
	public String getLane() {
		return lane;
	}
	
	
/**
 * Beállítja a lane változót.	
 * @param lane
 */
	public void setLane(String lane) {
		this.lane = lane;
	}
	
	/**
	 * Visszaadja a time változót.
	 * @return
	 */
	public String getTime() {
		return time;
	}
	
	/**
	 * Beállítja a time változót.
	 * @param time
	 */
	public void setTime(String time) {
		this.time = time;
	}
	
	/**
	 * A reservation-t String típusra írja át.
	 */
	@Override
	public String toString() {
		return "Reservation [poolId=" + poolId + ", date=" + date + ", lane=" + lane + ", time=" + time + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((lane == null) ? 0 : lane.hashCode());
		result = prime * result + ((poolId == null) ? 0 : poolId.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		return result;
	}
	
	/**
	 * Az egyenlőség vizsgálatot segítő auto-generált összehasonlítás.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reservation other = (Reservation) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (lane == null) {
			if (other.lane != null)
				return false;
		} else if (!lane.equals(other.lane))
			return false;
		if (poolId == null) {
			if (other.poolId != null)
				return false;
		} else if (!poolId.equals(other.poolId))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}
	
	
}
