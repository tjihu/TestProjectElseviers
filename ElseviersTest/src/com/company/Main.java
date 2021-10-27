package com.company;

public class Main {
    public static String[] names;

    public static void main(String[] args) {

        //list of the test names.
        names = new String[]{"John Doe", "Doe, John", "Hans-Christian Jensen", "H-C Jensen", "P. H. Kristensen",
                "Kristensen, P. H.", "Peter Hans Kristensen", "Peter H. Kristensen"};

        // class in charge of checking the names.
        NameChecker nc = new NameChecker();

        //loops through the test name list and prints out the first name and last name of each.
        for (String name: names
             ) {
            AuthorName ac = nc.SeperateName(name);
            ac.MyNameIs();
        }

    }
}
