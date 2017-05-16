public class Alg_1 {
    private int[] list_CPU;
    private int complexity;
    private boolean flag;

    public Alg_1(int[] list_CPU, int complexity) {
        this.list_CPU = list_CPU;
        this.complexity = complexity;
    }

    public boolean run(){
        for (int j = 0; j < CPU.cpu.length; j++) {
            if (!CPU.cpu[j].isAvailability())
                CPU.cpu[j].run();
        }
        int i = 0;
        do {
            flag = find_CPU(i);
            i++;
        } while (i < 5 && !flag && i < list_CPU.length);
        if (flag)
            return true;
        else
            return false;
    }

    private boolean find_CPU(int i){
        for (int j = 0; j < CPU.cpu.length; j++) {
            if (list_CPU[i] == CPU.cpu[j].getNumber() && CPU.cpu[j].isAvailability()){
                CPU.cpu[j].setAvailability(false);
                CPU.cpu[j].first_run(complexity);
                return true;
            }
        }
        return false;
    }
}
