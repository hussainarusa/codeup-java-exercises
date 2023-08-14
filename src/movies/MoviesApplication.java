package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();

        Movie[] movies = MoviesArray.findAll();

        System.out.println("What would you like to do?\n");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");

        int choice = input.getInt(0, 5);

        if (choice == 0) {
            System.out.println("Goodbye!");
            return;
        }

        String category = "";

        switch (choice) {
            case 1:
                break;
            case 2:
                category = "animated";
                break;
            case 3:
                category = "drama";
                break;
            case 4:
                category = "horror";
                break;
            case 5:
                category = "scifi";
                break;
        }

        System.out.println("\nMovies in the " + category + " category:\n");

        for (Movie movie : movies) {
            if (category.equals("") || category.equals(movie.getCategory())) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }
}

