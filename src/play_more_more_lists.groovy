def marks = [6, 7 ,4, 6, 10, 9, 8, 7, 3, 8, 0]

// Create a new list object
// elements -> all the even marks more than 4 from the marks list above
// print the list object
// filtering operation

/* def l1 = []
marks.each {
    if (it % 2 == 0 && it > 4) {
        l1 << it
    }
}
println l1 */

// filtering --> findAll

def l1 = marks.findAll {it % 2 == 0 && it > 4}
println l1

// create a new list consisting of odd number more than 3 or students who have scored 10 marks from the marks list
def l2 = marks.findAll {(it % 2 && it > 3) || it == 10}
println l2

// Create a new list object
// elements -> All the marks from the marks list deducted by 1
// Mapping operation
def l3 = marks.collect {it - 1}
println l3


// Create a new list object
// elements
    // 1. Filter out all the marks from the marks list that are less than 6
    // 2. Add 1 mark to each of them
def l4 = marks.findAll {it < 6}.collect {it + 1}
println l4

// Find out whether every student in the marks list has scored more than 2 marks or no
println marks.every {it > 2}
// println marks.any {it <= 2}

// sort all the marks from the marks list in a descending order
def l5 = marks.sort(false)
println l5 // ascending order

/* def l6 = marks.sort(false) {a, b ->
    // regular natural ordering
    // if a < b --- -1
    // if a == b --- 0
    // if a > b ---
    b.compareTo(a)
}
println l6
println marks */

// spaceship operator --- compareTo
def l6 = marks.sort(false) {a, b -> b <=> a}
println l6
