/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author dweep
 */
public class TestUserProfile {
public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] genres = {
            "Action", "Comedy", "Drama",
            "SciFi", "Horror"
        };

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.println("\nSelect your favourite genre:");

        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }

        System.out.print("Enter choice: ");
        int choice = input.nextInt();                         
                                                    added comment from github 
        String favouriteGenre = genres[choice - 1];

        System.out.println("\nUser Profile Created!");
        System.out.println("Name: " + name);
        System.out.println("Favourite Genre: " + favouriteGenre);

        input.close();
    }
}
