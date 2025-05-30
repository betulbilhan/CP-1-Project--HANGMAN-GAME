

package com.mycompany.betulbilhanproject1;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class HangmanGame {
    public static void Menu(){
        System.out.println("MAIN MENU:");
        System.out.println("-Press 'a' for add new words\n-Press 'n' for add new game\n-Press 's' to see the scores\n-Press 'e' to exit");
        System.out.print("Your choice= ");
    }
    
    
    
    //Method that checks whether the entered value contains a number or not
     public static boolean DigitControl(String s ){
        return s.matches(".*\\d+.*");
    }
    //Method that checks whether the entered value has been entered before
    public static boolean Duplicate(ArrayList <String> TakeWord ){
        boolean b;
        int control=0;
        for(int q=0; q<TakeWord.size()-1; q++){
            for(int w=q+1; w<TakeWord.size(); w++){
                
                if (TakeWord.get(w).equals(TakeWord.get(q))){
                     control++;
                     break;}
                }
        }
        if(control!=0){
            b=true;
        }
        else{
            b=false;
        }
        return b;
        
    }
    //Method that checks whether the entered value complies with the specified rules
    
        
    //Method that checks whether the entered value has been saved before to ArrayList.
    public static boolean UserGuess(Scanner scn, String RandomWord,ArrayList<Character> UserEstimate) {
            System.out.println("Enter a letter");
            String letter =scn.next().toLowerCase();
            UserEstimate.add(letter.charAt(0));
            return RandomWord.contains(letter);
       }
    
    //Method that checks whether the entered value complies with the specified rules
    public static boolean DE(String letter,ArrayList<Character> UserEstimate){
        boolean c=false;
        for(int i=0; i<UserEstimate.size()-1;i++){
            if(UserEstimate.get(i).equals(UserEstimate.get(UserEstimate.size()-1)))
                c=true;
            }
        
        return c;
    }
    //Method that shows the scores she got in which game to the user.
    public static void Score(ArrayList<Integer>Score){
        for (int i = 0; i < Score.size(); i++) {
            System.out.println("You won " + Score.get(i)+ " point from your "+(i + 1) + ". game." );
        }
    }
    
      
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("------------Welcome to the Hangman Game!------------\n\n");
        ArrayList <String> TakeWord= new ArrayList<>();
        ArrayList <Character> UserEstimate= new ArrayList <>();
        ArrayList <Integer> Score= new ArrayList<>();
        
        boolean control=true;
        int score=0;
        
        Menu();
        String action=scn.next().toLowerCase();
        
        while(control){
        switch(action){
            case("a"):{
                System.out.println("Please write \"exit\" when you want to end adding words!");
        String word="";
        
        boolean a=true;
        /*The word adding process will continue until exit is typed. 
        When the word exit is written, the value a will turn into false.
        */
        while(a){
           System.out.print("Enter a word:");
           word=scn.next();
           if(!"exit".equals(word)){
            
           
           TakeWord.add(word);
            
            if(DigitControl(word)==true){
                System.out.println("The words cannot contain any digit! -> "+word);
                System.out.println("Returning to the main menu...");
                TakeWord.remove(word);
                
                word="exit";
                break;
                
                }
            
            if (word.length()<4){
                System.out.println("The words cannot shorter than 4 characters! -> "+word);
                System.out.println("Returning to the main menu...");
                TakeWord.remove(word);
                
                word="exit";
                break;

            }
            
            if(Duplicate (TakeWord)==true && TakeWord.size()!=1){
                System.out.println("The same word cannot be added two or more times! -> "+word);
                System.out.println("Returning to the main menu...");
                TakeWord.remove(word);
                
                word="exit";
                break;
                }
            
            else{
                System.out.println(TakeWord);//CONTROL
                System.out.println(TakeWord+" added");
                
             }
                
            }
           else{
               System.out.println("Returning to main menu...");
               a=false;
               
               
           }
        
               
           
            
            
    }            
        System.out.println(TakeWord);//CONTROL
        System.out.println();
                Menu();
                action=scn.next();
                break;

    }
               
            
            case("n"):{
                Random randomWord=new Random();
                int numOfWord=randomWord.nextInt(TakeWord.size());
                String RandomWord=TakeWord.get(numOfWord);
                int right=RandomWord.length()/2;
                System.out.println("BE READY!!!\n3...\n2...\n1...\nSTART!");
                for(int i=0;i<RandomWord.length();i++){
                        System.out.print("_");
                        
                    }
                int correct=0,num=0;
                int numOfGame=0;
                System.out.println("You have "+right+" rights.");
                while( RandomWord.length()!=correct && right>0){
                    System.out.print("Select one char:");
                String letter =scn.next().toLowerCase();
                //charat0 çünkü stringte girilen ilk harf
                UserEstimate.add(letter.charAt(0));
                    
                if(DE(letter, UserEstimate)&&UserEstimate.size()>1){
                    //charat0 yaptım kullanıcı yanlışlıkla fazla letter girerse ilkini alp göstersin
                    System.out.println("You already entered "+letter.charAt(0));
                    UserEstimate.remove(UserEstimate.size()-1);
                    System.out.println(UserEstimate);//CONTROL
                }
                else{
                    
                    System.out.println(UserEstimate);//CONTROL

                
                 if(RandomWord.contains(letter)){
                    for(int i=0;i<RandomWord.length();i++){
                        if(UserEstimate.contains(RandomWord.charAt(i))){
                            System.out.print(RandomWord.charAt(i));
                            if(UserEstimate.getLast().equals(RandomWord.charAt(i))){
                               correct++;
                               num++;
                            }
                            
                        }
                        else{
                            System.out.print("-");
                        }
                    }
                    System.out.println("\nThere is "+num+"\" "+letter+" \""); 
                    System.out.println("You have "+right+" right.\n");
                    num=0;
                    
                    
                }
                else{
                        right--;
                        System.out.println("There is not \" "+ letter+" \"\nYou have "+right+" right.");
                }
                }
                
                }
                if(right==0){
                    System.out.println("All your right is end.\nGame is over...\nReturning to the main menu...");}
                if(RandomWord.length()==correct){
                    score=10;
                    Score.add(score);
                    System.out.println("CONGRATULATIONS! YOU WIN!!!\nYour point is: "+score);
                }
                numOfGame++;
                UserEstimate.clear();
                System.out.println();
                Menu();
                action=scn.next();
                break;}
               
            case("s"):{
                Score(Score);
                System.out.println();
                Menu();
                action=scn.next();
                
                break;}
            
            case("e"):{
                System.out.println("Exitting the program...\nHave a good day!");
                control=false;
                
                break;}
            default:
                System.out.println("Please enter a valid value. For instance: a");
                System.out.println();
                Menu();
                action=scn.next();
            
        }
        
        
                

        
        
        }
    
        
        
        
        
        
    }
}
