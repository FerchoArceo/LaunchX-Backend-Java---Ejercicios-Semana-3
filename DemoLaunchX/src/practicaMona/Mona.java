package practicaMona;

// Clase padre de los octocats
class Octocats {
    String nombre;
    int noPiernas;
    int noBrazos;

    Octocats(String nombre, int noPiernas, int noBrazos){
        this.nombre = nombre;
        this.noPiernas = noPiernas;
        this.noBrazos = noBrazos;
    }
}

public class Mona extends Octocats {
    String aficcion;
    String accesorios;
    String paletaDeColores;

    Mona(String nombre, int noPiernas, int noBrazos, String aficcion, String accesorios, String paletaDeColores){
        super(nombre,noPiernas,noBrazos);
        this.aficcion = aficcion;
        this.accesorios = accesorios;
        this.paletaDeColores = paletaDeColores;
    }

    void display(){
        System.out.println("Tu propia version de Mona!\n"+
                "Nombre: "+nombre+"\n"+
                "Cantidad de piernas: "+noPiernas+"\n"+
                "Cantidad de brazos: "+noBrazos+"\n\n"+
                "Que le hace difrente?\n"+
                "Es aficionade a: "+aficcion+"\n"+
                "Lleva consigo: "+accesorios+"\n"+
                "Y es de estos colores: "+paletaDeColores+"\n\n"
        );
    }
}

class TestMona{
    public static void main(String[] args) {
        Mona astrocat = new Mona(
                "Astrocat",
                4,
                4,
                "La ciencia ficcion y el espacio",
                "Un casco espacial, bombona de oxigeno, comida en pasta sabor alitas picantes",
                "Piel color ruby como sus galaxias favoritas y ojos color celeste"
        );
        Mona gamercat = new Mona(
                "Gamercat",
                2,
                6,
                "Los videojuegos y la cultura de internet",
                "Steam Deck, Audifonos 7.1, perifericos de sus consolas favoritas para aprovechar sus 6 brazos",
                "Piel RGB cambiante"
        );
        astrocat.display();
        gamercat.display();
    }
}