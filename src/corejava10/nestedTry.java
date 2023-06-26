package corejava10;
import java.util.Scanner;
public class nestedTry {
    static void  nestedTry()
    {
        try {
            throw new ArithmeticException("Arithematic exception");
        } catch (ArithmeticException e) {
                e.printStackTrace();

            }
        }

        }
