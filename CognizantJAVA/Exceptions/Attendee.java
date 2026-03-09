public class Attendee {

    private String attendeeId;
    private String role;
    private String checkIn;
    private int tickets;

    // Four-argument constructor
    public Attendee(String attendeeId, String role, String checkIn, int tickets) {
        this.attendeeId = attendeeId;
        this.role = role;
        this.checkIn = checkIn;
        this.tickets = tickets;
    }

    // Getters and Setters
    public String getAttendeeId() {
        return attendeeId;
    }

    public void setAttendeeId(String attendeeId) {
        this.attendeeId = attendeeId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    // verifyAttendeeDetails method
    public static Attendee verifyAttendeeDetails(String attendeeDetails)
            throws InvalidAttendeeException {

        String[] parts = attendeeDetails.split(":");

        if (parts.length != 4) {
            throw new InvalidAttendeeException("Invalid attendee details");
        }

        String attendeeId = parts[0];
        String role = parts[1];
        String checkIn = parts[2];
        int tickets;

        // 1️⃣ Validate attendeeId (ATT- followed by exactly 5 digits)
        if (!attendeeId.matches("ATT-\\d{5}")) {
            throw new InvalidAttendeeException("Invalid attendee details");
        }

        // 2️⃣ Validate role (case-sensitive)
        if (!(role.equals("Speaker") ||
              role.equals("Participant") ||
              role.equals("Organizer"))) {
            throw new InvalidAttendeeException("Invalid attendee details");
        }

        // 3️⃣ Validate checkIn (case-sensitive)
        if (!(checkIn.equals("yes") || checkIn.equals("no"))) {
            throw new InvalidAttendeeException("Invalid attendee details");
        }

        // 4️⃣ Validate tickets (integer > 0)
        try {
            tickets = Integer.parseInt(parts[3]);
            if (tickets <= 0) {
                throw new InvalidAttendeeException("Invalid attendee details");
            }
        } catch (NumberFormatException e) {
            throw new InvalidAttendeeException("Invalid attendee details");
        }

        return new Attendee(attendeeId, role, checkIn, tickets);
    }
}