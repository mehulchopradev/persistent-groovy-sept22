// autoimported
// java.lang
// java.util

/* def students = [
        new Student('mehul', 'm' as Character, 10, 90),
        new Student('jane', 'f' as Character, 6, 80),
        new Student('jill', 'f' as Character, 14, 95),
        new Student('rock', 'm' as Character, 19, 78),
        new Student('rahul', 'm' as Character, 13, 70)
] */

def studentsMap = [
        10: new Student('mehul', 'm' as Character, 10, 90),
        6: new Student('jane', 'f' as Character, 6, 80),
        14: new Student('jill', 'f' as Character, 14, 95),
        19: new Student('rock', 'm' as Character, 19, 78),
        13: new Student('rahul', 'm' as Character, 13, 70)
]

// take as user input the roll number on the basis of which the user wants to search for a Student
// If Student found, print the details of the student
// If Student not found, print "Student not found"

def scanner = new Scanner(System.in)
println "Please enter roll number to search: "
def roll = scanner.nextInt()

// def foundStudent = students.find {it.roll == roll}
// foundStudent ? println(foundStudent.getDetails()) : println("Student not found")

def foundStudent = studentsMap[roll]
println(foundStudent ? foundStudent.getDetails() : "Student not found")