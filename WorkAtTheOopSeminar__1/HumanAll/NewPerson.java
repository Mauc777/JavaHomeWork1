package HumanAll;
 class NewPerson extends Person  {
    String fName;
    String lName;

    public NewPerson(String fullName) {
        super(fullName);
    }

    public NewPerson(String firstName, String lastName) {
        super(firstName + lastName);
        fName = firstName;
        lName = lastName;
    }

    // @Override
    // public String getFullName() {

    //     var r = String.format("%s", fName);
    //     return fName;
    // }

    @Override
    public String toString() {
        return "NewPerson [fName=" + fName + ", lName=" + lName + "]";
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
}


