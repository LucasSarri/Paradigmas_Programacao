public class Principal {
    public static void main (String[] args) {
        double raio, volume;    
        Interface interface_obj = new Interface ();
        Esfera esfera_obj = new Esfera ();

        raio = interface_obj.pegaRaio();
        esfera_obj.recebeRaio(raio);
        volume = esfera_obj.calculaVolume();
        interface_obj.imprimeVolume (volume);

    }
}