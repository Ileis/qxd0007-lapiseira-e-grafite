public class Lapiseira{

    private final float calibre;
    private Grafite grafite;
    private int folhas;

    public Lapiseira(float calibre){
        this.calibre = calibre;
    }

    public boolean inserir(Grafite grafite){
        if(grafite.getCalibre() == getCalibre() && this.grafite == null){
            this.grafite = grafite;
            this.folhas = 0;

            return true;
        }
        return false;
    }

    public boolean remover(){
        if(this.grafite != null){
            this.grafite = null;

            return true;
        }
        return false;
    }

    public boolean escrever(int folhas){
        if(grafite != null){
            if(this.grafite.desgastePorFolha() * folhas <= this.grafite.getTamanho()){
                this.folhas += folhas;
                this.grafite.setTamanho(this.grafite.desgastePorFolha() * folhas);

                if(this.grafite.getTamanho() == 0)
                    this.grafite = null;

                return true;
            }else{
                this.folhas += this.grafite.getTamanho() / this.grafite.desgastePorFolha();
                this.grafite = null;
            }
        }
        return false;
    }

    public Grafite getGrafite(){
        return grafite;
    }

    public float getCalibre(){
        return calibre;
    }

    public int getFolhasEscritas(){
        return folhas;
    }

    @Override
    public String toString(){
        return "Lapiseira{" +
                "calibre=" + calibre +
                ", grafite=" + grafite +
                '}';
    }
}
