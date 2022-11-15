public class Main {
    /*
        This program generates a mad libbed story.
        Author: Makiko Vaughan
        Date: 11/11/2022
    */
    public static void main(String[] args) {
        //Initialize all variables
        String name1 = "Kiku";
        String adjective1 = "beautiful";
        String adjective2 = "shy";
        String adjective3 = "happy";
        String verb1 = "run";
        String noun1 = "cat";
        String noun2 = "dog";
        String noun3 = "lion";
        String noun4 = "tiger";
        String noun5 = "rabbit";
        String noun6 = "robot";
        String name2 = "Toku";
        int number = 100;
        String place1 = "Tokyo";


        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores.\nThey began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+".\nConcerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+".\n"+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

        //Render the story
        System.out.println(story);
    }
}