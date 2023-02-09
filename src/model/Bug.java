package model;

import java.util.Objects;

public class Bug implements ConsoleNotification, Comparable<Bug>{
    private String bugDesc;
    private BugReporter bugReporter;
    private int bugPrior;
    private boolean bugStatus;
    private String bugRealStatus;

    public String getBugDesc() {
        return bugDesc;
    }

    public void setBugDesc(String bugDesc) {
        if (bugDesc.length() < 10) {
            System.out.println("Opis za krótki");
        } else {
            this.bugDesc = bugDesc;
        }
    }


    public int getBugPrior() {
        return bugPrior;
    }

    public void setBugPrior(int bugPrior) {
        if (bugPrior < 1 || bugPrior > 5) {
            System.out.println("Nieprawidłowa wartość priorytetu (1-5)");
        } else {

            notifyStatusChange();
            this.bugPrior = bugPrior;

        }
    }

    public boolean isBugStatus() {
        return bugStatus;
    }

    public void setBugStatus(boolean bugStatus) {
        this.bugStatus = bugStatus;
    }

    public String getBugRealStatus() {
        return bugRealStatus;
    }

    public void setBugRealStatus(String bugRealStatus) {
        this.bugRealStatus = bugRealStatus;
    }

    public Bug(String bugDesc, BugReporter bugReporter, int bugPrior, boolean bugStatus) {
//        System.out.println(bugDesc + bugReporter + bugPrior + bugStatus);
        this.bugDesc = bugDesc;
        this.bugReporter = bugReporter;
        this.bugPrior = bugPrior;
        this.bugStatus = bugStatus;
        if (bugStatus) {
            bugRealStatus = "zamkniety";
        } else {
            bugRealStatus = "otwarty";
        }
    }


    public void getBugInfo() {
        System.out.println("Opis bledu: " + bugDesc + ". Osoba zglaszajaca: " + bugReporter + ". Priorytet bledu: " + bugPrior + ". Status bledu: " + bugRealStatus);
    }

    public BugReporter getBugReporter() {
        return bugReporter;
    }

    public void setBugReporter(BugReporter bugReporter) {
        this.bugReporter = bugReporter;
    }

    public void get2User() {
        System.out.println(bugReporter);
    }

    public void getBugStatus() {
        System.out.println("Status bledu: " + bugRealStatus);
    }


    public void get2BugPrior() {
        System.out.println("Priorytet bledu: " + bugPrior);

    }

    @Override
    public String toString() {
        return "Bug{" +
                "bugDesc='" + bugDesc + '\'' +
                ", bugReporter=" + bugReporter +
                ", bugPrior=" + bugPrior +
                ", bugStatus=" + bugStatus +
                ", bugRealStatus='" + bugRealStatus + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bug bug = (Bug) o;
        return bugPrior == bug.bugPrior && bugStatus == bug.bugStatus && Objects.equals(bugDesc, bug.bugDesc) && Objects.equals(bugReporter, bug.bugReporter) && Objects.equals(bugRealStatus, bug.bugRealStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bugDesc, bugReporter, bugPrior, bugStatus, bugRealStatus);
    }

    @Override
    public int compareTo(Bug bug) {
        int compareResult = this.getBugDesc().compareTo(bug.getBugDesc());

        return compareResult;
    }
}
