package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        new Nation();

        Nation firstNation = new Nation();
        firstNation.name = "Dacians";
        firstNation.peopleCount = 99000;

        Army daciansArmy = new Army();
        daciansArmy.militaryCount = 9000;

        firstNation.army = daciansArmy;


        Religion daciansReligion = new Religion();
        daciansReligion.name = "Zamolxianism";

        firstNation.religion = daciansReligion;


        Language daciansLanguage = new Language();
        daciansLanguage.name = "Dacian";

        firstNation.language = daciansLanguage;





        Nation secondNation = new Nation();
        secondNation.name = "Vikings";
        secondNation.peopleCount = 99000;

        Army vikingsArmy = new Army();
        vikingsArmy.militaryCount = 9000;

        secondNation.army = vikingsArmy;


        Religion vikingsReligion = new Religion();
        vikingsReligion.name = "Norse";

        secondNation.religion = vikingsReligion;

        Language vikingsLanguage = new Language();
        vikingsLanguage.name = "Germanic";

        secondNation.language = vikingsLanguage;








    }
}
