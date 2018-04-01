package aula07;
public class Lutador {
    //Atributos
    private String nome;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    //Métodos especiais

    public Lutador(String nome, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if(this.peso<52.2){
            this.categoria = "invalida";
        }else if(this.peso<=70.3){
            this.categoria ="leve";
        }else if(this.peso<=83.9){
            this.categoria = "medio";
        }else if(this.peso<=120.2){
            this.categoria = "pesado";
        }else{
            this.categoria = "invalido";
        }
        
        
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    //Métodos
    
    public void apresentar(){
        System.out.println("Lutador: "+this.getNome());
        System.out.println("Idade: "+this.getIdade()+" anos");
        System.out.println("Peso: "+this.getPeso()+" quilos");
        System.out.println("Altura "+this.getAltura()+" metros");
        System.out.println("Ganhou "+this.getVitorias()+" vezes");
        System.out.println("Empatou "+this.getEmpates()+" vezes");
        System.out.println("Perdeu "+this.getDerrotas()+" vezes");
    }
    
    public void status(){
        System.out.print(this.getNome());
        System.out.print(" é um peso "+this.getCategoria());
        System.out.print(" e possui "+this.getVitorias() +" vitórias,");
        System.out.print(this.getEmpates()+" empates e ");
        System.out.print(this.getDerrotas()+" derrotas");
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }
    
}
