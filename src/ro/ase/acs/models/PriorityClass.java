package ro.ase.acs.models;

public class PriorityClass {
    private Priority priority;

    public PriorityClass (){
        this.priority=Priority.low;
    }
    public PriorityClass (Priority priority){
        this.priority=priority.low;
    }
}
