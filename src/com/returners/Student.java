package com.returners;

public class Student {

    private final String name;

    private final Group group;

    private Grade grade;

    private String secretNickName;

    private final static String defaultNickName;

    static {
        defaultNickName = " MySecretNickName ";
    }


    public Student(String name, Group group, Grade grade) {
        this.name = name;
        this.group = group;
        this.grade = grade;
        this.secretNickName = defaultNickName;
    }


    public void downgrade() {
        switch (grade) {
            case A -> this.grade = Grade.B;
            case B -> this.grade = Grade.C;
            case C -> this.grade = Grade.D;
            case D -> this.grade = Grade.E;
            case E -> this.grade = Grade.F;
        }
    }

    public void upgrade() {
        switch (grade) {
            case B -> this.grade = Grade.A;
            case C -> this.grade = Grade.B;
            case D -> this.grade = Grade.C;
            case E -> this.grade = Grade.E;
            case F -> this.grade = Grade.D;
        }
    }


    public String getName() {
        return name;
    }

    public Group getGroup() {
        return group;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setSecretNickName(String secretNickName) {
        this.secretNickName = secretNickName;
    }

    @Override
    public String toString() {
        return String.format(" Student  information :  Name %s   Group %s   Grade %s", name, group.getGroupValue(), grade);
    }
}
