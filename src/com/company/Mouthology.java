package com.company;

class MouthoLogy {
    public static void main(String[] args) {
        Person professor = Person.getBuilder().setProfession("Scientist").setBiology(true).setEcology(true)
                .setEscapology(false).setGeography(true).getPerson();
        System.out.println(professor.toString());
        Person saylor = Person.getBuilder().setProfession("saylor")
                .setEscapology(true).setSwiminology(true).getPerson();
        System.out.println(saylor);
    }
}

class Person {
    private String profession = "";

    public boolean isBiology() {
        return biology;
    }

    public boolean isEcology() {
        return ecology;
    }

    public boolean isGeography() {
        return geography;
    }

    public boolean isSwiminology() {
        return swiminology;
    }

    public boolean isEscapology() {
        return escapology;
    }

    public boolean isMouthology() {
        return mouthology;
    }

    public static Builder getBuilder(){
        return new Person().new Builder();
    }

    private boolean biology;
    private boolean ecology;
    private boolean geography;
    private boolean swiminology;
    private boolean escapology;
    private boolean mouthology;

    @Override
    public String toString() {
        return "Person{" +
                "profession='" + profession + '\'' +
                ", biology=" + biology +
                ", ecology=" + ecology +
                ", geography=" + geography +
                ", swiminology=" + swiminology +
                ", escapology=" + escapology +
                ", mouthology=" + mouthology +
                '}';
    }

    public class Builder {

        public Builder setProfession(String profession) {
            Person.this.profession = profession;
            return this;
        }

        public Builder setBiology(boolean biology) {
            Person.this.biology = biology;
            return this;
        }

        public Builder setEcology(boolean ecology) {
            Person.this.ecology = ecology;
            return this;
        }

        public Builder setGeography(boolean geography) {
            Person.this.geography = geography;
            return this;
        }

        public Builder setSwiminology(boolean swiminology) {
            Person.this.swiminology = swiminology;
            return this;
        }

        public Builder setEscapology(boolean escapology) {
            Person.this.escapology = escapology;
            return this;
        }

        public Builder setMouthology(boolean mouthology) {
            Person.this.mouthology = mouthology;
            return this;
        }

        public Person getPerson() {return Person.this;}
    }
}
