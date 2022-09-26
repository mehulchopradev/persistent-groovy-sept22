// defining a code inside another code
def abc() {
    // i --> abc
    def i = 10

    // pqr --> abc
    def pqr = {
        // j --> pqr
        def j = 90
        j + 10 + it - i // accessing enclosing function data
    }

    pqr(20) - i
}

println abc()

// returning a code from another code
def xyz(i) {
    // j --> xyz
    def j = 10

    // k --> xyz
    def k = 20

    // mno --> xyz
    def mno = {
        // a closure remembers its surrounding scope data even when the code in which it is defined
        // is returned!
        (it ** j) + k - i
    }

    mno
}

// f --> entire script file
def f = xyz(10)
println "Hello world"
println "Good night"
println f(2)

// passing code as a parameter to another code
// qwe --> entire file
def qwe(func) {
    def i = 2
    func(i, 3)
}

// asd --> entire file
def asd = {a, b ->
    (a ** b) + b
}

println qwe(asd)
