
public class App {
    public static void main(String[] args) {
    Video[] v = new Video[3];    
    v[0] = new Video("Aula de POO");
    v[1] = new Video("Aula de praticar");
    v[2] = new Video("Criando um projeto em Java");
   
    Gafanhoto[] g = new Gafanhoto[2];
    g[0] = new Gafanhoto("Leo", 23, "M", "lleo132");
    g[1] = new Gafanhoto("Paula", 22, "F", "PaulaAlves");

   // System.out.println("-------Gafanhotos---------");
   // System.out.println(g[0].toString());
   // System.out.println(g[1].toString());
   // System.out.println("\n--------------VIDEOS-----------");    
   // System.out.println(v[0].toString());
   // System.out.println(v[1].toString());    
   // System.out.println(v[2].toString());

    Visualizacao[] vi = new Visualizacao[5];
    vi[0] = new Visualizacao(g[0], v[2]);
    v[2].play();
    vi[0].avaliar();
    System.out.println(vi[0].toString());
    
    vi[1] = new Visualizacao(g[0], v[1]);
    v[1].play();
    vi[0].avaliar(87.0f);
    System.out.println(vi[1].toString());









    }
}
