public class Aluno extends Pessoa {
    protected float nota1, nota2, nota3;
    public Aluno (String vNome, char vSexo, int vIdade, float vN1, float vN2, float vN3) {
        super(vNome, vSexo, vIdade);
        if (vN1 < 0) {
            nota1 = 0.0f;
        }
        else if (vN1 > 10) {
            nota1 = 10.0f;
        }
        if (vN2 < 0) {
            nota2 = 0.0f;
        }
        else if (vN2 > 10) {
            nota2 = 10.0f;
        }
        if (vN3 < 0) {
            nota3 = 0.0f;
        }
        else if (vN3 > 10) {
            nota3 = 10.0f;
        }
    }
    public float informeNota1 () {
        return nota1;
    }
    public float informeNota2 () {
        return nota2;
    }
    public float informeNota3 () {
        return nota3;
    }
    public void recebaValorNota1 (float n1) {
        if (n1 >= 0 && n1 <= 10) {
            nota1 = n1;
        }
    }
    public void recebaValorNota2 (float n2) {
        if (n2 >= 0 && n2 <= 10) {
            nota2 = n2;
        }
    }
    public void recebaValorNota3 (float n3) {
       if (n3 >= 0 && n3 <= 10) {
            nota3 = n3;
        }
    }
    public void forneceMedia () {
        float media;
        media = (nota1 + nota2 + nota3) / 3;
        return media;
    }
    public boolean foiAprovado (float criterio) {
        if (this.forneceMedia() >= criterio) {
            return true;
        }
        else {
            return false;
        }
    }
}