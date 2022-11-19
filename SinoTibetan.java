//Sub-class of Langugae
class SinoTibetan extends Language {

    //Constructor
    public SinoTibetan (String languageName, int speakers) {

        super(languageName, speakers, "Asia", "subject-object-verb");

        //If the language is Chinese, change the word order to subject-verb-object
        if(this.name.contains("Chinese")) {
            this.wordOrder = "subject-verb-object";
        }
    }


}