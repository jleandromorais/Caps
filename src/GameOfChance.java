import java.util.Random;

public class GameOfChance {
    private static  final Random randonNumbers=new Random();
    // enumeração com constantes que representam o status do jogo
    private enum Status{CONTINUE,WOW,LOST}

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public void play(){

    int myPoint=0;
    Status gameStatus;

    int sumOfDice=rollDice();

    switch (sumOfDice){
        case SEVEN:
        case YO_LEVEN:
            gameStatus = Status.WOW;
        break;
        case SNAKE_EYES:
        case TREY:
        case BOX_CARS:
            gameStatus=Status.LOST;
            break;
            default:
            gameStatus=Status.CONTINUE;
            myPoint=sumOfDice;
            System.out.println(myPoint);
            break;
    }
    while (gameStatus==Status.CONTINUE){
        sumOfDice=rollDice();

        if (sumOfDice==myPoint)
            gameStatus=Status.WOW;
        else if(sumOfDice==SEVEN)
            gameStatus=Status.LOST;
    }

    if (gameStatus==Status.WOW)
        System.out.println("player wins");
    else
        System.out.println("player lost");

    }
    public int rollDice(){
        int diel1 =1 + randonNumbers.nextInt(6);
        int diel2=1 + randonNumbers.nextInt(6);
        int sum=diel2+diel1;
        System.out.printf("Dado rolado é %d + %d= %d \n",diel1,diel2,sum);
        return sum;
    }
}
