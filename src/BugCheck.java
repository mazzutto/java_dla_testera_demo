public class BugCheck {
    public static void main(String[] args) {
        Bug pierwszy = new Bug("niepoprawny napis", "Antek", 2, true);
        pierwszy.getBugInfo();
        pierwszy.getUser();
        pierwszy.getBugStatus();
        pierwszy.getBugPrior();
    }
}
