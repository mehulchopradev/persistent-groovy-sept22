/*
Grade chart
>= 70 - A
>= 60 < 70 - B
>= 40 < 60 - C
< 40 - F
< 0 or > 100 - I
 */

// if - else if - else if - else
/* def calculateGrade(marks) {
    def grade
    if (marks < 0 || marks > 100) {
        grade = 'I'
    } else if (marks >= 70) {
        grade = 'A'
    } else if (marks >= 60) {
        grade = 'B'
    } else if (marks >= 40) {
        grade = 'C'
    } else {
        grade = 'F'
    }
    grade
} */

// switch case
def calculateGrade(marks) {
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

def marks = 78000
println "your grade is ${calculateGrade marks}"