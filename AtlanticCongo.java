//Subclass of Language class
class AtlanticCongo extends Language {

    //Constructor
    public AtlanticCongo(String languageName, int speakers) {
        super(languageName, speakers, "Africa", "subject-verb-object");
    }

    //Override getInfo()
    @Override
    public void getInfo() {
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ". \nThe language follows the word order: " + this.wordOrder + ".\n" + "Fun fact: " + this.name + " is the largest demonstrated family of languages in Africa");
    }
}