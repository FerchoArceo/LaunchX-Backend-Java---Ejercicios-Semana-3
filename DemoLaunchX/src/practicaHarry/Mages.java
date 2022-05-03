package practicaHarry;

// Definicion fundamental de los magos.
public class Mages {
    private String house;
    private String gender;
    private String name;
    private String bogard;
    private String patronus;

    public Mages(){

    }

    public Mages(String house, String gender, String name, String bogard, String patronus){
        this.house = house;
        this.gender = gender;
        this.name = name;
        this.bogard = bogard;
        this.patronus = patronus;
    }

    public String getHouse(){  return house;  }
    public String getGender(){  return gender;  }
    public String getName(){  return name;  }
    public String getBogard(){  return bogard;  }
    public String getPatronus(){  return patronus;  }

    public boolean setHouse(String house){
        if(!house.isEmpty()){
            this.house = house;
            return true;
        } else return false;
    }

    public boolean setGender(String gender){
        if(!gender.isEmpty()){
            this.gender = gender;
            return true;
        } else return false;
    }

    public boolean setName(String name){
        if(!name.isEmpty()){
            this.name = name;
            return true;
        } else return false;
    }

    public boolean setBogard(String bogard){
        if(!bogard.isEmpty()){
            this.bogard = bogard;
            return true;
        } else return false;
    }

    public boolean setPatronus(String patronus){
        if(!patronus.isEmpty()){
            this.patronus = patronus;
            return true;
        } else return false;
    }

    public String showMessage(){
        return
                "What do we have in here? A new student!\nWelcome to Hogwarts School of Witchcraft and Wizardry! Here's your magic ID Card:\n"+
                        "House: "+house+"\n"+
                        "Gender: "+gender+"\n"+
                        "Name: "+name+"\n"+
                        "Bogard: "+bogard+"\n"+
                        "Patronus: "+patronus+"\n";
    }
}