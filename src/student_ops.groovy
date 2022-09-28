/*
    getDetails
        - name, gender, roll, marks
        - return
            "Name: mehul
            Gender: m
            Roll: 10
            Marks: 90"
 */
/* def getDetails(name, gender, roll, marks) {
    "Name: ${name}\nGender: ${gender}\nRoll: ${roll}\nMarks: ${marks}"
} */

def getDetails(Map map) {
    "Name: ${map['name']}\nGender: ${map['gender']}\nRoll: ${map['roll']}\nMarks: ${map['marks']}"
}

/*
    getGrade
        - marks
        - return grade
            >= 70 - A
            >= 60 < 70 - B
            >= 40 < 60 - C
            < 40 - F
            < 0 or > 100 - I
 */
def getGrade(marks) {
    def grade

    switch (marks) {
        case 0..<40: grade = 'F'
            break
        case 40..<60: grade = 'C'
            break
        case 60..<70: grade = 'B'
            break
        case 70..100: grade = 'A'
            break
        default: grade = 'I'
    }

    grade
}

// define a student with name, gender, roll, marks
def name = 'mehul'
def gender = 'm'
def roll = 10
def marks = 89

// call the getDetails() for the above student -- print it
// println getDetails(name, gender, roll, marks)

// call the getGrade() for the above student -- print it
println getGrade(marks)

// println getDetails("jane", 'm', 18, 10)
// println getDetails([name: 'jane', gender: 'm', roll: 18, marks: 10])
// println getDetails([gender: 'm', marks: 10, roll: 18, name: 'jane'])

// println getDetails(name: 'jane', gender: 'm', roll: 18, marks: 10)
// println getDetails(gender: 'm', marks: 10, roll: 18, name: 'jane')

def str = getDetails name: 'jane', gender: 'm', roll: 18, marks: 10
println str
