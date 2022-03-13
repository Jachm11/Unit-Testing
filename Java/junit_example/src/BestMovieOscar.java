public class BestMovieOscar {

    //Propieties

    private int year;
    private String name;
    private String director;
    private String genre;

    //Constructor

    public BestMovieOscar(int year){
        if (year >= 2010 & year <=2020 ){

            this.year = year ;

            setName(year);
            setDirector(year);
            setGenre(year);
        }
        else{
            throw new IllegalArgumentException("The year entered is not currently available");
        }
    }

    //Methods

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public Object[] getInfo(){

     Object[] arr = new Object[4];

     arr[0] = this.year;
     arr[1] = this.name;
     arr[2] = this.director;
     arr[3] = this.genre;

     return arr;
    }

    private void setName(int year) {

        if(year == 2010){
            this.name = "The King's Speech";
        }
        else if (year == 2011){
             this.name = "The Artist";
        }
        else if (year == 2012){
             this.name = "Argo";
        }
        else if (year == 2013){
             this.name = "12 Years a Slave";
        }
        else if (year == 2014){
             this.name = "Birdman";
        }
        else if (year == 2015){
             this.name = "Spotlight";
        }
        else if (year == 2016){
             this.name = "Moonlight";
        }
        else if (year == 2017){
             this.name = "The Shape of Water";
        }
        else if (year == 2018){
             this.name = "Green Book";
        }
        else if (year == 2019){
             this.name = "Parasite";
        }
        else if (year == 2020){
             this.name = "Nomadland";
        }    
    }

    private void setDirector(int year) {
        if(year == 2010){
            this.director = "Tom Hooper";
        }
        else if (year == 2011){
             this.director = "Michel Hazanavicius";
        }
        else if (year == 2012){
             this.director = "Ben Affleck";
        }
        else if (year == 2013){
             this.director = "Steve McQueen	";
        }
        else if (year == 2014){
             this.director = "Alejandro González Iñárritu";
        }
        else if (year == 2015){
             this.director = "Tom McCarthy";
        }
        else if (year == 2016){
             this.director = "Barry Jenkins";
        }
        else if (year == 2017){
             this.director = "Guillermo del Toro";
        }
        else if (year == 2018){
             this.director = "Peter Farrelly";
        }
        else if (year == 2019){
             this.director = "Bong Joon-ho";
        }
        else if (year == 2020){
             this.director = "Chloé Zhao";
        }
     }

    private void setGenre(int year) {
        if(year == 2010){
            this.genre = "Historical drama";
        }
        else if (year == 2011){
             this.genre = "Romantic comedy";
        }
        else if (year == 2012){
             this.genre = "Drama";
        }
        else if (year == 2013){
             this.genre = "Drama";
        }
        else if (year == 2014){
             this.genre = "Dramatic comedy";
        }
        else if (year == 2015){
             this.genre = "Drama";
        }
        else if (year == 2016){
             this.genre = "Drama";
        }
        else if (year == 2017){
             this.genre = "Fantasy";
        }
        else if (year == 2018){
             this.genre = "Dramatic comedy";
        }
        else if (year == 2019){
             this.genre = "Drama";
        }
        else if (year == 2020){
             this.genre = "Drama";
        }
    }

}
