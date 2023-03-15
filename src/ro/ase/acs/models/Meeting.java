package ro.ase.acs.models;

public class Meeting implements Cloneable {
    private String name;
    private int startTime;
    private int endTime;
    private int duration;

    public Meeting() {
        this.name=" ";
        this.startTime=0;
        this.endTime=0;
    }
    public Meeting(String name, int startTime, int duration) {
        this.name = name;
        this.startTime = startTime;
        this.endTime=startTime+duration;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private String[] participants =null;

    public String [] getParticipants()
    {
        if(participants==null) {
            return null;
        }

        String[] copy= new String[participants.length];
        for(int i=0; i< participants.length; i++) {
            copy[i]=new String(participants[i]);
        }
        return copy;
    }
    public void setParticipants(String[] participants)
    {
        if(participants==null) {
            this.participants=null;
        }
        else {
            this.participants=new String[participants.length];
            for(int i=0; i< participants.length; i++) {
                this.participants[i]=new String(participants[i]);
            }
        }
    }

    public boolean checkParticipant(String participant) {
        if (participants == null) {
            return false;
        }
        for (String p : participants) {
            if (p.equals(participant)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Meeting clone() throws CloneNotSupportedException {
        Meeting copy = (Meeting)super.clone();
        copy.name = name;
        copy.startTime = startTime;
        copy.endTime = endTime;
        copy.participants = participants == null ? null : participants.clone();
        return copy;
    }

}



