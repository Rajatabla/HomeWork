package javaHW291024;


public interface JobActions {

    void doTask(Task task);

    void haveRest();


    class Task {

        private String name;

        private String description;

        public Task(
                String name,
                String description
        ) {
            this.name = name;
            this.description = description;
        }

        public String getName() {
            return this.name;
        }

        public String getDescription() {
            return this.description;
        }
        @Override
        public String toString(){
            return "Task: "+ this.name  + " - " + this.description;
        }
    }
}





