package corejava2;

public class AutoBoxing {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            long long1=87987;
            double double1=9898.987;
            Long longWrap=long1;
            Double doubleWrap=double1;
            System.out.println(longWrap+" "+doubleWrap);

            long long2=longWrap;
            double double2=doubleWrap;
            System.out.println(long2+" "+double2);
        }

    }
