/*
Language.java: for the Language parent class, which serves as the template for all languages.
*/
public class Language {

    //Instance variable
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    //Language constructor to sets each field to the value passed in
    public Language(String name, int numSpeakers, String regionsSpoken, String wordOrder) {
        this.name = name;
        this.numSpeakers = numSpeakers;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;
    }

    //Render to display all of its information (using its field values).
    public void getInfo() {
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ". \nThe language follows the word order: " + this.wordOrder + ".");
    }

    //main methond
    public static void main(String[] args) {

        //Instantiation
        Mayan myLanguage = new Mayan("Ki'che'", 2330000);
        SinoTibetan myLanguage2 = new SinoTibetan("Mandarin Chinese", 5000000);
        SinoTibetan myLanguage3 = new SinoTibetan("Japanese", 2000000);
        AtlanticCongo myLanguage4 = new AtlanticCongo("Congo", 5000000);

        //call getInfo()
        myLanguage.getInfo();
        myLanguage2.getInfo();
        myLanguage3.getInfo();
        myLanguage4.getInfo();
    }


}