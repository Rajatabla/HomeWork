package javaHW291024;


public class Office {

    public static void main(String[] args) {


        JobActions.Task task1 = new JobActions.Task("Prepare", "Prepare Report");
        JobActions.Task task2 = new JobActions.Task("Draw", "Draw Diagram");
        JobActions.Task task3 = new JobActions.Task("Dictate","Dictate Text");

        JobActions manager = new JobActions() {
            @Override
            public void doTask(Task task) {
                System.out.println("Tells to do: " + task);
            }

            @Override
            public void haveRest() {
                System.out.println("Manager drinks coffee");
            }
        };

        JobActions worker = new JobActions() {
            @Override
            public void doTask(Task task) {
                System.out.println("Doing task: " + task);
            }

            @Override
            public void haveRest() {
                System.out.println("Worker smokes");
            }
        };

        JobActions lazyWorker = new JobActions() {
            @Override
            public void doTask(Task task) {
                System.out.println("Not doing: " + task);
            }

            @Override
            public void haveRest() {
                System.out.println("LazyWorker is always resting");
            }
        };
        System.out.println("MANAGER");
        manager.doTask(task1);
        manager.haveRest();
        System.out.println();

        System.out.println("WORKER");
        worker.doTask(task2);
        worker.haveRest();
        System.out.println();

        System.out.println("LAZY WORKER");
        lazyWorker.doTask(task3);
        lazyWorker.haveRest();

    }

}
