package characters;

public class Betan {
    private String name, surname, age;
    private InfAboutBetan infAboutBetan = new InfAboutBetan("сестра", "хорошие взаимоотношения");
    public Betan (String name, String surname, String age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    private class InfAboutBetan {
        private String degreeOfRelationship, relationShipsWithFamily;

        private InfAboutBetan(String degreeOfRelationship, String relationShipsWithFamily){
            this.degreeOfRelationship = degreeOfRelationship;
            this.relationShipsWithFamily = relationShipsWithFamily;
        }
    }
    public void talkWithPelle(){
        System.out.println("Там Бетан болтала со своим Пелле");
    }
    public void toMakeBetanAngry(){
        System.out.println("Это было сказано специально для того, чтобы позлить Бетан");
    }
}
