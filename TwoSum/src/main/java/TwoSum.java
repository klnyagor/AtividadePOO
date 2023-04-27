/**
 *
 * @author Yagor
 */
import java.util.Scanner;
public class TwoSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o tamanho do vetor: ");
        int[] nums = new int[sc.nextInt()];
        for(int i=0;i<nums.length;i++){
            System.out.printf("Informe o valor do vetor[%d]: ",i);
            nums[i] = sc.nextInt();
        }
        System.out.print("Informe o valor do target: ");
        int target = sc.nextInt();

        int[] resultado = new Solution().twoSum(nums, target);
        System.out.println("["+resultado[0]+","+resultado[1]+"]");
        
        sc.close();
    }
}
