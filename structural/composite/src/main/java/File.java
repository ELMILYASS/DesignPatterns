public class File extends Composante {

    public File(String name) {
        super(name);
    }

    @Override
    void afficher() {

        System.out.println(getTab()+"- File => +" + name);
    }
}
