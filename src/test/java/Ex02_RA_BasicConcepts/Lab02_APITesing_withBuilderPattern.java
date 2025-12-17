package Ex02_RA_BasicConcepts;

public class Lab02_APITesing_withBuilderPattern {
    public Lab02_APITesing_withBuilderPattern step1() {
        System.out.println("Step 1");
        return this;
    }

    public Lab02_APITesing_withBuilderPattern step2() {
        System.out.println("Step 2");
        return this;
    }


    public Lab02_APITesing_withBuilderPattern step3(String param1) {
        System.out.println("Step 3");
        return this;
    }

    public static void main(String[] args) {
        Lab02_APITesing_withBuilderPattern bp = new Lab02_APITesing_withBuilderPattern();
        bp.step1().step2().step3("Pramod");
    }
}
