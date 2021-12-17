package lesson2;

package java2core;

public class Main {
    public static void main(String[] args) {
        String [][] twoDimArray= {
                {1,2,3,4},
                {2,3,4,5},
                {3,5,6,5},
                {4,6,2,4},
        };

        System.out.println(sumTheArray(twoDimArray));
    }

    public static <MyArrayDataException extends Throwable> int sumTheArray(String twoDimArray[][]) throws MyArrayDataException {
        int sumArray = 0;
        if(twoDimArray[0].length > 4){
            try {
                throw new MyArraySizeException();
            } catch (MyArraySizeException е) {
                System.out.println("Catch block");
            }
        }

        for (int i = 0; i < twoDimArray[0].length; i++) {
            for (int j = 0; j < twoDimArray[0].length; j++) {
                sumArray = Integer.parseInt(sumArray+ twoDimArray[i][j]);
            }
        }

        return sumArray;
    }

    private static class MyArraySizeException extends Throwable {
        public MyArraySizeException() {
        }
    }

}



