import java.util.ArrayList;

public class Main {
    public static int solved_tasks;
    public static int sum_operation;
    static {
        solved_tasks = 0;
        sum_operation = 0;
    }

    public static void main(String[] args) {
        boolean flag;
        int i = 0;
        while ( i < 10000) {
            flag = false;
            int[] list_CPU = random_list();
            int complexity = (int) (50 + Math.random() * 950);
            Alg_1 alg = new Alg_1(list_CPU, complexity);
            while (!flag && i < 10000) {
                flag = alg.run();
                i++;
            }
            if (i >= 10000) break;
        }
        System.out.println(solved_tasks + " " + sum_operation);
    }



    private static int[] random_list(){
        int[] list_CPU;
        int length_of_list_CPU;
        length_of_list_CPU = (int) (1 + Math.random() * 4);
        list_CPU = new int[length_of_list_CPU];
        boolean flag;
        int curent;
        for (int i = 0; i < length_of_list_CPU; i++) {
            flag = true;
            curent = (int) (Math.random() * 5);
            while (flag) {
                for (int j = 0; j <= i; j++) {
                    if (curent == list_CPU[j]) {
                        curent++;
                        flag = true;
                        break;
                    }
                    flag = false;
                }
            }
            list_CPU[i] = curent;
        }

        return list_CPU;
    }
}
