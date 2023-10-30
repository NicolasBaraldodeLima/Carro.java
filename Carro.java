public class Carro {

    private float largura;
    private float alutra;
    private float comprimento;
    private String marca;
    private String modelo;

    private Fabricante fabricante;

    private boolean perdaTotal;

    public void deuPT() {
        this.perdaTotal = true;
    }

    public void  naoDeuPT() {
        this.perdaTotal = false;
    }
}
