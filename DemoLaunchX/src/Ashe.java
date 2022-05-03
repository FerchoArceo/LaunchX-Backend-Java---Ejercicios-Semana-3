public class Ashe extends Champion implements AsheActionCallbacks{
    // Un constructor que coincide con el Super (de donde se hereda)
    public Ashe(int id, String name, String role, String difficulty, String description) {
        super(id, name, role, difficulty, description);
    }

    @Override
    public void frostShot(Screen s) {
        // Como aqui se encuentra la instrucción para hacer visible la ventana siempre se llamara primero esta habilidad
        s.setVisible(true);
        s.out(showMessage(), "Helvetica", 28, Colors.RoyalBlue);
        s.showImage("FrostShot.gif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void hawkShot(Screen s) {
        // Utilizando cls() y repaint() del paquete de la sherpa limpiamos la pantalla y ponemos algo nuevo, de lo contrario se agregan cosas hacia abajo
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Colors.RoyalBlue);
        s.showImage("HawkShot.gif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void rangerFocus(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Colors.RoyalBlue);
        s.showImage("RangerFocus.gif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void volley(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Colors.RoyalBlue);
        s.showImage("Volley.gif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void crystalArrow(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Colors.RoyalBlue);
        s.showImage("CrystalArrow.gif");
        s.setBounds(200,100,1100,900);
    }
}
