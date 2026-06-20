package testing;

public class SpinnerWithReturnOfCar {
    public static void main(String[] args) {
        String[] spinner = {"|", "/", "-", "\\"};

        while (true) {
            try {
                for (String frame : spinner) {
                    System.out.print("\r" + "Carregando... " + frame);
                    Thread.sleep(250);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(e);
            }
        }
    }
}
