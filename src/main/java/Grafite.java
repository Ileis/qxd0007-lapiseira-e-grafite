public class Grafite{

    public enum Dureza{
        G_HB,
        G_2B,
        G_4B,
        G_6B;

    }

    private float calibre;
    private Dureza dureza;
    private int tamanho;

    public Grafite(float calibre, Dureza dureza, int tamanho){
        this.calibre = calibre;
        this.dureza = dureza;
        this.tamanho = tamanho;
    }

    public int desgastePorFolha(){
        switch(this.dureza){
            case G_HB:
                return 1;

            case G_2B:
                return 2;

            case G_4B:
                return 4;

            case G_6B:
                return 6;

            default:
                return 0;
        }
    }

    public Dureza getDureza(){
        return dureza;
    }

    public float getCalibre(){
        return calibre;
    }

    public int getTamanho(){
        return tamanho;
    }

    public void setTamanho(int tamanho){
        this.tamanho -= tamanho;
    }

    @Override
    public String toString(){
        return "Grafite{" +
                "calibre=" + calibre +
                ", dureza=" + dureza +
                ", tamanho=" + tamanho +
                '}';
    }
}
