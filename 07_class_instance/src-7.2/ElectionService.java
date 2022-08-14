class ElectionService {
    boolean canRunForElection(Person2 person) {
        if (25 <= person.age && person.equals("JAPAN")) {
            return true;
        }
        return false;
    }
}
