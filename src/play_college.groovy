import com.abc.salary.SalaryProcessor
import com.rise1116.college.domain.Student
import com.rise1116.college.domain.Professor

def i = 10
def s1 = new Student(name: 'mehul', gender: 'm' as Character, roll: 10, marks: 90)
def p1 = new Professor(name: 'jane', gender: 'f' as Character, subjects: ['Physics', 'Chemistry'],
        costPerDay: 5000, daysWorkedInMonth: 15)
// println SalaryProcessor.calculate(p1)
println p1.calculate()

println i

println s1
// Internally
// println s1.toString()

println p1


// println s1.gender
// println p1.subjects

// println s1.getDetails()
// println p1.getDetails()