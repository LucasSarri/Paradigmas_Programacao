importe java.util.*;
public class Principal {
    public static void main (String[] p) {
        Interface interface_obj = new Interface();
        Aluno aluno_obj = new Aluno ();
        float media;
        char resp;
        do {
            aluno_obj = inteface_obj.pegueAluno ();
            media = aluno_obj.forneceMedia();
            if (aluno_obj.foiAprovado(6.0f)) {
                interface_obj.mostreResultado(aluno_obj.informeNome()+' '+media+' Aprovado');
            }
            else {
                interface_obj.mostreResultado(aluno_obj.informeNome()+' '+media+' Reprovado');
            }
            resp = interface_obj.temMais();
        } while (resp == 's' || resp == 'S');
    }
}