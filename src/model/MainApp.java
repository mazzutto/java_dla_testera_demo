package model;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {

        BugReporter adam = new BugReporter("Adam", "Mazur", "mazut@o2.pl");
        List<Bug> bugs = new ArrayList<Bug>(
                List.of(
                        new Bug("Bug 3", adam, 1, true),
                        new Bug("Bug 3", adam, 1, true),
                        new Bug("Bug 2", new BugReporter("Magda", "Mazur", "magda@o2.pl"), 3, true),
                        new Bug("Bug 4", new BugReporter("Paweł", "Zwoliński", "pawel@o2.pl"), 6, false),
                        new Bug("Bug 7", new BugReporter("Mirek", "Zwoliński", "mirek@o2.pl"), 4, false),
                        new Bug("Bug 6", new BugReporter("Bożena", "Zwolińska", "bozena@o2.pl"), 2, true)

                )
        );


        for (int i=0; i<bugs.size(); i++) {
            for (int j = i + 1; j < bugs.size(); j++) {
                if (bugs.get(i).equals(bugs.get(j))) {
                    bugs.remove(i);
                    System.out.println("true");
                    Collections.sort(bugs, Comparator.comparing(Bug::getBugDesc));
                }
            }
        }
        for (Bug bug : bugs) {
            System.out.println(bug);
        }

        System.out.println();
        System.out.println();

        BugReporter adam2 = new BugReporter("Adam", "Mazur", "mazut@o2.pl");
        List<Bug> bugs2 = new ArrayList<Bug>(
                List.of(
                        new Bug("Bug 3", adam, 1, true),
                        new Bug("Bug 3", adam, 1, true),
                        new Bug("Bug 2", new BugReporter("Magda", "Mazur", "magda@o2.pl"), 3, true),
                        new Bug("Bug 4", new BugReporter("Paweł", "Zwoliński", "pawel@o2.pl"), 6, false),
                        new Bug("Bug 7", new BugReporter("Mirek", "Zwoliński", "mirek@o2.pl"), 4, false),
                        new Bug("Bug 6", new BugReporter("Bożena", "Zwolińska", "bozena@o2.pl"), 2, true)

                )
        );

        Set<Bug> bugSet = new TreeSet<>(bugs2);
        for (Bug bug : bugSet) {
        System.out.println(bug);}


    }}

