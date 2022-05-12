public class IfElseColumnMethod {
    public static void main(String[] args) {
        int number=10;
        //The ternary operator has the limitation that it must print out smthg, cant use it to print things
       // number>10?System.out.println("Number is greater"):System.out.println("Number is smaller")
    }
    int maxNumber(int num1, int num2){
        /*if(num1>num2){  // If else condition we always use to check the biggest number
            return num1;
        }else{
            return num2;
        }*/
        int maxNum=num1>num2?num1:num2;
        //num1>num2 - is the condition part: if(num1>num2)
        //if number one is greater it will store num1
        //:-colon that separates the condition =else num2 is greater
        return maxNum;
    }
}

