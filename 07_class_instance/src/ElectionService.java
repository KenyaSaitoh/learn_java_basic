class ElectionService {
    boolean canRunForElection(Person3 person) {
        int age = person.age;
        String nationality = person.nationality;
        if (25 <= age && nationality.equals("JAPAN")) {
            return true;
        }
        return false;
    }
}