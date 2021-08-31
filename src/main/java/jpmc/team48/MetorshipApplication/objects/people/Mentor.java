package jpmc.team48.MetorshipApplication.objects.people;

import javax.persistence.Entity;

@Entity
public class Mentor extends Person {
    private String position;
    private int[] availabilities;

    public Mentor() {
    }

    public Mentor(Long id, String firstName, String lastName, String position, int[] availability) {
        super(id, firstName, lastName);
        this.position = position;
        this.availabilities = availability;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int[] getAvailabilities() {
        return availabilities;
    }

    public void setAvailabilities(int[] availabilities) {
        this.availabilities = availabilities;
    }
}
