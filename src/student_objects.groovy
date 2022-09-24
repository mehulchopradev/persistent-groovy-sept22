/* def s1 = new Student()
// Internally
// new ----> RAM (5006)
// Student(5006)

s1.name = 'mehul'
s1.gender = 'm'
s1.roll = 10
s1.marks = 90.0 */

println Student.count // 0

def s1 = new Student('mehul', 'm' as Character, 10, 90.5)
// Internally
// new ----> 5007 (RAM)
// Student('mehul', 'm', 10, 90.0, 5007)

println Student.count // 1

def s2 = new Student()
s2.name = 'Jane'
s2.gender = 'f'
s2.roll = 12
s2.marks = 55.5

/* println s1.name
println s1.gender

println s2.gender
println s2.roll */

println s1.getDetails()
// Internally
// Student.getDetails(s1)

println s2.getDetails()
// Internally
// Student.getDetails(s2)

println s1.getGrade()
// Student.getGrade(s1)

println s2.getGrade()

println Student.count // 2

def s3 = Student.newInstance('rahul', 'm' as Character, 15, 87)
println s3.getDetails()

