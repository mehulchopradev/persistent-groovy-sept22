def n = 89

//
// i = 0 ------- 89
// while loop
/* def i = 0
while (i <= n) {
    if (i % 2) {
        println i
    }
    i++
} */

// for loop
/* for (def i = 0; i <= n; i++) {
    if (i % 2) {
        println i
    }
} */

// groovy for loop
/*
    for (def v in <<sequence of elements>>) {
        // I1
        // I2
    }
 */

// odd number till n
// Sequence of elements --- 0..n
for (def v in 0..n) {
    if (v % 2) {
        println v
    }
}