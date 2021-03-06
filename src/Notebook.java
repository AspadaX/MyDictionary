import java.util.ArrayList;

public class Notebook {

    private static Notebook notebook;
    private ArrayList<WordViewed> list = null;

    public static Notebook getInstance() {
        if(notebook == null)
            notebook = new Notebook();

        return notebook;
    }

    private Notebook() {
        list = new ArrayList<WordViewed>();
    }

    public ArrayList<WordViewed> getNotebook() {
        return this.list;
    }

    public void add(WordViewed value) {
        list.add(value);
    }
}