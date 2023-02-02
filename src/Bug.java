public class Bug {
    String bugDesc;
    String user;
    int bugPrior;
    boolean bugStatus;
    String bugRealStatus;

    Bug(String bugDesc, String user, int bugPrior, boolean bugStatus) {
        System.out.println(bugDesc + user + bugPrior + bugStatus);
        this.bugDesc = bugDesc;
        this.user = user;
        this.bugPrior = bugPrior;
        this.bugStatus = bugStatus;
        if (bugStatus) {
            bugRealStatus = "zamkniety";
        } else {
            bugRealStatus = "otwarty";
        }
    }


    void getBugInfo() {
        System.out.println("Opis bledu: " + bugDesc + ". Osoba zglaszajaca: " + user + ". Priorytet bledu: " + bugPrior + ". Status bledu: " + bugRealStatus);
    }

    void getUser() {
        System.out.println(user);
    }

    void getBugStatus() {
        System.out.println("Status bledu: " + bugRealStatus);
    }


    void getBugPrior() {
        System.out.println("Priorytet bledu: " + bugPrior);

    }
}
