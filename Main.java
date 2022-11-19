import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Movies movie01 = new Movies();
        Movies movie02 = new Movies();
        Movies movie03 = new Movies();
        Movies movie04 = new Movies();

        TVSeries tvseries01 = new TVSeries();
        TVSeries tvseries02 = new TVSeries();

        Documentaries documentaries01 = new Documentaries();
        Documentaries documentaries02 = new Documentaries();

        movie01.title = "The Godfather";
        movie01.director = "Francis Ford Coppola";
        movie01.genre = "Crime, Drama";
        movie01.actors[0] = "Marlon Brando, Al Pacino, James Caan";
        movie01.description = "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.";
        movie01.category = "Movie";
        movie01.year = 1972;
        movie01.rating = 9.2;

        movie02.title = "Avengers: Endgame";
        movie02.director = "Anthony Russo, Joe Russo";
        movie02.genre = "Action, Adventure, Drama";
        movie02.actors[0] = "Robert Downey Jr., Chris Evans, Mark Ruffalo";
        movie02.description = "After the devastating events of Avengers: Infinity War (2018), the universe is in ruins due to the efforts of the Mad Titan, Thanos.";
        movie02.category = "Movie";
        movie02.year = 2019;
        movie02.rating = 8.4;

        movie03.title = "Mr. Bean's Holiday";
        movie03.director = "Steve Bendelack";
        movie03.genre = "Comedy";
        movie03.actors[0] = "Rowan Atkinson, Willem Dafoe, James Faulkner";
        movie03.description = "Mr. Bean wins a trip to Cannes where he unwittingly";
        movie03.category = "Movie";
        movie03.year = 2007;
        movie03.rating = 6.6;

        movie04.title = "anabelle";
        movie04.director = "John R. Leonetti";
        movie04.genre = "Horror, Mystery, Thriller";
        movie04.actors[0] = "Annabelle Wallis, Ward Horton, Tony Amendola";
        movie04.description = "A couple begins to experience terrifying supernatural occurrences involving a vintage doll shortly after their home is invaded by satanic cultists.";
        movie04.category = "Movie";
        movie04.year = 2014;
        movie04.rating = 5.4;

        String[] movieName = {movie01.title, movie02.title, movie03.title, movie04.title};
        Object[] addMovie01 = {"title : ", movie01.title, "director : ", movie01.director, "genre : ", movie01.genre, "actors : ", movie01.actors[0], "description : ", movie01.description, "category : ", movie01.category, "year : ", movie01.year, "rating : ", movie01.rating};
        Object[] addMovie02 = {"title : ", movie02.title, "director : ", movie02.director, "genre : ", movie02.genre, "actors : ", movie02.actors[0], "description : ", movie02.description, "category : ", movie02.category, "year : ", movie02.year, "rating : ", movie02.rating};
        Object[] addMovie03 = {"title : ", movie03.title, "director : ", movie03.director, "genre : ", movie03.genre, "actors : ", movie03.actors[0], "description : ", movie03.description, "category : ", movie03.category, "year : ", movie03.year, "rating : ", movie03.rating};
        Object[] addMovie04 = {"title : ", movie04.title, "director : ", movie04.director, "genre : ", movie04.genre, "actors : ", movie04.actors[0], "description : ", movie04.description, "category : ", movie04.category, "year : ", movie04.year, "rating : ", movie04.rating};

        tvseries01.title = "Game of Thrones";
        tvseries01.director = "David Benioff, D.B. Weiss";
        tvseries01.genre = "Adventure, Drama, Fantasy";
        tvseries01.actors[0] = "Emilia Clarke, Peter Dinklage, Kit Harington";
        tvseries01.description = "Nine noble families fight for control over the mythical lands of Westeros, while an ancient enemy returns after being dormant for thousands of years.";
        tvseries01.category = "TV Series";
        tvseries01.year = 2011;
        tvseries01.rating = "TV-MA";

        tvseries02.title = "Breaking Bad";
        tvseries02.director = "Vince Gilligan";
        tvseries02.genre = "Crime, Drama, Thriller";
        tvseries02.actors[0] = "Bryan Cranston, Anna Gunn, Aaron Paul";
        tvseries02.description = "A high school chemistry teacher diagnosed with inoperable lung cancer turns to manufacturing and selling methamphetamine in order to secure his family's future.";
        tvseries02.category = "TV Series";
        tvseries02.year = 2008;
        tvseries02.rating = "TV-MA";

        String[] tvseriesName = {tvseries01.title, tvseries02.title};
        Object[] addTVSeries01 = {"title : ", tvseries01.title, "director : ", tvseries01.director, "genre : ", tvseries01.genre, "actors : ", tvseries01.actors[0], "description : ", tvseries01.description, "category : ", tvseries01.category, "year : ", tvseries01.year, "rating : ", tvseries01.rating};
        Object[] addTVSeries02 = {"title : ", tvseries02.title, "director : ", tvseries02.director, "genre : ", tvseries02.genre, "actors : ", tvseries02.actors[0], "description : ", tvseries02.description, "category : ", tvseries02.category, "year : ", tvseries02.year, "rating : ", tvseries02.rating};


        documentaries01.title = "The Last Dance";
        documentaries01.director = "Jason Hehir";
        documentaries01.genre = "Documentary, Sport";
        documentaries01.actors[0] = "Michael Jordan, Scottie Pippen, Dennis Rodman";
        documentaries01.description = "A 10-part documentary series chronicling the untold story of Michael Jordan and the Chicago Bulls dynasty with rare, never-before-seen footage and sound from the 1997-98 championship season - plus over 100 interviews with legendary figures and NBA insiders who took viewers behind the scenes.";
        documentaries01.category = "Documentary";
        documentaries01.year = 2020;
        documentaries01.rating = "TV-14";

        documentaries02.title = "The Social Dilemma";
        documentaries02.director = "Jeff Orlowski";
        documentaries02.genre = "Documentary";
        documentaries02.actors[0] = "Jeff Orlowski, Tristan Harris, Roger McNamee";
        documentaries02.description = "An in-depth look at the dangerous human impact of social networking, with tech experts sounding the alarm on their own creations.";
        documentaries02.category = "Documentary";
        documentaries02.year = 2020;
        documentaries02.rating = "TV-MA";

        String[] documentariesName = {documentaries01.title, documentaries02.title};
        Object[] addDocumentaries01 = {"title : ", documentaries01.title, "director : ", documentaries01.director, "genre : ", documentaries01.genre, "actors : ", documentaries01.actors[0], "description : ", documentaries01.description, "category : ", documentaries01.category, "year : ", documentaries01.year, "rating : ", documentaries01.rating};
        Object[] addDocumentaries02 = {"title : ", documentaries02.title, "director : ", documentaries02.director, "genre : ", documentaries02.genre, "actors : ", documentaries02.actors[0], "description : ", documentaries02.description, "category : ", documentaries02.category, "year : ", documentaries02.year, "rating : ", documentaries02.rating};

        Scanner input = new Scanner(System.in);

        String userName;
        long category;
        int index;

        System.out.println("Welcome to the my video streaming app!");
        System.out.print("Please enter your name : ");
        userName = input.nextLine();
        System.out.println("Hello " + userName + "!");
        System.out.println("Please choose the category you want to watch : ");
        System.out.println("1. Movie");
        System.out.println("2. TV Series");
        System.out.println("3. Documentary");
        System.out.print("Your choice : ");

        category = input.nextLong();
        System.out.println("");
        
        if (category == 1) {
            System.out.println("Please choose the movie you want to watch : ");
            for (int i = 0; i < movieName.length; i++) {
                System.out.println(i + 1 + "." + movieName[i]);
            }
            System.out.print("Your choice : ");
            System.out.println("");
            index = input.nextInt();
            if (index == 1) {
                System.out.println("You choose " + movieName[index - 1]);
                System.out.println("Here is the detail of the movie : ");
                for (int i = 0; i < addMovie01.length; i++) {
                    System.out.println(addMovie01[i]);
                }
            } else if (index == 2) {
                System.out.println("You choose " + movieName[index - 1]);
                System.out.println("Here is the detail of the movie : ");
                for (int i = 0; i < addMovie02.length; i++) {
                    System.out.println(addMovie02[i]);
                }
            } else if (index == 3) {
                System.out.println("You choose " + movieName[index - 1]);
                System.out.println("Here is the detail of the movie : ");
                for (int i = 0; i < addMovie03.length; i++) {
                    System.out.println(addMovie03[i]);
                }
            } else if (index == 4) {
                System.out.println("You choose " + movieName[index - 1]);
                System.out.println("Here is the detail of the movie : ");
                for (int i = 0; i < addMovie04.length; i++) {
                    System.out.println(addMovie04[i]);
                }
            } else {
                System.out.println("Invalid input!");
            }

        } else if (category == 2) {
            System.out.println("Please choose the TV Series you want to watch : ");
            for (int i = 0; i < tvseriesName.length; i++) {
                System.out.println(i + 1 + "." + tvseriesName[i]);
            }
            System.out.print("Your choice : ");
            System.out.println("");
            index = input.nextInt();
            if (index == 1) {
                System.out.println("You choose " + tvseriesName[index - 1]);
                System.out.println("Here is the detail of the TV Series : ");
                for (int i = 0; i < addTVSeries01.length; i++) {
                    System.out.println(addTVSeries01[i]);
                }
            } else if (index == 2) {
                System.out.println("You choose " + tvseriesName[index - 1]);
                System.out.println("Here is the detail of the TV Series : ");
                for (int i = 0; i < addTVSeries02.length; i++) {
                    System.out.println(addTVSeries02[i]);
                }
            } else {
                System.out.println("Invalid input!");
            }
            
        } else if (category == 3) {
            System.out.println("Please choose the Documentary you want to watch : ");
            for (int i = 0; i < documentariesName.length; i++) {
                System.out.println(i + 1 + "." + documentariesName[i]);
            }
            System.out.print("Your choice : ");
            System.out.println("");
            index = input.nextInt();
            if (index == 1) {
                System.out.println("You choose " + documentariesName[index - 1]);
                System.out.println("Here is the detail of the Documentary : ");
                for (int i = 0; i < addDocumentaries01.length; i++) {
                    System.out.println(addDocumentaries01[i]);
                }
            } else if (index == 2) {
                System.out.println("You choose " + documentariesName[index - 1]);
                System.out.println("Here is the detail of the Documentary : ");
                for (int i = 0; i < addDocumentaries02.length; i++) {
                    System.out.println(addDocumentaries02[i]);
                }
            } else {
                System.out.println("Invalid input!");
            }

        } else {
            System.out.println("Invalid input!");
        }
        input.close();

    }
}
