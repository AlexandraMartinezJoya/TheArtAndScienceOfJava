import acm.program.ConsoleProgram;

public class BinaryToDecimalCalculator extends ConsoleProgram {

        public void run(){
            //This program converts from binary to decimal
            //int decimalValue = readInt();
            int maxBiinaryValue = 11111111;
            int minBinaryValue = 00000000;
            String test1 = "11111111";
            int test2 = 00000010;
            calculateBinaryToDecimal(test1);

        }

        private int calculateBinaryToDecimal(String binaryValue){
            String myBinaryValue = binaryValue + "";
            String myDecimalValue = "";

            if(myBinaryValue.length() != 8) {
                println("Invalid format for Binary Value");
            } else {
                String lastDigit = myBinaryValue.substring(7, 8);
                int digits = 0;
                if(lastDigit.equals("1")){
                    //is Palindome
                    int numberOne = 1;
                    digits += numberOne;
                } else{
                    int numberOne = 0;
                }
                String SeventhDigit = myBinaryValue.substring(6,7);
                if(SeventhDigit.equals("1")){
                    int numberTwo = 2;
                    digits += 2;
                } else {
                    digits += 0;
                }
                String SixthDigit = myBinaryValue.substring(5,6);
                if(SixthDigit.equals("1")){
                    int numberThree = 4;
                    digits += numberThree;
                } else {
                    digits += 0;
                }
                String FifthDigit = myBinaryValue.substring(4,5);
                if(FifthDigit.equals("1")){
                    int numberFour = 8;
                    digits += numberFour;
                } else {
                    digits += 0;
                }
                String FourthDigit = myBinaryValue.substring(3, 4);
                if(FourthDigit.equals("1")){
                    int numberFive = 16;
                    digits += numberFive;
                } else {
                    digits += 0;
                }
                String ThirdDigit = myBinaryValue.substring(2,3);
                if(ThirdDigit.equals("1")) {
                    int numberSix = 32;
                    digits += numberSix;
                } else {
                    digits += 0;
                }
                String SecondDigit = myBinaryValue.substring(1,2);
                if(SecondDigit.equals("1")){
                    int numberSeven = 64;
                    digits += numberSeven;
                } else {
                    digits += 0;
                }
                String FirstDigit = myBinaryValue.substring(0,1);
                if(FirstDigit.equals("1")){
                    int numberEight = 128;
                    digits += numberEight;
                } else {
                    digits += 0;
                }

                println(digits);
            }
            return 1;
        }
}
