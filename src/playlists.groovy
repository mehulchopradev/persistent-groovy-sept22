// ordered collection of marks scored in a class out of 10
// List data structure at the language level

def marks = [5, 6, 4, 5, 8, 10, 1, 6]
def el = []

println marks.class
println el.class

println marks[0]
println marks[2]
println marks[-1]

marks[-2] = 3
println marks

def firstThreeStudents = marks[0..2]
println firstThreeStudents

// insert a new element in the list
marks.add(2)
println marks

marks.add(2, 7)
println marks

marks << 1 // marks.add(1)
println marks

// marks.addAll([3, 6])
marks << 3 << 6
println marks

println marks.pop()
println marks
println marks.pop()
println marks

println marks.remove(1)
println marks

println marks.reverse()
println marks

// in membership
println 10 in marks
println 0 in marks

marks.push(10)
println marks

println marks.removeLast()
println marks

println marks.unique(false)
println marks

def m1 = [1, 3, 5]
def m2 = [3, 5, 10]

// intersection of the marks in the two divisions
def m3 = m1.intersect(m2)
println m3

def m4 = m1 - m2
println m4
println m2 - m1

def m5 = m1 + m2
println m5

def schoolMarks = [
        [4, 5, 6],
        [1, 4, 6],
        [6, 7, 3]
]

def l = schoolMarks.flatten()
println l
println l.max()
println l.min()
println l.unique(false)
println l.sum()

def ll = [1] * 10
println ll

for(def m in marks) {
    println m
}


