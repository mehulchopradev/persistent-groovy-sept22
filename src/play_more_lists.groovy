def marks = [6, 7 ,4, 6, 10, 9, 8, 7, 3, 8, 0]

// common logic
    // looping through the elements of the list
// dynamic logic
    // is being performed on every element of the list by the loop
// Higher order function
/* def forEach(elements, action) {
    for(def element in elements) {
        // dynamic logic to be applied on `element`
        action(element)
    }
} */

// to print all the odd marks scored in the above class
println "********** Odd marks scored ************"
// Functional programming
/* forEach(marks, {mark -> // lower order functions
    if (mark % 2) {
        println mark
    }
}) */

/* forEach(marks, {
    if (it % 2) {
        println it
    }
}) */

/* forEach(marks) {
    if (it % 2) {
        println it
    }
} */

marks.each {
    if (it % 2) {
        println it
    }
}

/* for(def mark in marks) {
    if (mark % 2) {
        println mark
    }
} */

// to print all the even marks more than 2 in the above class
println "*********** Even marks more than 2 ************"

/* forEach(marks, {mark->
    if (mark % 2 == 0 && mark > 2) {
        println mark
    }
}) */

/* forEach(marks) {
    if (it % 2 == 0 && it > 2) {
        println it
    }
} */

marks.each {
    if (it % 2 == 0 && it > 2) {
        println it
    }
}

/* for(def mark in marks) {
    if (mark % 2 == 0 && mark > 2) {
        println mark
    }
} */