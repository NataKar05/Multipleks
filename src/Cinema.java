public class Cinema {

    private final String name;
    private final String address;


    //Tworzenie konstruktora, który jest specjalną metodą
    //uruchamianą przy tworzeniu obiektu tej klasy.
    public Cinema(String name, String address) {

        //Słowo kluczowe "this" w Javie oznacza "bieżący obiekt klasy".
        this.name = name;
        this.address = address;

    }

}
