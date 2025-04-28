package week5.projects.enumsExample;

public enum Days {

        SUNDAY("Off day"),
        MONDAY("09:00 - 17:00"),
        TUESDAY("09:00 - 16:00"),
        WEDNESDAY("08:00 - 15:00"),
        THURSDAY("09:00 - 18:00"),
        FRIDAY("09:00 - 17:00"),
        SATURDAY("10:00 - 14:00");

        private final String workingHours;

        // Constructor
        Days(String workingHours) {
            this.workingHours = workingHours;
        }

        // Getter Method
        public String getWorkingHours() {
            return workingHours;
        }
    }

