// Every class is represented in the memory as a single object of data type Class
// 1 Class object per class (built in classes or user define classes)

// Groovy bean
class Student {
    // instance (object) variables
    // prefer explicit data typing when declaring instance variables in a groovy class
    String name
    Character gender
    Integer roll
    Float marks

    // Class object variables
    static Integer count = 0

    // default constructor
    /*
     Student(Student this) {
        // this --> current object
        // return this
     }
     */

    // constructor automatically available in every groovy bean
    /* Student(Map map) {
        this.name = map['name']
        this.gender = map['gender']
        this.roll = map['roll']
        this.marks = map['marks']
    } */

    Student(String name=null, Character gender=null, Integer roll=null, Float marks=null) {
        // this ---> current object
        this.name = name
        this.gender = gender
        this.roll = roll
        this.marks = marks

        Student.count++
    }

    static Student newInstance(String name=null, Character gender=null, Integer roll=null, Float marks=null) {
        println this // Class object for the class Student
        new Student(name, gender, roll, marks)
    }

    // prefer explicit data typing when declaring methods in a groovy class
    String getDetails() {
        // this --> current object
        "Name: ${this.name}\nGender: ${this.gender}\nRoll: ${this.roll}\nMarks: ${this.marks}"
        // "Name: ${name}\nGender: ${gender}\nRoll: ${roll}\nMarks: ${marks}"
    }

    // Internally
    /* String getDetails(Student this) {
        // this -- s1, s2, current object
    } */

    Character getGrade() {
        def grade

        // TODO: check on step size
        switch (this.marks) {
            case (0.0..<40.0).by(0.1): grade = 'F'
                break
            case (40.0..<60.0).by(0.1): grade = 'C'
                break
            case (60.0..<70.0).by(0.1): grade = 'B'
                break
            case (70.0..100.0).by(0.1): grade = 'A'
                break
            default: grade = 'I'
        }

        grade
    }
}
