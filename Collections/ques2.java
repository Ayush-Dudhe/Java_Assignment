public class DupsFinal {
public static void main(String[] args) {
    SortedSet<String> dupsEliminated = new TreeSet<String>(IGNORE_CASE);        

    for (String a : args) {
           dupsEliminated.add(a);
    }
    System.out.println(dupsEliminated.size() + " distinct words : " + dupsEliminated);
}

static final Comparator<String> IGNORE_CASE = new Comparator<String>() {
    public int compare(String s1, String s2) {
        return s1.compareToIgnoreCase(s2);
    }
};