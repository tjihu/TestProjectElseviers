package com.company;
import java.util.regex.Pattern;

public class NameChecker {

    public AuthorName SeperateName(String name){
        AuthorName authorname = new AuthorName();
        // checks for first name and last name
        if(Pattern.matches("\\w* \\w*", name)) {
            String[] splitName = name.split(" ");

            authorname.FirstName = splitName[0];
            authorname.LastName = splitName[1];
        }
        // checks for last name then first name
        if(Pattern.matches("\\w*, \\w*", name)){
            String[] splitName = name.split(", ");

            authorname.FirstName = splitName[1];
            authorname.LastName = splitName[0];
        }
        // checks for double first name with - as the seperator
        if(Pattern.matches("\\w*-\\w* \\w*", name)){
            String[] splitName = name.split(" ");

            authorname.FirstName = splitName[0];
            authorname.LastName = splitName[1];
        }
        // checks for double initials as first name
        if(Pattern.matches("\\w\\. \\w\\. \\w*", name)){
            String[] splitName = name.split(" ");

            authorname.FirstName = splitName[0];
            authorname.FirstName += splitName[1];
            authorname.LastName = splitName[2];
        }
        // checks for last name then double initials
        if(Pattern.matches("\\w*\\, \\w\\. \\w\\.", name)){
            String[] splitName = name.split("\\, ");

            authorname.FirstName = splitName[1];
            authorname.LastName = splitName[0];
        }
        //checks for first name, middle name then last name
        if(Pattern.matches("\\w* \\w* \\w*", name)){
            String[] splitName = name.split(" ");

            authorname.FirstName = splitName[0];
            authorname.FirstName += " ";
            authorname.FirstName += splitName[1];
            authorname.LastName = splitName[2];
        }
        // checks for middle name with an initial as middle name
        if(Pattern.matches("\\w* \\w\\. \\w*", name)){
            String[] splitName = name.split(" ");

            authorname.FirstName = splitName[0];
            authorname.FirstName += " ";
            authorname.FirstName += splitName[1];
            authorname.LastName = splitName[2];
        }
        //returns the authorname from the start
        return authorname;
    }
}
