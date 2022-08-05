public class Interface {
    public Interface (){}
    public Ponto construaPonto () {
        String vX = JOptionPane.showInputDialog("valor de x ");
        double x = Double.parseDouble(vX);
        String vY = JOptionPane.showInputDialog("valor de y ");
        double y = Double.parseDouble(vy);

        return new Ponto (x,y);
    }
}