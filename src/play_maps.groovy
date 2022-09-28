def eid = 'E020'

def employeeMap = ['E001': 'Mehul', 'E005': 'Jane', (eid): 'John']
def emap = [:]

// insert new entry
employeeMap.put('E010', 'Jill')
employeeMap['E015'] = 'Rahul'
println employeeMap

println employeeMap.get('E005')
println employeeMap['E005']

// updating existing entry
employeeMap['E001'] = 'Roger'
println employeeMap

println employeeMap.size()
println employeeMap.keySet()
println employeeMap.values()

/* for (def v in employeeMap) {
    println v.getKey()
    println v.getValue()
} */


// print all the entries from the map
// Name: Roger
// Emp Id: E001
// ------------
// Name: Jane
// Emp Id: E005
//-------------
employeeMap.each {employeeId, name ->
    println "Name: ${name}\nEmp Id: ${employeeId}"
    println "-------------"
}


def studentsMap = [
        10: new Student('mehul', 'm' as Character, 10, 90),
        6: new Student('jane', 'f' as Character, 6, 80),
        14: new Student('jill', 'f' as Character, 14, 95),
        19: new Student('rock', 'm' as Character, 19, 78),
        13: new Student('rahul', 'm' as Character, 13, 70)
]

// Create a new map of all the female students from the above students map (filtering)
def m2 = studentsMap.findAll {roll, student -> student.gender == 'f'}
println m2

// Create a new map of all the male students from the above students map.
// The new map must consist of key -> roll, value -> Name of the student (filtering + mapping)
def m3 = studentsMap.findAll {roll, student -> student.gender == 'm'}
        .collectEntries {roll, student -> [roll, student.name]}
println m3

// Create a new map
// key -> gender
// value -> number of students with that gender
// ['m': 3, 'f': 2]
def m4 = studentsMap.countBy {roll, student -> student.gender}
println m4

// Create a new map
// where all the entries are grouped by gender
def m5 = studentsMap.groupBy {roll, student -> student.gender}
println m5

// Create a new map from the studentsMap sorted in the descending order of marks
def m6 = studentsMap.sort {s1, s2 -> s2.value.marks <=> s1.value.marks}
    .collectEntries {roll, student -> [roll, [student.name, student.marks]]}
println m6