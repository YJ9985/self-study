package lang.math.test;

public class LottoGeneratorMain {

    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();
        int[] lottonumbs = lottoGenerator.generate();

        System.out.println("lottonumbs: ");
        for (int i = 0; i < lottonumbs.length; i++) {
            System.out.print(lottonumbs[i] + " ");
        }
    }
}
