package Composite;

public abstract class Composante {
    protected String name ;
    protected int level =0;
    abstract void afficher();
    public String getTab(){
        String tab = "";
        for (int i = 0; i < level; i++) {
            tab = tab + "\t";
        }
        return  tab ;
    }
   public Composante(String name){
        this.name=name ;
   }
}
