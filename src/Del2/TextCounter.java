package Del2;

public class TextCounter {
    //attribut för antal radar
    //attribut för antal tecken
    private  int rows ;
    private int Characters;

    public void addText(String Text) {
        //lägg till 1 till ett attribut
        // lägg till antal tecken
        rows ++;
        Characters += Text.length();
    }
    public  int getRows() {
        //returnera attribut
        return rows;
    }
    public int getCharactersnumbers() {
        //returena antaltecken
        return Characters;
    }
}
