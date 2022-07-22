import java.util.Scanner;
/**
 *
 * @author hiroshimori
 */
public class ProgramaLerTermos {

    public void main(String[] args) {
        mensagemTermos();
        String resposta = pegaResposta();
        validaResposta(resposta);
    }

    public static void mensagemTermos() {
       System.out.println("esse sao os termos \nbla\nbla\bla");
    }

    private static void instalaSoftware() {
        System.out.println("software instalado");
    }

    private static void cancelaSoftware() {
        System.out.println("software nao intalado");
    }
  
    public String pegaResposta(){
        Scanner leitor = new Scanner(System.in);
        String resposta;
        do{
            System.out.println("esta de acordo com os termos ? <s/n>");
            resposta = leitor.next();
        }while(!"n".equals(resposta) && !"s".equals(resposta));
        leitor.close();
        return resposta;
    }
    
    public void validaResposta(String resposta){
        if("s".equals(resposta)){
            instalaSoftware();
        }else{
            cancelaSoftware();
        }
    }
}
