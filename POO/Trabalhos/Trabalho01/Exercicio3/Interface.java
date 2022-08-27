import javax.swing.*;

public class Interface {
    public Interface () {

    }
    public Ponto construaPonto () {
        String  valorX = JOptionPane.showInputDialog("valor x ");
        String  valorY = JOptionPane.showInputDialog("valor y ");
        double x = Double.parseDouble(valorX);
        double y = Double.parseDouble(valorY);
        return new Ponto (x,y);
    }
    public void menu (Retangulo retangulo) {
        String  menu = JOptionPane.showInputDialog("Entre com uma das opcoes a seguir: 1-Entrar com dados de retangulo \n 2-Retornar Perimetro \n 3-Retornar Area Retangulo \n 4-Retornar Diagonal Retangulo \n 5-Ponto dentro do Retangulo \n 6-Todos lados iguais ");
        int m = Integer.parseInt(menu);
        switch (m) {
            case 1:
                Ponto p1 = construaPonto ();
                Ponto p2 = construaPonto ();
                Retangulo ret = new Retangulo (p1,p2);
            break;
            case 2:
                double perimetro = retangulo.calculaPerimetro();
                System.out.println("O perimetro do retangulo e: "+perimetro);
            break;
            case 3:
                double area = retangulo.calculaArea();
                System.out.println("A area do retangulo e: "+area);
            break;
            case 4:
                double diagonal = retangulo.calculaDiagonal();
                System.out.println("A diagonal do retangulo e: "+diagonal);
            break;
            case 5:
                Ponto p3 = construaPonto();
                boolean dentro = retangulo.pontoDentro(p3);
                if (dentro) {
                    System.out.println("O ponto esta dentro do retangulo");
                }
                else{
                    System.out.println("O ponto nao esta dentro do retangulo");
                } 
            break;
            case 6:
                boolean iguais = retangulo.ladosIguais();
                if (iguais) {
                    System.out.println("Os lados sao iguais");
                }
                else{
                    System.out.println("Os lados nao sao iguais");
                } 
            break;
        }
    }
}