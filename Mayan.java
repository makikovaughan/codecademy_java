//Sub-class of Language
class Mayan extends Language {

    //Constructor
    public Mayan(String languageName, int speakers) {
        super(languageName, speakers, "Central America", "verb-object-subject");
    }

    //Override getInfo()
    @Override
    public void getInfo() {
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ". \nThe language follows the word order: " + this.wordOrder + ".\n" + "Fun fact: " + this.name + " is an ergative language.");
    }
}