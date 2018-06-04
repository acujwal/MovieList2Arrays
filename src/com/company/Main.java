package com.company;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner input = new Scanner(System.in);
        String movieTitle;
        List<String> movieList = new ArrayList<>();

        System.out.println("Please enter Movie Title to store!! Enter Q or q to exit");
        movieTitle = input.nextLine();

        while(!movieTitle.toLowerCase().equals("q")){

            if(movieList.contains(movieTitle)){
                System.out.println("Movie is already added\n ================== ");

            }
            else{

                movieList.add(movieTitle);
            }
            System.out.println("Enter A Movie Title to store.!! Enter Q or q to exit");
            movieTitle = input.nextLine();

        }
        System.out.println("The movies your entered are: \n " );
        for(int i =0;i<movieList.size();i++)
        {
            System.out.println(movieList.get(i));
        }
        System.out.println(" ----- ---- ---- \n Thank You ");
    }
}
