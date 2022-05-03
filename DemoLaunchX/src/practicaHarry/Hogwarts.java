package practicaHarry;

// Uso/Creacion de los magos
public class Hogwarts {
    public static void main(String[] args) {
        Mages Luna = new Mages();
        Luna.setName("Luna Lovegood");
        Luna.setGender("Female");
        Luna.setHouse("Ravenclaw");
        Luna.setBogard("Unknown");
        Luna.setPatronus("Hare");
        System.out.println(
                "What do we have in here? A new student!\nWelcome to Hogwarts School of Witchcraft and Wizardry! Here's your magic ID Card:\n"+
                "House: "+Luna.getHouse()+"\n"+
                "Gender: "+Luna.getGender()+"\n"+
                "Name: "+Luna.getName()+"\n"+
                "Bogard: "+Luna.getBogard()+"\n"+
                "Patronus: "+Luna.getPatronus()+"\n"
        );

        Mages Harry = new Mages("Gryffindor", "Male", "Harry James Potter", "Dementor", "Stag");
        Mages Ron = new Mages("Gryffindor", "Male", "Ronald Bilius Weasley", "Aragog", "Jack Russell terrier");
        Mages Hermione = new Mages("Gryffindor", "Female", "Hermione Jean Granger", "Failure", "Otter");
        Mages Albus = new Mages("Gryffindor", "Male", "Albus Percival Wulfric Brian Dumbledore", "The corpse of his sister, Ariana", "Phoenix");

        System.out.println(Harry.showMessage());
        System.out.println(Ron.showMessage());
        System.out.println(Hermione.showMessage());
        System.out.println(Albus.showMessage());
    }
}
