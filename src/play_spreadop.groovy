// spread operator (*)

def l1 = [3, 5, 7]
def l2 = [10, 5, *l1, 8, 2]
println l2

def perimeterRectangle(length, breadth) {
    2 * (length + breadth)
}
def stats = [8, 4]
println perimeterRectangle(stats[0], stats[1])
println perimeterRectangle(stats)


def nextGenAdd(...args) {
    return args.sum()
}

println nextGenAdd(3, 4)
println nextGenAdd(5, 8, 3, 5, 9)

// spread dot operator (*.)
def students = [
        new Student('mehul', 'm' as Character, 10, 90),
        new Student('jane', 'f' as Character, 6, 80),
        new Student('jill', 'f' as Character, 14, 95),
        new Student('rock', 'm' as Character, 19, 78),
        new Student('rahul', 'm' as Character, 13, 70)
]

// create a new list of only the names of the students from the above list
// def names = students.name
def names = students*.name
println names

// create a new list
// Output of calling the getDetails() on each student object
def l = students*.getDetails()
println l