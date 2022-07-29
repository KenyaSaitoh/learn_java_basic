class ElectionService {
    boolean canRunForElection(Person person) {
        if (25 <= person.age && person.equals("JAPAN")) {
            return true;
        }
        return false;
    }
}
