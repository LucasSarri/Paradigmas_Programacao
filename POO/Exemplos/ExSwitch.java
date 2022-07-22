public class ExSwitch {
    char conceito;
    int aprovado = 0;
    String mensagem;
    
    switch (conceito) {
        case 'a':
            mensagem = 'Excelente';
            aprovado = 1;
        break;
        case 'b':
            mensagem = 'Bom';
            aprovado = 1;
        break;
        case 'c':
            mensagem = 'Regular';
            aprovado = 1;
        break;
        case 'd':
            mensagem = 'insuficiente';
        break;
    }
}