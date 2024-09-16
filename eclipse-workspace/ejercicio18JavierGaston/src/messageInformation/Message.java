package messageInformation;

import java.util.Date;
import java.util.Objects;

public class Message {
	String localTeam = null;
	String visitingTeam = null;
	int localGoals = 0;
	int visitingGoals = 0;
	String place = null;
	Date date = null;

	public Message(String localTeam, String visitingTeam, int localGoals, int visitingGoals, String place, Date date) {
		this.localTeam = localTeam;
		this.visitingTeam = visitingTeam;
		this.localGoals = localGoals;
		this.visitingGoals = visitingGoals;
		this.place = place;
		this.date = date;
	}

	public String getLocalTeam() {
		return localTeam;
	}

	public void setLocalTeam(String localTeam) {
		this.localTeam = localTeam;
	}

	public String getVisitingTeam() {
		return visitingTeam;
	}

	public void setVisitingTeam(String visitingTeam) {
		this.visitingTeam = visitingTeam;
	}

	public int getLocalGoals() {
		return localGoals;
	}

	public void setLocalGoals(int localGoals) {
		this.localGoals = localGoals;
	}

	public int getVisitingGoals() {
		return visitingGoals;
	}

	public void setVisitingGoals(int visitingGoals) {
		this.visitingGoals = visitingGoals;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Message [localTeam=" + localTeam + ", visitingTeam=" + visitingTeam + ", localGoals=" + localGoals
				+ ", visitingGoals=" + visitingGoals + ", place=" + place + ", date=" + date + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, localGoals, localTeam, place, visitingGoals, visitingTeam);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Message other = (Message) obj;
		return Objects.equals(date, other.date) && localGoals == other.localGoals
				&& Objects.equals(localTeam, other.localTeam) && Objects.equals(place, other.place)
				&& visitingGoals == other.visitingGoals && Objects.equals(visitingTeam, other.visitingTeam);
	}
}
