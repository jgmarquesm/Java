public class Twofer {
    public String twofer(String name) {
        String nome = name == null ? "you" : name;
        /*if (name == null){
            name = "you";
        }*/
        return "One for "+ nome + ", one for me."; 
    }
}
