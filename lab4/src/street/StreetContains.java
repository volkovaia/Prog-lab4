package street;
//Vulkanusgatan 1

public abstract class StreetContains {
    private String address, buildings, people;

    StreetContains(String address, String buildings, String people) {
        this.address = address;
        this.buildings = buildings;
        this.people = people;
    }

    public static class FriendsOnTheStreet extends StreetContains {
        public FriendsOnTheStreet(String address, String buildings, String people) {
            super(address, buildings, people);
            System.out.println("Кристера и Гуниллы нет на улице");

        }

    }


    public static class BoysAtTheEntrance extends StreetContains {
        public BoysAtTheEntrance(String address, String buildings, String people) {
            super(address, buildings, people);
            System.out.println("У подъезда возились мальчишки, кроме них, на улице никого не было");

        }
    }
}