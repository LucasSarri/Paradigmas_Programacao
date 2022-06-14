public class Principal{
    public static void main (String[]p){
        Interface umaI = new Interface();
        Funcionario umF;
        int nf = umaI.pegueQuantidade();
        
        for(int i = 1; i <= nf; i++){
            umF = umaI.contruaFuncionario();
            umaI.apresentaDemonstrativo();
        }
    }
}