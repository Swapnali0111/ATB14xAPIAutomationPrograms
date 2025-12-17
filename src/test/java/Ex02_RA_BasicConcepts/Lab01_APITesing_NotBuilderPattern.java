package Ex02_RA_BasicConcepts;

public class Lab01_APITesing_NotBuilderPattern {
    public void step1() {
        System.out.println("Step 1");

    }

    public void step2() {
        System.out.println("Step 2");
    }


    public void step3(String param1) {
        System.out.println("Step 3");
    }

    public static void main(String[] args) {
        Lab01_APITesing_NotBuilderPattern np = new Lab01_APITesing_NotBuilderPattern();
        np.step1();
        np.step2();
        np.step3("Swapnali");
    }
}
