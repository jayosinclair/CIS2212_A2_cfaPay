public class BillCounter{
    
    private int inputAmount;
    private int num10K;
    private int num5K;
    private int num1K;
    private int num500;
    private int num100;
    private int num50;
    private int num25;
    private int num10;
    private int num5;

    public BillCounter(int inputAmt){

        num10K = -1;
        num5K = -1;
        num1K = -1;
        num500 = -1;
        num100 = -1;
        num50 = -1;
        num25 = -1;
        num10 = -1;
        num5 = -1;

    }

    public int calcNumBills(int inputAmt, int denomination){

        int numBills = -1;

        if (denomination == 0){
            return -1;
        }

        else {

            numBills = inputAmt / denomination;
            inputAmount = inputAmt % denomination;

        }

        return numBills;

    }


    public void setNum10KBills(){

        num10K = calcNumBills(inputAmount, 10000);

    }

    public int getNum10KBills(){
        
        return num10K;

    }


}