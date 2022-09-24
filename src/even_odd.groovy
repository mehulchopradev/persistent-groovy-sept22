def evenOdd(n) {
    if (n % 2) { // groovy truthy / falsy
        'Is odd'
    } else {
        'Is even'
    }
}

def n = 10
println "Ans ${evenOdd n}"