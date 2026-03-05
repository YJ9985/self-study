package lang2.wrapper.test;

public class LottoMain {
    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();
        int[] nums = lottoGenerator.generate();

        System.out.print("Lotto Nums: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
