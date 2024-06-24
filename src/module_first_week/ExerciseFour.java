package module_first_week;

import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter your first score: ");
        double firstScore=input.nextInt();
        System.out.print("Enter level first score: ");
        int levelFirstScore=input.nextInt();
        System.out.print("Enter your second score: ");
        double secondScore=input.nextInt();
        System.out.print("Enter level second score: ");
        int levelSecondScore=input.nextInt();
        System.out.print("Enter your third score: ");
        double thirdScore=input.nextInt();
        System.out.print("Enter level third score: ");
        int levelThirdScore=input.nextInt();

        double result= CalculationScore(firstScore,secondScore,thirdScore,levelFirstScore,levelSecondScore,levelThirdScore);

        System.out.print("Your total score is: "+result);
    }

    public static double CalculationScore(double firstScore,double secondScore,double thirdScore,int levelFirstScore,int levelSecondScoreScore, int levelThirdScore){

        return (firstScore * levelFirstScore  + secondScore * levelSecondScoreScore + thirdScore * levelThirdScore) / (levelFirstScore + levelSecondScoreScore +  levelThirdScore);
    }
}

