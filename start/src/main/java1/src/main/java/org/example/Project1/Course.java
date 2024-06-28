package org.example.Project1;

public class Course {
    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    private String session;
    private String branch;

    @Override
    public String toString() {
        return "Course{" +
                "session='" + session + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
}
