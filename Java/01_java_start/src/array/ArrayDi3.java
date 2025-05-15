package array;

public class ArrayDi3 {
    public static void main(String[] args) {
        //new int[][]: 생략가능
        int[][] arr = new int[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        //arr.length: 가로(행) 길이, arr[i].length: 행 안에 몇 개의 값(열)이 있는지
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
