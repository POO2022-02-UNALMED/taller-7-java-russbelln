package comunicacion;

public class Alfabeto extends Pictograma{
    private String letras[];
    private String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    public int cantidadLetras(){
        return this.letras.length;
    }

    public String interpretacion(){
        return this.interpretacion;
    }

    @Override
    public String toString() {
        String texto="";
        for (String i:
             this.letras) {
            texto= texto+", "+i;
        }
        return texto;
    }
}
