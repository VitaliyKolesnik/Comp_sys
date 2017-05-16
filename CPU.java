public class CPU {

    private int power;
    private int number;
    private boolean availability;
    private int complexity;
    public final static CPU[] cpu = new CPU[5];

    static{
        cpu[0] = new CPU(0, 5);
        cpu[1] = new CPU(1, 13);
        cpu[2] = new CPU(2, 15);
        cpu[3] = new CPU(3, 19);
        cpu[4] = new CPU(4, 26);
    }

    public CPU(int number, int power) {
        this.power = power;
        this.number = number;
        availability = true;

    }

    public void first_run(int complexity){
        this.complexity = complexity;
        this.complexity -= power;
        if (this.complexity > 0)
            Main.sum_operation += power;
        if (this.complexity <= 0) {
            Main.sum_operation += power + this.complexity;
            availability = true;
            Main.solved_tasks++;
        }
    }

    public void run(){
        complexity -= power;
        if (complexity > 0)
            Main.sum_operation += power;
        if (complexity <= 0) {
            Main.sum_operation += power + complexity;
            availability = true;
            Main.solved_tasks++;
        }
    }

    public int getPower() {
        return power;
    }

    public int getNumber() {
        return number;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
